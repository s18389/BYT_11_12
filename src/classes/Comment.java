package classes;

public class Comment {

    private String content;
    private Integer numberOfLikes;
    private User user;
    private Page page;

    public Comment(String content, User user, Page page) {
        this.content = content;
        this.user = user;
        this.page = page;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public Integer getNumberOfLikes() {
        return numberOfLikes;
    }
    public void setNumberOfLikes(Integer numberOfLikes) {
        this.numberOfLikes = numberOfLikes;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    public Page getPage() {
        return page;
    }
    public void setPage(Page page) {
        this.page = page;
    }

    public boolean update() {
        return true;
    }

    public boolean edit(String newCommentContent) {
        this.setContent(newCommentContent);
        return true;
    }

    public boolean add(String commentContent) {
        this.setContent(commentContent);
        return true;
    }

    public boolean delete() {
        return true;
    }
    
}
