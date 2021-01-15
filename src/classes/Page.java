package classes;

import java.util.ArrayList;
import java.util.Date;

public class Page {

    private Integer pageID;
    private String title;
    private String content;
    private Boolean editRequested;
    private Date dateOfCreation;
    private Date dateOfLastModification;
    private Integer views;
    private Integer numberOfLikes;
    private ArrayList<Comment> commentsList = new ArrayList<>();
    private User user;

    public Page(Integer pageID, String title, String content, Date dateOfCreation, Date dateOfLastModification, User user) {
        this.pageID = pageID;
        this.title = title;
        this.content = content;
        this.dateOfCreation = dateOfCreation;
        this.dateOfLastModification = dateOfLastModification;
        this.user = user;
    }

    public Integer getPageID() {
        return pageID;
    }
    public void setPageID(Integer pageID) {
        this.pageID = pageID;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getEditRequested() {
        return editRequested;
    }
    public void setEditRequested(Boolean editRequested) {
        this.editRequested = editRequested;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }
    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public Date getDateOfLastModification() {
        return dateOfLastModification;
    }
    public void setDateOfLastModification(Date dateOfLastModification) {
        this.dateOfLastModification = dateOfLastModification;
    }

    public Integer getViews() {
        return views;
    }
    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getNumberOfLikes() {
        return numberOfLikes;
    }
    public void setNumberOfLikes(Integer numberOfLikes) {
        this.numberOfLikes = numberOfLikes;
    }

    public ArrayList<Comment> getComments() {
        return commentsList;
    }
    public boolean addComment(Comment comment) {
        commentsList.add(comment);
        return true;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    public Page checkForMostLikedCactusPage() {
       return this;
    }

    public boolean createPage() {
        return true;
    }

    public boolean editPage(String newContent) {
        this.setContent(newContent);
        return true;
    }

    public boolean deletePage() {
        return true;
    }

    public boolean reportPage(Page page) {
        return true;
    }

    public boolean verifyContent(String contentToVerify) {
        return true;
    }
    
}
