
package Interface;


import java.net.http.HttpResponse;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class QUOTE extends YAHOO{
    
    String ticker;
    public double bid_price;
    public double ask_price;
    public double current_price;
    SECURITY_TYPE security_type;
    
    public QUOTE(String Ticker, SECURITY_TYPE type){
        ticker = Ticker;
        security_type = type;
        refreshQuote();
    }
    
    public void refreshQuote(){
        try {
            String refresh_url = "/v6/finance/quote?region=US&lang=en&symbols="+ticker;
            
            HttpResponse<String> response = getRequest(refresh_url);
            
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(response.body());
            JSONObject jsonObject = (JSONObject) obj;
            JSONObject quoteResponse = (JSONObject) jsonObject.get("quoteResponse");
            JSONArray resultArray = (JSONArray) quoteResponse.get("result");
            JSONObject quoteObject = (JSONObject) resultArray.get(0);
            
            if (security_type.equals(SECURITY_TYPE.STOCK)){
                bid_price = 0;
                if (quoteObject.get("bid") instanceof Long) {
                    bid_price = Double.longBitsToDouble((long) quoteObject.get("bid"));
                } else {
                    bid_price = (double) quoteObject.get("bid");
                }
                ask_price = 0;
                if (quoteObject.get("ask") instanceof Long) {
                    ask_price = Double.longBitsToDouble((long) quoteObject.get("ask"));
                } else {
                    ask_price = (double) quoteObject.get("ask");
                }
                current_price = (bid_price+ask_price)/2.0;
            }
            else if (security_type.equals(SECURITY_TYPE.CRYPTO)){
                current_price = 0;
                if (quoteObject.get("regularMarketPrice") instanceof Long) {
                    current_price = Double.longBitsToDouble((long) quoteObject.get("regularMarketPrice"));
                } else {
                    current_price = (double) quoteObject.get("regularMarketPrice");
                }
            }
            
        } catch (ParseException ex) {
            Logger.getLogger(QUOTE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
