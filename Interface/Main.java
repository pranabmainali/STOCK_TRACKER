package Interface;

import GUI.MainGUIInterface;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main_Interface mainInterface = new Main_Interface();
        MainGUIInterface guiInterface = new MainGUIInterface(mainInterface);
    }
    
}