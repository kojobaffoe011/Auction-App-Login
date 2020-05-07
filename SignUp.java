import java.awt.*;
import javax.swing.*;


public class SignUp extends JFrame{


    public SignUp(){
        //title
        super("SIGN UP PAGE");
        // font
        Font font = new Font("Times New Roman", Font.BOLD, 30);

        //header 
        JPanel heading = new JPanel();
        heading.setBackground(new Color(0,0,0,80));
        heading.setBounds(0,0,900,100);
        JLabel name = new JLabel("SIGN UP AND JOIN THE FAMILY!");

        name.setForeground(Color.WHITE);
        name.setFont(font);
        name.setBounds(200,50,400,50);
        heading.add(name);

         //signup panel
         JPanel signup = new JPanel();
         signup.setLayout(null);
         signup.setSize(400,500 );
         signup.setBackground(new Color(0,0,0,60));
         signup.setBounds(250,175,400,350);
          //firstname
        JTextField firstname  = new JTextField("Enter your firstname...");
        firstname.setBounds(50,20,300,50);
        firstname.setBackground(new Color(150 ,140,150));
        signup.add(firstname);
          //lastname
        JTextField lastname  = new JTextField("Enter your lastname...");
        lastname.setBounds(50,80,300,50);
        lastname.setBackground(new Color(150 ,140,150));
        signup.add(lastname);
          //username
        JTextField username = new JTextField("Please choose a username...");
        username.setBounds(50,140,300,50);
        username.setBackground(new Color(150 ,140,150));
        signup.add(username);
          //password
        JPasswordField password = new JPasswordField();
        password.setBounds(50,200,300,50);
        password.setBackground(new Color(150 ,140,150));
        password.setToolTipText("Please set a valid password");
        signup.add(password);

        //create account

         JButton createAccButton = new JButton("Create Account");
         createAccButton.setBounds(100,280,100,50);
         createAccButton.setSize(200, 50);
         createAccButton.setBackground(new Color(90, 182,45, 10));
         signup.add(createAccButton);

  

        

        







        
        // background

        ImageIcon background_image = new ImageIcon("/Users/kojobaffoe/Desktop/TRIAL/Images/background.jpeg");
        Image img = background_image.getImage();
        Image img1 = img.getScaledInstance(900,600,Image.SCALE_SMOOTH);
        background_image = new ImageIcon(img1);
        JLabel background = new JLabel("",background_image ,JLabel.CENTER);


        background.add(signup);
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
        SignUp window = new SignUp();
        window.setUndecorated(true);
       // window.setDefaultLookAndFeelDecorated();

        
    }

}