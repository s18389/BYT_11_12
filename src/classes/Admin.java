package classes;

public class Admin extends User {

    private int userID;

    public Admin(Integer userID, String username, String password, String email) {
        super(userID, username, password, email);
        this.userID = userID;
    }

    @Override
    public Integer getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
