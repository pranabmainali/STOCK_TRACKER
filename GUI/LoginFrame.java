package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

//import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Interface.StageEnum;

public class LoginFrame extends JFrame implements ActionListener{

    private static JLabel usernameLabel;
    private static JLabel passwordLabel;
    private static JLabel invalidLogin;
    private static JTextField usernameTextField;
    private static JPasswordField passwordTextField;
    private static JButton loginButton;
    private MainGUIInterface guiInterface;

    public LoginFrame(MainGUIInterface guiInterface) {

        this.guiInterface = guiInterface;

        //Frame
        this.setTitle("Stock tacker");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(500, 500);

        //panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);

        //adding username label
        usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(60, 150, 100, 40);
        panel.add(usernameLabel);

        //adding password label
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(60, 200, 100, 40);
        panel.add(passwordLabel);

        //adding usernameTextfield
        usernameTextField = new JTextField();
        usernameTextField.setBounds(150, 150, 200, 40);
        panel.add(usernameTextField);

        //adding passwordTextfield
        passwordTextField = new JPasswordField();
        passwordTextField.setBounds(150, 200, 200, 40);
        panel.add(passwordTextField);

        //adding signup button
        JLabel signUpInstruction = new JLabel();
        signUpInstruction.setText("To sign up please click ");
        signUpInstruction.setBounds(150, 220, 200, 100);
        panel.add(signUpInstruction);

        JLabel signUpButton = new JLabel();
        signUpButton.setText("here.");
        signUpButton.setForeground(Color.BLUE);
        signUpButton.setBounds(290, 220, 200, 100);
        signUpButton.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                guiInterface.changeStage(StageEnum.SignUpPage);
            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent e) {}

            @Override
            public void mouseReleased(java.awt.event.MouseEvent e) {}

            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {}

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {}
            
        });
        panel.add(signUpButton);

        //adding login button
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        loginButton.setBounds(200, 300, 100, 50);
        panel.add(loginButton);

        //adding invalid login credentials label 
        invalidLogin = new JLabel();
        invalidLogin.setBounds(50, 375, 500, 50);
        invalidLogin.setForeground(Color.RED);
        invalidLogin.setFont(new Font(usernameLabel.getName(), Font.PLAIN, 10));
        panel.add(invalidLogin);

        // setting of icon
        //ImageIcon health_fitness_icon = new ImageIcon("Icons/health_fitness_icon.png");
        //this.setIconImage(health_fitness_icon.getImage());

        //adding everything to everything
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = usernameTextField.getText();
        String password = new String (passwordTextField.getPassword());
        boolean loggedInStatus = guiInterface.mainInterface.logIn(username, password);

        if (loggedInStatus == true){
            System.out.println("logged in");
            guiInterface.changeStage(StageEnum.MainPage);
        }
        else if (loggedInStatus==false){
            System.out.println("login failed");
            invalidLogin.setText("Invalid log in credentials, please make sure you have signed up and enter the correct credentials.");
        }
    }


}
