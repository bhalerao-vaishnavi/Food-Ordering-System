import java.awt.*; 
import javax.swing.*;  
import java.awt.event.*; 
import java.sql.*;
public class MainLogin implements ActionListener{
  
    JTextField user1 ;
    JPasswordField password1;
   String username,password;
    JButton submit;
    public Statement stmt;
    JLabel l3;
    JFrame frame;
    
    MainLogin()
    {
        frame = new JFrame("Login");
        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(3,2)); 

        JLabel l1 = new JLabel("UserName");
        JLabel l2 = new JLabel("Password");
         l3 = new JLabel();
        user1 = new JTextField(10);
        password1 = new JPasswordField(10);
      
        submit = new JButton ("LOGIN ");

        submit.addActionListener(this);

        frame.add(panel);
        panel.add(l1);
        panel.add(user1);
        panel.add(l2);
        panel.add(password1);
        panel.add(submit);
        panel.add(l3);

        l1.setFont(new Font("Verdana", Font.BOLD, 20));
        l2.setFont(new Font("Verdana", Font.BOLD, 20));
        user1.setFont(new Font("Verdana", Font.BOLD, 20));
        password1.setFont(new Font("Verdana", Font.BOLD, 20));
        submit.setFont(new Font("Verdana", Font.BOLD, 20));
        l3.setFont(new Font("Verdana", Font.BOLD, 15));
        
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setResizable(false);
        frame.setSize(500,300); 

    }
    public void actionPerformed(ActionEvent aee)
    {
        if (aee.getSource() == submit)
        {
            try{
                String dbname , dbpassword;
              
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/logindata","root","Pass@123");
                System.out.println("Your Connection is done");
                stmt = con.createStatement();
                String st = "Select user , pass from login"; 
                 ResultSet rs =  stmt.executeQuery(st);
                 username=user1.getText();
                 password = password1.getText();
                 while(rs.next())
                 {
                     dbname = rs.getString("user");
                    //  System.out.print(dbname);
                      dbpassword = rs.getString("pass");
                    //   System.out.print(dbpassword);
                    // user1.getText() == dbname && password1.getText() == dbpassword
                    // && password1.getText() == dbpassword user1.getText() == dbname
                    if(dbname.equals(username) &&  dbpassword.equals(password))
                    {      
                         System.out.println("U are logged in ");
                         Food f = new Food();
                         frame.dispose();
                         break;
                        //    f.fullSupport();  
                     }
                     
                     else
                     {
                         l3.setText("INVALID CREDENTIALS");

                        //  System.out.println("invalid u cant login");
                     }
                }
         
                stmt.close();
                con.close();       
                // new Food();    
            }
            catch(Exception e)
            {
                System.out.print(e);
            }
        }
    }
}
