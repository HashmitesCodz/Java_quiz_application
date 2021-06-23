import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener {

    JButton jButton, jButton1;
    String userName;
    Rules(String userName){
        this.userName = userName;
        setBounds(300, 50, 800, 650);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel jLabel = new JLabel("Welcome " + userName);
        jLabel.setForeground(Color.BLUE);
        jLabel.setFont(new Font("Mongoilian Baiti", Font.BOLD, 28));
        jLabel.setBounds(240, 20, 700, 30);
        add(jLabel);

        JLabel jLabel1 = new JLabel();
        jLabel1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        jLabel1.setBounds(30, 60, 600, 500);
        jLabel1.setText(
                    "<html>"+
                            "1. Lorem ipsum dolor sit, amet consectetur adipisicing elit. Totam voluptatibus." + "<br><br>" +
                            "2. Lorem ipsum dolor sit, amet consectetur adipisicing elit. Totam voluptatibus." + "<br><br>" +
                            "3. Lorem ipsum dolor sit, amet consectetur adipisicing elit. Totam voluptatibus." + "<br><br>" +
                            "4. Lorem ipsum dolor sit, amet consectetur adipisicing elit. Totam voluptatibus." + "<br><br>" +
                            "5. Lorem ipsum dolor sit, amet consectetur adipisicing elit. Totam voluptatibus." + "<br><br>" +
                            "6. Lorem ipsum dolor sit, amet consectetur adipisicing elit. Totam voluptatibus." + "<br><br>" +
                            "7. Lorem ipsum dolor sit, amet consectetur adipisicing elit. Totam voluptatibus." + "<br><br>" +
                            "8. Lorem ipsum dolor sit, amet consectetur adipisicing elit. Totam voluptatibus." + "<br><br>" +
                            "9. Lorem ipsum dolor sit, amet consectetur adipisicing elit. Totam voluptatibus." + "<br><br>" +
                            "10. Lorem ipsum dolor sit, amet consectetur adipisicing elit. Totam voluptatibus." + "<br><br>" +
                    "<html>"
        );
        add(jLabel1);

        jButton = new JButton("Back");
        jButton.setBounds(250, 520, 100, 25);
        jButton.setBackground(Color.BLUE);
        jButton.setForeground(Color.WHITE);
        jButton.addActionListener(this);
        add(jButton);

        jButton1 = new JButton("Start");
        jButton1.setBounds(420, 520, 100, 25);
        jButton1.setBackground(Color.BLUE);
        jButton1.setForeground(Color.WHITE);
        jButton1.addActionListener(this);
        add(jButton1);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jButton){
            this.setVisible(false);
            new Main().setVisible(true);
        }else if (e.getSource() == jButton1){
            this.setVisible(false);
            new StartQuiz(userName).setVisible(true);
        }
    }

    public static void main(String[] args){

        new Rules("");
    }


}
