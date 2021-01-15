package classes;

import java.util.ArrayList;
import java.util.List;

public class User {

    private Integer userID;
    private String username;
    private String password;
    private String email;
    private ArrayList<Page> pagesList = new ArrayList<>();
    private ArrayList<Comment> commentsList = new ArrayList<>();

    public User(Integer userID, String username, String password, String email) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.email = email;
    }


    public Integer getUserID() {
        return userID;
    }
    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public List<Page> getPages() {
        return pagesList;
    }
    public boolean addPage(Page page) {
        pagesList.add(page);
        return true;
    }

    public ArrayList<Comment> getComments() {
        return commentsList;
    }
    public boolean addComment(Comment comment) {
        commentsList.add(comment);
        return true;
    }
}
