package Interface;

public class Alert {

    private Stock stock;
    private double price;
    private ConditionEnum condition;

    public Alert (Stock stock, double price, ConditionEnum condition){
        this.stock = stock;
        this.price = price;
        this.condition = condition;

    }

    // GETTERS -------------------------------------------------
    /**
     * @param none
     * @return true after changing the first name of the user
     */
    public Stock getStock(){
        return stock;
    }

    /**
     * @param none
     * @return true after changing the first name of the user
     */
    public double getPrice(){
        return price;
    }

    /**
     * @param none
     * @return true after changing the first name of the user
     */
    public ConditionEnum getCondition(){
        return condition;
    }


    // SETTERS -------------------------------------------------

    /**
     * @param none
     * @return true after changing the first name of the user
     */
    public void setStock(Stock stock){
        this.stock = stock;
    }

    /**
     * @param none
     * @return true after changing the first name of the user
     */
    public void setPrice(double price){
        this.price = price;
    }

    /**
     * @param none
     * @return true after changing the first name of the user
     */
    public void setCondition(ConditionEnum condition){
        this.condition = condition;
    }
    
}
