package Interface;
import java.util.ArrayList;

public class Main_Interface {
    private ArrayList<User> listOfUsers;
    private User currentUser;


    public Main_Interface() {
        listOfUsers = new ArrayList<>();
        run();
    }

    /**
     * login method for login button
     * 
     * @parameter String username, String password
     * @returns boolean, True if there is an account and both username and password
     *          are proper, False if otherwise
     *
     */
    public boolean logIn(String username, String password) {
        if (listOfUsers.size()>0) {
            for (int i = 0; i < listOfUsers.size(); i++) {
                System.out.println(username);
                if (listOfUsers.get(i).getUserName().equals(username)) {
                    if (listOfUsers.get(i).getPassword().equals(password)){
                        currentUser = listOfUsers.get(i);
                        return true;
                    }
                }
            }
        }

        return false;
    }

    /**
     * login method for signUp button
     * 
     * @parameter String username, String password, String firstname, String
     *            lastname,
     *            int age, int height, GENDER gender, ActivityLevelEnum
     *            activityLevel
     * @returns True if user inputs are valid (Adds the new user who wants to sign
     *          up into the list of existing users), otherwise returns False.
     *
     */
    public boolean signUP(String username,
            String password,
            String firstname,
            String lastname) {

        listOfUsers.add(new User(username, password, firstname, lastname));
        return true;
    }

    public ArrayList<User> getListofUsers(){
        return listOfUsers;
    }

    public User getCurrentUser()
    {
        return currentUser;
    }

    /**
     * simple run function to see if current login function works
     */
    public void run() {

        User newUser = new User("pmainali",
                "idk",
                "Pranab",
                "Mainali");
        listOfUsers.add(newUser);
    }

}