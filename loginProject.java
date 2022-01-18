import java.awt.*; 
import javax.swing.*;  
import java.awt.event.*; 
import java.sql.*;
public class loginProject implements ActionListener{  
    static JButton button ; 
    public Statement stmt;
    JTextField usertext ;
    JPasswordField userpass ;
    JTextField number;

   loginProject() {  
    JFrame frame = new JFrame();  
    JPanel panel = new JPanel();  
    panel.setLayout(new GridLayout(4,3));  
    // JLabel label = new JLabel("Login Page"); 
    JLabel user = new JLabel("UserName"); 
    JLabel password = new JLabel("Password");
    JLabel no = new JLabel("Phone");  
    usertext = new JTextField(10);
    number = new JTextField(10);
    userpass = new JPasswordField(10);
    button = new JButton("SIGNUP");

    button.addActionListener(this);

    panel.add(user);
    panel.add(usertext);
    panel.add(password); 
    panel.add(userpass); 
    panel.add(no); 
    panel.add(number);  
    panel.add(button);  
    frame.add(panel);  

    user.setFont(new Font("Verdana", Font.BOLD, 20));
    password.setFont(new Font("Verdana", Font.BOLD, 20));
    usertext.setFont(new Font("Verdana", Font.BOLD, 20));
    userpass.setFont(new Font("Verdana", Font.BOLD, 20));
     button.setFont(new Font("Verdana", Font.BOLD, 20));
     number.setFont(new Font("Verdana", Font.BOLD, 20));
     no.setFont(new Font("Verdana", Font.BOLD, 20));
    
    frame.setLocationRelativeTo(null);  
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    frame.setResizable(false);
    frame.setSize(500,300); 
    frame.setVisible(true);  
    frame.setTitle("SIGNIN PAGE");
    
    }
    public void actionPerformed(ActionEvent ev)
     {
         if(ev.getSource() == button)
         {
             String user ,pass ;
             user = usertext.getText();
             pass = new String(userpass.getPassword());
             int phone = Integer.parseInt(number.getText());
             try{
               
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/logindata","root","Pass@123");
            System.out.println("connection created");
            Statement stmt = con.createStatement();
            String st = "INSERT INTO login VALUES ('"+user+"' , '"+pass+"','"+phone+"')";
            stmt.executeUpdate(st);
            System.out.print("the data is inserted");
            stmt.close();
            con.close();
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
        }
} 
}