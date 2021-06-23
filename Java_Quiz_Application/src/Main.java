import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {

    JButton jButton, jButton1;
    JTextField jTextField;
    Main(){
        setBounds(150, 100, 1200, 500);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/4.JPG"));
        JLabel jLabel = new JLabel(imageIcon);
        jLabel.setBounds(0, 0, 600, 500);
        add(jLabel);
        JLabel jLabel1 = new JLabel("Quiz Application");
        jLabel1.setFont(new Font("Mongolian Baiti", Font.BOLD, 40));
        jLabel1.setForeground(Color.BLUE);
        jLabel1.setBounds(750, 40, 300, 45);
        add(jLabel1);

        JLabel jLabel2 = new JLabel("Enter Your Name");
        jLabel2.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        jLabel2.setForeground(Color.BLUE);
        jLabel2.setBounds(835, 150, 300, 20);
        add(jLabel2);

        jTextField = new JTextField();
        jTextField.setBounds(755, 200, 290, 25);
        jTextField.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(jTextField);

        jButton = new JButton("Rules");
        jButton.setBounds(755, 250, 100, 25);
        jButton.setBackground(Color.BLUE);
        jButton.setForeground(Color.WHITE);
        jButton.addActionListener(this);
        add(jButton);

        jButton1 = new JButton("Exit");
        jButton1.setBounds(945, 250, 100, 25);
        jButton1.setBackground(Color.BLUE);
        jButton1.setForeground(Color.WHITE);
        jButton1.addActionListener(this);
        add(jButton1);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jButton){
                String name = jTextField.getText();
                this.setVisible(false);
                new Rules(name);
        }else{
            System.exit(0);
        }
    }

    public static void main(String[] args){

        new Main();
    }


}
