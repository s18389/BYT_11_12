package classes;

public class PageReport {

    private User user;
    private Page page;
    private String reportMessage;

    public PageReport(User user, Page page) {
        this.user = user;
        this.page = page;
    }

    public User getUser() {
        return user;
    }
    public Page getPage() {
        return page;
    }

    public String getReportMessage() {
        return reportMessage;
    }
    public void setReportMessage(String reportMessage) {
        this.reportMessage = reportMessage;
    }

    public boolean reject(Page page) {
        return true;
    }

    public boolean resolve(Page page) {
        return true;
    }

    public boolean createReport(Page page) {
        return true;
    }

    public boolean requestEdit(Page page, User user) {
        return true;
    }
    
}
