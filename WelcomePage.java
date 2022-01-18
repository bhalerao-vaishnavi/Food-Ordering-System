import java.awt.*;
import javax.swing.*; 
import java.awt.event.*; 
import java.awt.Image;
import java.awt.Toolkit;
// import java.awt.Graphics;
public class WelcomePage implements ActionListener{
    
   static JButton login ;
   static JButton signup ;
      public static void main (String a[])
   {
    JFrame frame = new JFrame("FOOD ORDERING SYSTEM");
    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    panel.setLayout(new BorderLayout());
    JLabel label = new JLabel("WELCOME TO FOOD ORDERING SYSTEM");
    signup = new JButton("SIGNUP");
    login = new JButton("LOGIN");
    Image img = Toolkit.getDefaultToolkit().getImage("bgImage.jpg");
    login.addActionListener(new WelcomePage());
    signup.addActionListener(new WelcomePage());

    panel.add(label,BorderLayout.NORTH);
    panel2.add(login);
    login.setFont(new Font("Verdana", Font.BOLD,20));
    login.setBounds(100,20,100,20);
    signup.setFont(new Font("Verdana", Font.BOLD,20));
    panel2.add(signup);
    // panel.add(login,BorderLayout.EAST);
    // panel.add(signin,BorderLayout.WEST);
    panel.add(panel2,BorderLayout.SOUTH);
    frame.add(panel);
    // panel.add(img);
    label.setFont(new Font("Verdana", Font.BOLD,30));
    frame.setLocationRelativeTo(null); 
    frame.setResizable(false); 
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(730,500); 
    frame.setVisible(true);
    }
    // public void paintComponent(Graphics g) {
    //     super.paintComponent(g);
    //     g.drawImage(img, 0, 0, null);
    //  }
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == signup)
        {
             new loginProject();   
        }   
        if(e.getSource() == login)
        {
            new MainLogin();
        }        
    }
}