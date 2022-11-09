package GUI;

//import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Interface.ConditionEnum;

public class MainAppFrame extends JFrame {
    MainGUIInterface mainGUIInterface;
    JPanel alertContainer;
    

    public MainAppFrame(MainGUIInterface mainGUIInterface){
        this.mainGUIInterface = mainGUIInterface;

        this.setTitle("Health Simple");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(500, 500);

        // setting of icon
        //ImageIcon health_fitness_icon = new ImageIcon("Icons/health_fitness_icon.png");
        //this.setIconImage(health_fitness_icon.getImage());

        //adding everything to everything
        alertContainer = new AlertContainer("AAPL", ConditionEnum.Equal, 120.00);
        this.add(alertContainer);


        this.setVisible(true);
    }
}
