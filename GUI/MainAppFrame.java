package GUI;

//import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MainAppFrame extends JFrame {
    MainGUIInterface mainGUIInterface;
    

    public MainAppFrame(MainGUIInterface mainGUIInterface){
        this.mainGUIInterface = mainGUIInterface;

        this.setTitle("Stock Tracker");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(500, 500);

        // setting of icon
        //ImageIcon health_fitness_icon = new ImageIcon("Icons/health_fitness_icon.png");
        //this.setIconImage(health_fitness_icon.getImage());

        //adding everything to everything
        this.setVisible(true);
    }
}
