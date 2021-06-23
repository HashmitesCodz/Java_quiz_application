import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartQuiz extends JFrame implements ActionListener {
    public static int count = 0;
    public static int timer = 15;
    public static int AnswerGiven = 0;
    public static int Score = 0;

    JButton NextButton, LifeLineButton, SubmitButton;
    JLabel QuestionNumberLabel, QuestionLabel;
    String q[][] = new String[10][5];
    String CorrectAnswers[][] = new String[10][2];
    JRadioButton Option1, Option2, Option3, Option4;
    ButtonGroup OptionsGroup;
    String PersonAnswer[][] = new String[10][1];
    String userName;

    StartQuiz(String userName){
        this.userName = userName;
        setBounds(10, 0, 1350, 765);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/2.JPG"));
        JLabel ImageLabel = new JLabel(imageIcon);
        ImageLabel.setBounds(0, 0, 1350, 340);
        add(ImageLabel);

        QuestionNumberLabel = new JLabel("");
        QuestionNumberLabel.setFont(new Font("Tacoma", Font.PLAIN, 24));
        QuestionNumberLabel.setBounds(100, 420, 40, 30);
        add(QuestionNumberLabel);

        QuestionLabel = new JLabel("");
        QuestionLabel.setFont(new Font("Tacoma", Font.PLAIN, 24));
        QuestionLabel.setBounds(140, 420, 900, 30);
        add(QuestionLabel);

        q[0][0] = "Which is used to find and fix bugs in the Java program?";
        q[0][1] = "JVM";
        q[0][2] = "JDB";
        q[0][3] = "JDK";
        q[0][4] = "JRE";

        q[1][0] = "What is the return type of hashcode() method?";
        q[1][1] = "int";
        q[1][2] = "object";
        q[1][3] = "long";
        q[1][4] = "void";

        q[2][0] = "Which package contains the random class?";
        q[2][1] = "java.util";
        q[2][2] = "java.lang";
        q[2][3] = "java.awt";
        q[2][4] = "java.io";

        q[3][0] = "An interface with no fields or method is known as";
        q[3][1] = "Runnable Interface";
        q[3][2] = "Abstract Interface";
        q[3][3] = "Marker Interface";
        q[3][4] = "CharSequence Interface";

        q[4][0] = "In which memory a string is stored, when we create a string using new operator?";
        q[4][1] = "Stack";
        q[4][2] = "String memory";
        q[4][3] = "Random storage space";
        q[4][4] = "Heap memory";

        q[5][0] = "Which of the following is the marker interface?";
        q[5][1] = "Runnable Interface";
        q[5][2] = "Remote Interface";
        q[5][3] = "Readable Interface";
        q[5][4] = "Result Interface";

        q[6][0] = "Which keyword is used for accessing the features of a package?";
        q[6][1] = "import";
        q[6][2] = "package";
        q[6][3] = "extends";
        q[6][4] = "export";

        q[7][0] = "In java, JAR stands for";
        q[7][1] = "Java Archive Runner";
        q[7][2] = "Java Archive";
        q[7][3] = "Java Application Resource";
        q[7][4] = "Java Application Runner";

        q[8][0] = "Which of the following is the mutable class in java?";
        q[8][1] = "java.lang.StringBuilder";
        q[8][2] = "Java.lang.short";
        q[8][3] = "java.lang.Byte";
        q[8][4] = "java.lang.String";

        q[9][0] = "Which of the following option leads to the portability and security of java?";
        q[9][1] = "Bytecode is executed by JVM";
        q[9][2] = "The applet makes the java code secure and portable";
        q[9][3] = "use of exception handling";
        q[9][4] = "Dynamic binding bw objects";

        CorrectAnswers[0][1] = "JDB";
        CorrectAnswers[1][1] = "int";
        CorrectAnswers[2][1] = "java.util";
        CorrectAnswers[3][1] = "Marker Interface";
        CorrectAnswers[4][1] = "Heap memory";
        CorrectAnswers[5][1] = "Remote Interface";
        CorrectAnswers[6][1] = "import";
        CorrectAnswers[7][1] = "Java Archive";
        CorrectAnswers[8][1] = "java.lang.StringBuilder";
        CorrectAnswers[9][1] = "Bytecode is executed by JVM";

        Option1 = new JRadioButton("");
        Option1.setBounds(170, 480, 700, 30);
        Option1.setFont(new Font("Dialog", Font.PLAIN, 20));
        Option1.setBackground(Color.WHITE);
        add(Option1);

        Option2 = new JRadioButton("");
        Option2.setBounds(170, 530, 700, 30);
        Option2.setFont(new Font("Dialog", Font.PLAIN, 20));
        Option2.setBackground(Color.WHITE);
        add(Option2);

        Option3 = new JRadioButton("");
        Option3.setBounds(170, 580, 700, 30);
        Option3.setFont(new Font("Dialog", Font.PLAIN, 20));
        Option3.setBackground(Color.WHITE);
        add(Option3);

        Option4 = new JRadioButton("");
        Option4.setBounds(170, 630, 700, 30);
        Option4.setFont(new Font("Dialog", Font.PLAIN, 20));
        Option4.setBackground(Color.WHITE);
        add(Option4);

        OptionsGroup = new ButtonGroup();
        OptionsGroup.add(Option1);
        OptionsGroup.add(Option2);
        OptionsGroup.add(Option3);
        OptionsGroup.add(Option4);


        NextButton = new JButton("Next");
        NextButton.setFont(new Font("Tacoma", Font.PLAIN, 22));
        NextButton.setBackground(Color.BLUE);
        NextButton.setForeground(Color.WHITE);
        NextButton.addActionListener(this);
        NextButton.setBounds(1050, 520, 150, 30);
        add(NextButton);

        LifeLineButton = new JButton("50-50");
        LifeLineButton.setFont(new Font("Tacoma", Font.PLAIN, 22));
        LifeLineButton.setBackground(Color.BLUE);
        LifeLineButton.setForeground(Color.WHITE);
        LifeLineButton.addActionListener(this);
        LifeLineButton.setBounds(1050, 580, 150, 30);
        add(LifeLineButton);

        SubmitButton = new JButton("Submit");
        SubmitButton.setFont(new Font("Tacoma", Font.PLAIN, 22));
        SubmitButton.setBackground(Color.BLUE);
        SubmitButton.setEnabled(false);
        SubmitButton.setForeground(Color.WHITE);
        SubmitButton.addActionListener(this);
        SubmitButton.setBounds(1050, 640, 150, 30);
        add(SubmitButton);

        start(0);

    }
    public void paint(Graphics g){
        super.paint(g);
        String time = "Time Left - " + timer;
        g.setColor(Color.red);
        g.setFont(new Font("Tahoma", Font.BOLD, 25));

        if (timer > 0){
            g.drawString(time, 1050, 480);
        }else{
            g.drawString("Times Up !!", 1050, 480);
        }

        timer--;

        try{
            Thread.sleep(1000);
            repaint();

        }catch (Exception e){
            e.printStackTrace();
        }

        if (AnswerGiven == 1){
            AnswerGiven = 0;
            timer = 15;
            }else if (timer < 0){
                timer = 15;
            Option1.setEnabled(true);
            Option2.setEnabled(true);
            Option3.setEnabled(true);
            Option4.setEnabled(true);
                if (count == 8){
                    NextButton.setEnabled(false);
                    SubmitButton.setEnabled(true);
                }
                if (count == 9){
                    if (OptionsGroup.getSelection() == null){
                        PersonAnswer[count][0] = "";
                    }else{
                        PersonAnswer[count][0] = OptionsGroup.getSelection().getActionCommand();
                    }
                    for (int i = 0; i < PersonAnswer.length; i++){
                        if (PersonAnswer[i][0].equals(CorrectAnswers[i][1])){
                            Score+=10;
                        }else{
                            Score+=0;
                        }
                    }
                    this.setVisible(false);
                   new Score(userName, Score).setVisible(true);
                }else{
                    if (OptionsGroup.getSelection() == null){
                        PersonAnswer[count][0] = "";
                    }else{
                        PersonAnswer[count][0] = OptionsGroup.getSelection().getActionCommand();
                    }


                    count++;
                    start(count);
                }
            }
        }




    public void start(int count){
        QuestionNumberLabel.setText("" + (count + 1) + ". ");
        QuestionLabel.setText(q[count][0]);
        Option1.setLabel(q[count][1]);
        Option1.setActionCommand(q[count][1]);
        Option2.setLabel(q[count][2]);
        Option2.setActionCommand(q[count][2]);
        Option3.setLabel(q[count][3]);
        Option3.setActionCommand(q[count][3]);
        Option4.setLabel(q[count][4]);
        Option4.setActionCommand(q[count][4]);
        OptionsGroup.clearSelection();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == NextButton){
            repaint();

            Option1.setEnabled(true);
            Option2.setEnabled(true);
            Option3.setEnabled(true);
            Option4.setEnabled(true);

            AnswerGiven = 1;
            if (OptionsGroup.getSelection() == null){
                PersonAnswer[count][0] = "";
            }else{
                PersonAnswer[count][0] = OptionsGroup.getSelection().getActionCommand();
            }
            timer = 15;
            if (count == 8){
                NextButton.setEnabled(false);
                SubmitButton.setEnabled(true);
            }

            count++;
            start(count);

        }else if(e.getSource() == LifeLineButton){
            if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9){
                Option2.setEnabled(false);
                Option3.setEnabled(false);
            }else{
                Option1.setEnabled(false);
                Option4.setEnabled(false);
            }
            LifeLineButton.setEnabled(false);

        }else if(e.getSource() == SubmitButton){

            AnswerGiven = 1;
            if (OptionsGroup.getSelection() == null){
                PersonAnswer[count][0] = "";
            }else{
                PersonAnswer[count][0] = OptionsGroup.getSelection().getActionCommand();
            }
            for (int i = 0; i < PersonAnswer.length; i++){
                if (PersonAnswer[i][0].equals(CorrectAnswers[i][1])){
                    Score+=10;
                }else{
                    Score+=0;
                }
            }
            this.setVisible(false);
                   new Score(userName, Score).setVisible(true);
        }


    }

    public static void main(String[] args) {
        new StartQuiz("").setVisible(true);
    }


}
