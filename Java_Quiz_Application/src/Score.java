import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame implements ActionListener {
    Score(String userName, int score){
        setBounds(600, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/1.JPG"));
        Image image = imageIcon.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel jLabel = new JLabel(imageIcon);
        jLabel.setBounds(10, 100, 300, 250);
        add(jLabel);

        JLabel jLabel1 = new JLabel("Thanks " + userName + " for your interview");
        jLabel1.setBounds(60, 30, 500, 30);
        jLabel1.setFont(new Font("Raleway", Font.PLAIN, 26));
        add(jLabel1);

        JLabel jLabel2 = new JLabel("Your score is: " + score);
        jLabel2.setBounds(350, 200, 300, 30);
        jLabel2.setFont(new Font("Jokerman", Font.PLAIN, 26));
        jLabel2.setForeground(new Color(199, 21, 133));
        add(jLabel2);

        JButton jButton = new JButton("Take Again");
        jButton.setBackground(Color.BLUE);
        jButton.setForeground(Color.WHITE);
        jButton.addActionListener(this);
        jButton.setBounds(400, 270, 120, 30);
        add(jButton);
    }

    public static void main(String[] args) {
        new Score("", 0).setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.setVisible(false);
        new Main().setVisible(true);

    }
}
