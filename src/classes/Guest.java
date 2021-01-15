package classes;

public class Guest {

    public boolean logIn(String login, String password) {
        return true;
    }

    public User register(Integer userID, String username, String password, String email) {
        User newUser = new User(userID,  username,  password, email);
        return newUser;
    }
    
}

