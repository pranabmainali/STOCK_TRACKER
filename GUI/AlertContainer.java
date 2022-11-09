package GUI;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;

import Interface.ConditionEnum;

public class AlertContainer extends JPanel{
    private static JLabel usernameJLabel;
    private static JLabel conditionJLabel;
    private static JLabel priceJLabel;
    
    public AlertContainer(String username, ConditionEnum condition, double prices){
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        usernameJLabel = new JLabel(username);
        usernameJLabel.setFont(new Font(usernameJLabel.getName(), Font.PLAIN, 20));
        usernameJLabel.setHorizontalAlignment(JLabel.CENTER);
        this.add(usernameJLabel);

        JPanel emptyJPanel = new JPanel();
        this.add(emptyJPanel);
        this.add(emptyJPanel);


        setVisible(true);
    }
}
