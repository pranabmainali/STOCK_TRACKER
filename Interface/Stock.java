package Interface;

public class Stock {

    private String ticker;
    private double currentPrice;

    public Stock(String ticker){
        this.ticker = ticker;
    }
    

    //GETTERS ----------------------------------------------------------------
    /**
     * @param none
     * @return true after changing the first name of the user
     */
    public String returnTicker(){
        return ticker;
    }

    /**
     * @param none
     * @return true after changing the first name of the user
     */
    public double returnCurrentPrice(){
        return currentPrice;
    }


    //SETTERS ----------------------------------------------------------------

    /**
     * @param double
     * @return void
     */
    public void setCurrentPrice(double price){
        currentPrice = price;
    }

    /**
     * @param double
     * @return void
     */
    public void updateCurrentPrice(double price){
        currentPrice = price;
    }
}
