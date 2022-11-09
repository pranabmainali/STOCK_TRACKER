package Interface;

public class Stock {

    private String ticker;

    public Stock(String ticker){
        this.ticker = ticker;
    }
    

    //GETTERS ----------------------------------------------------------------
    /**
     * 
     * @param username
     * @return true after changing the first name of the user
     */
    public String returnTicker(){
        return ticker;
    }


    //SETTERS ----------------------------------------------------------------
}
