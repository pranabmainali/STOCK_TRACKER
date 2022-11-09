package GUI;

import javax.swing.JFrame;

import Interface.*;

public class MainGUIInterface {

    public Main_Interface mainInterface;
    LoginFrame loginFrame;
    SignUpFrame signUpFrame;
    MainAppFrame mainFrame;
    JFrame currentFrame;

    public MainGUIInterface(Main_Interface mainInterface) {
        this.mainInterface = mainInterface;
        loginFrame = new LoginFrame(this);
        currentFrame = loginFrame;
        // run();
    }

    public void run() {

    }

    public void changeStage(StageEnum nextEnum) {
        if (nextEnum.equals(StageEnum.SignUpPage)) {
            signUpFrame = new SignUpFrame(this);
            currentFrame.dispose();
            currentFrame = signUpFrame;
        }
        else if (nextEnum.equals(StageEnum.LoginPage)) {
            loginFrame = new LoginFrame(this);
            currentFrame.dispose();
            currentFrame = loginFrame;
        }
        else if (nextEnum.equals(StageEnum.MainPage)){
            mainFrame = new MainAppFrame(this);
            currentFrame.dispose();
            currentFrame = mainFrame;
        }
    }

}
