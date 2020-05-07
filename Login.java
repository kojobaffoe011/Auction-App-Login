 import java.awt.*;
 import javax.swing.*;

public class Login extends JFrame{

    
    public Login(){
        super("LOGIN PAGE");
        //font 
        Font font = new Font("Times New Roman", Font.BOLD, 30);


        //header 
        JPanel heading = new JPanel();
        heading.setBackground(new Color(0,0,0,80));
        heading.setBounds(0,0,900,100);
        JLabel name = new JLabel("Please Login to continue");
        name.setForeground(Color.WHITE);
        name.setFont(font);
        name.setBounds(200,25,400,50);
        heading.add(name);

        //login panel
        JPanel login = new JPanel();
        login.setLayout(null);
        login.setSize(400,350);
        login.setBackground(new Color(0,0,0,60));
        login.setBounds(250,175,400,350);
        //username 
        JTextField username  = new JTextField("Enter Username...");
        username.setBounds(50,50,300,50);
        username.setBackground(new Color(150 ,140,150));
        login.add(username);

        //password
        JPasswordField password  = new JPasswordField("Enter Password...");
        password.setBounds(50,150,300,50);
        password.setBackground(new Color(50,140,100));
        login.add(password);

        //sign Up Button

        JButton signup = new JButton("Sign Up");
        signup.setBounds(50,250,100,50);
        signup.setBackground(new Color(150 ,140,150));
        login.add(signup);

        //log in Button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(250,250,100,50);
        loginButton.setBackground(Color.GRAY);
        login.add(loginButton);


        
        // background

        ImageIcon background_image = new ImageIcon("/Users/kojobaffoe/Desktop/TRIAL/Images/background.jpeg");
        Image img = background_image.getImage();
        Image img1 = img.getScaledInstance(900,600,Image.SCALE_SMOOTH);
        background_image = new ImageIcon(img1);
        JLabel background = new JLabel("",background_image ,JLabel.CENTER);


        background.add(login);
        background.add(heading);
        background.setBounds(0, 0, 900, 600);
        add(background);

        // frame 
        setSize(900,600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        setVisible(true);
        
    }
    public static void main(String[] args) {
        Login window = new Login();
        window.setUndecorated(true);

    }






 }