package GUI;

import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Interface.Alert;

public class AlertPanel extends JPanel{
    private ArrayList<Alert> listOfAlerts;
    private MainGUIInterface guiInterface;

    public AlertPanel(MainGUIInterface guiInterface){
        this.guiInterface = guiInterface;

        this.listOfAlerts = guiInterface.mainInterface.getCurrentUser().getListOfAlerts();
        
        for (int i=0; i<listOfAlerts.size(); i++){
            this.add(new AlertContainer(listOfAlerts.get(i).getStock().returnTicker(), listOfAlerts.get(i).getCondition(), listOfAlerts.get(i).getPrice()));
        }

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }
    
}
