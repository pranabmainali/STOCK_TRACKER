package GUI;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;

import java.awt.Font;

import Interface.ConditionEnum;

public class AlertContainer extends JPanel{
    private static JPanel tickerJPanel;
    private static JLabel tickerJLabel;
    private static JPanel conditionJPanel;
    private static JLabel conditionJLabel;
    private static JPanel priceJPanel;
    private static JLabel priceJLabel;
    
    public AlertContainer(String ticker, ConditionEnum condition, double price){

        tickerJPanel = new JPanel();
        tickerJPanel.setLayout(new FlowLayout());

        tickerJLabel = new JLabel(ticker);
        tickerJLabel.setFont(new Font(tickerJLabel.getName(), Font.PLAIN, 20));
        tickerJLabel.setHorizontalAlignment(JLabel.CENTER);
        tickerJLabel.setVerticalAlignment(JLabel.CENTER);
        tickerJPanel.add(tickerJLabel);
        this.add(tickerJPanel);

        JPanel emptyJPanel = new JPanel();
        this.add(emptyJPanel);

        conditionJPanel = new JPanel();
        conditionJPanel.setLayout(new FlowLayout());

        if (condition.equals(ConditionEnum.Equal)){conditionJLabel = new JLabel("=");}
        else if (condition.equals(ConditionEnum.LessThan)){conditionJLabel = new JLabel("<");}
        else if (condition.equals(ConditionEnum.LessThanEqualTo)){conditionJLabel = new JLabel("<=");}
        else if (condition.equals(ConditionEnum.MoreThan)){conditionJLabel = new JLabel(">");}
        else if (condition.equals(ConditionEnum.MoreThanEqualTo)){conditionJLabel = new JLabel("=>");}
        conditionJLabel.setFont(new Font(conditionJLabel.getName(), Font.PLAIN, 20));
        conditionJLabel.setHorizontalAlignment(JLabel.RIGHT);
        conditionJLabel.setVerticalAlignment(JLabel.CENTER);
        conditionJPanel.add(conditionJLabel, SwingConstants.CENTER);
        this.add(conditionJPanel);

        priceJPanel = new JPanel();
        priceJPanel.setLayout(new FlowLayout());

        priceJLabel = new JLabel(String.valueOf(price));
        priceJLabel.setFont(new Font(priceJLabel.getName(), Font.PLAIN, 20));
        priceJLabel.setHorizontalAlignment(JLabel.CENTER);
        priceJLabel.setVerticalAlignment(JLabel.CENTER);
        priceJPanel.add(priceJLabel, SwingConstants.CENTER);
        this.add(priceJPanel);

        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

    }
}
