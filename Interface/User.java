package Interface;

public class User {

    //declaring and initializing some local variables for the user class

    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    
    //constructor of the user class
    public User(String username,
        String password,
        String firstname,
        String lastname){


    }

//SETTERS -------------------------------------------------------------------------------------    

    /**
     * 
     * @param username
     * @return true after changing the first name of the user
     */
    public boolean changeUserName(String userName){
        this.userName = userName;
        return true;
    }

    /**
     * 
     * @param password
     * @return true after changing the first name of the user
     */
    public boolean changePassword(String password){
        this.password = password;
        return true;
    }

    /**
     * @param firstname
     * @return true after changing the first name of the user
     */
    public boolean changeFirstName(String firstname){
        this.firstName = firstname;
        return true;
    }

    /**
     * 
     * @param lastname
     * @return true after changing the last name of the user
     */
    public boolean changeLastName(String lastname){
        this.lastName = lastname;
        return true;
    }

//GETTERS -----------------------------------------------------------------------------

    /**
     * 
     * @param none
     * @return username
     */
    public String getUserName(){
        return userName;
    }

    /**
     * 
     * @param none
     * @return password
     */
    public String getPassword(){
        return password;
    }

    /**
     * 
     * @param none
     * @return first name
     */
    public String getFirstName(){
        return firstName;
    }

    /**
     * 
     * @param none
     * @return last name
     */
    public String getLastName(){
        return lastName;
    }
}
