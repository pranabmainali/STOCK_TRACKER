package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Interface.StageEnum;

public class SignUpFrame extends JFrame implements ActionListener {
    MainGUIInterface guiInterface;
    JPanel panel;
    private static JLabel usernameLabel;
    private static JTextField usernameTextField;
    private static JLabel passwordLabel;
    private static JPasswordField passwordTextField;
    private static JLabel confirmPasswordLabel;
    private static JPasswordField confirmPasswordTextField;
    private static JLabel firstNameLabel;
    private static JTextField firstNameTextField;
    private static JLabel lastNameLabel;
    private static JTextField lastNameTextField;
    private static JButton signUpButton;
    private static JLabel passNotSame;

    public SignUpFrame(MainGUIInterface guiInterface) {
        this.guiInterface = guiInterface;

        // Frame
        this.setTitle("Health Simple");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(800, 800);

        // panel
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);

        // adding firstname textfield
        firstNameTextField = new JTextField();
        firstNameTextField.setBounds(100, 100, 270, 50);
        panel.add(firstNameTextField);

        // adding firstname label
        firstNameLabel = new JLabel("First name");
        firstNameLabel.setBounds(100, 70, 100, 40);
        firstNameLabel.setFont(new Font(firstNameLabel.getName(), Font.PLAIN, 20));
        panel.add(firstNameLabel);

        // adding lastname textfield
        lastNameTextField = new JTextField();
        lastNameTextField.setBounds(400, 100, 275, 50);
        panel.add(lastNameTextField);

        // adding lastname label
        lastNameLabel = new JLabel("Last name");
        lastNameLabel.setBounds(400, 70, 100, 40);
        lastNameLabel.setFont(new Font(lastNameLabel.getName(), Font.PLAIN, 20));
        panel.add(lastNameLabel);

        // adding username textfield
        usernameTextField = new JTextField();
        usernameTextField.setBounds(100, 200, 575, 50);
        panel.add(usernameTextField);

        // adding username label
        usernameLabel = new JLabel("Email");
        usernameLabel.setBounds(100, 170, 100, 40);
        usernameLabel.setFont(new Font(usernameLabel.getName(), Font.PLAIN, 20));
        panel.add(usernameLabel);

        // adding password textfield
        passwordTextField = new JPasswordField();
        passwordTextField.setBounds(100, 300, 275, 50);
        panel.add(passwordTextField);

        // adding password label
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(100, 270, 100, 40);
        passwordLabel.setFont(new Font(passwordLabel.getName(), Font.PLAIN, 20));
        panel.add(passwordLabel);

        // adding confirm password textfield
        confirmPasswordTextField = new JPasswordField();
        confirmPasswordTextField.setBounds(400, 300, 270, 50);
        panel.add(confirmPasswordTextField);

        // adding confirm password label
        confirmPasswordLabel = new JLabel("Confirm Password");
        confirmPasswordLabel.setBounds(400, 270, 200, 40);
        confirmPasswordLabel.setFont(new Font(confirmPasswordLabel.getName(), Font.PLAIN, 20));
        panel.add(confirmPasswordLabel);

        

        //adding login button
        signUpButton = new JButton("Sign Up");
        signUpButton.addActionListener(this);
        signUpButton.setBounds(200, 600, 350, 50);
        panel.add(signUpButton);

        //addring wrong password label
        passNotSame = new JLabel();
        passNotSame.setBounds(200, 550, 400, 30);
        passNotSame.setFont(new Font(passNotSame.getName(), Font.PLAIN, 20));
        passNotSame.setForeground(Color.RED);
        panel.add(passNotSame);

        // setting of icon
        //ImageIcon health_fitness_icon = new ImageIcon("Icons/health_fitness_icon.png");
        //this.setIconImage(health_fitness_icon.getImage());

        // adding everything to everything
        this.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String firstName = firstNameTextField.getText();
        String lastName = lastNameTextField.getText();
        String username = usernameTextField.getText();
        String password = new String(passwordTextField.getPassword());
        String confirmPassword = new String(confirmPasswordTextField.getPassword());

        if (password.equals(confirmPassword)==true){


            boolean signUpStatus = guiInterface.mainInterface.signUP(username,
                password,
                firstName,
                lastName);

            if (signUpStatus == true) {
                System.out.println("signed up");
                guiInterface.changeStage(StageEnum.LoginPage);
            } else if (signUpStatus == false) {
                System.out.println("signup failed");
            }
        }

        else {
            passNotSame.setText("PLEASE make sure password is the same!");
        }
    }
    
}
