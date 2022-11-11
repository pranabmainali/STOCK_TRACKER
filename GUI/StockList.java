package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
//import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Interface.StageEnum;
public class StockList extends JFrame //implements ActionListener 
{
    private static JLabel stockNameLabel;
    private static JLabel stockPriceLabel;
    private static JLabel yourStocksLabel;
    private static JButton addStockButton;

    public StockList(String stockName, String stockPrice, String YourStocks) {
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        YourStocks = "Your Stocks";

        stockNameLabel = new JLabel(stockName);
        stockNameLabel.setFont(new Font(stockNameLabel.getName(), Font.PLAIN, 20));
        stockNameLabel.setHorizontalAlignment(JLabel.CENTER);
        this.add(stockNameLabel);

        stockPriceLabel = new JLabel(stockPrice);
        stockPriceLabel.setFont(new Font(stockPriceLabel.getName(), Font.PLAIN, 20));
        stockPriceLabel.setHorizontalAlignment(JLabel.CENTER);
        this.add(stockPriceLabel);

        yourStocksLabel = new JLabel(YourStocks);
        yourStocksLabel.setFont(new Font(yourStocksLabel.getName(), Font.PLAIN, 20));
        yourStocksLabel.setHorizontalAlignment(JLabel.CENTER);
        this.add(yourStocksLabel);

        JPanel emptyJPanel = new JPanel();
        this.add(emptyJPanel);
        this.add(emptyJPanel);

        setVisible(true);
    }


}
