package test;

import classes.Comment;
import classes.Page;
import classes.PageReport;
import classes.User;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

/** 
* classes.Page Tester.
* 
* @author <Authors name> 
* @since <pre>Jan 14, 2021</pre> 
* @version 1.0 
*/ 
public class PageTest {

    private Page page;
    private Page anotherPage;
    private User user;
    private User anotherUser;
    private Comment comment;
    private PageReport report;

@Before
public void before() throws Exception {

    user = new User(1, "DonaldosTrumpus", "biddenlost", "IAmPresident@win.us");
    anotherUser = new User(2, "Biden", "pajden", "president@win.us");
    page = new Page(1, "Super Cactus!", "I LOVE MY CACTUS!", Date.valueOf("2021-01-14"), Date.valueOf("2021-01-14"), user);
    anotherPage = new Page(2, "Bad Cactus!", "I LOVE MY CACTUS!", Date.valueOf("2021-01-14"), Date.valueOf("2021-01-14"), user);
    comment = new Comment("I like this cactus", user, page);
    report = new PageReport(user, page);
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getPageID() 
* 
*/ 
@Test
public void testGetPageID() throws Exception {
    Assert.assertEquals(Integer.valueOf(1), page.getPageID());
    Assert.assertNotEquals(Integer.valueOf(10), page.getPageID());
}

/** 
* 
* Method: setPageID(Integer pageID) 
* 
*/ 
@Test
public void testSetPageID() throws Exception { 
    page.setPageID(10);
    Assert.assertEquals(Integer.valueOf(10), page.getPageID());
    Assert.assertNotEquals(Integer.valueOf(1), page.getPageID());
} 

/** 
* 
* Method: getTitle() 
* 
*/ 
@Test
public void testGetTitle() throws Exception {
    Assert.assertEquals("Super Cactus!", page.getTitle());
    Assert.assertNotEquals("Bad Cactus!", page.getTitle());
} 

/** 
* 
* Method: setTitle(String title) 
* 
*/ 
@Test
public void testSetTitle() throws Exception {
    page.setTitle("The new title");
    Assert.assertEquals("The new title", page.getTitle());
    Assert.assertNotEquals("Super Cactus!", page.getTitle());
} 

/** 
* 
* Method: getContent() 
* 
*/ 
@Test
public void testGetContent() throws Exception {
    Assert.assertEquals("I LOVE MY CACTUS!", page.getContent());
    Assert.assertNotEquals("Super Cactus!", page.getContent());
} 

/** 
* 
* Method: setContent(String content) 
* 
*/ 
@Test
public void testSetContent() throws Exception {
    page.setContent("CACTUS!!!!!");
    Assert.assertEquals("CACTUS!!!!!", page.getContent());
    Assert.assertNotEquals("Super Cactus!", page.getContent());
} 

/** 
* 
* Method: getEditRequested() 
* 
*/ 
@Test
public void testGetEditRequested() throws Exception { 
    page.setEditRequested(true);
    Assert.assertTrue(String.valueOf(true), page.getEditRequested());
} 

/** 
* 
* Method: setEditRequested(Boolean editRequested) 
* 
*/ 
@Test
public void testSetEditRequested() throws Exception {
    page.setEditRequested(true);
    Assert.assertTrue(String.valueOf(true), page.getEditRequested());
} 

/** 
* 
* Method: getDateOfCreation() 
* 
*/ 
@Test
public void testGetDateOfCreation() throws Exception { 
    Assert.assertEquals(Date.valueOf("2021-01-14"), page.getDateOfCreation());
    Assert.assertNotEquals(Date.valueOf("1920-01-14"), page.getDateOfCreation());
}

/** 
* 
* Method: setDateOfCreation(Date dateOfCreation) 
* 
*/ 
@Test
public void testSetDateOfCreation() throws Exception {
    page.setDateOfCreation(Date.valueOf("1920-01-14"));
    Assert.assertNotEquals(Date.valueOf("2021-01-14"), page.getDateOfCreation());
    Assert.assertEquals(Date.valueOf("1920-01-14"), page.getDateOfCreation());
} 

/** 
* 
* Method: getDateOfLastModification() 
* 
*/ 
@Test
public void testGetDateOfLastModification() throws Exception {
    Assert.assertEquals(Date.valueOf("2021-01-14"), page.getDateOfCreation());
    Assert.assertNotEquals(Date.valueOf("1920-01-14"), page.getDateOfCreation());
} 

/** 
* 
* Method: setDateOfLastModification(Date dateOfLastModification) 
* 
*/ 
@Test
public void testSetDateOfLastModification() throws Exception {
    page.setDateOfLastModification(Date.valueOf("1920-01-14"));
    Assert.assertNotEquals(Date.valueOf("2021-01-14"), page.getDateOfLastModification());
    Assert.assertEquals(Date.valueOf("1920-01-14"), page.getDateOfLastModification());
} 

/** 
* 
* Method: getViews() 
* 
*/ 
@Test
public void testGetViews() throws Exception { 
    page.setViews(100);
    Assert.assertEquals(Integer.valueOf(100), page.getViews());
    Assert.assertNotEquals(Integer.valueOf(200), page.getViews());
}

/** 
* 
* Method: setViews(Integer views) 
* 
*/ 
@Test
public void testSetViews() throws Exception {
    page.setViews(999);
    Assert.assertEquals(Integer.valueOf(999), page.getViews());
    Assert.assertNotEquals(Integer.valueOf(100), page.getViews());
} 

/** 
* 
* Method: getNumberOfLikes() 
* 
*/ 
@Test
public void testGetNumberOfLikes() throws Exception {
    page.setNumberOfLikes(100);
    Assert.assertEquals(Integer.valueOf(100), page.getNumberOfLikes());
    Assert.assertNotEquals(Integer.valueOf(200), page.getNumberOfLikes());
} 

/** 
* 
* Method: setNumberOfLikes(Integer numberOfLikes) 
* 
*/ 
@Test
public void testSetNumberOfLikes() throws Exception {
    page.setNumberOfLikes(200);
    Assert.assertEquals(Integer.valueOf(200), page.getNumberOfLikes());
    Assert.assertNotEquals(Integer.valueOf(100), page.getNumberOfLikes());
} 

/** 
* 
* Method: addComment()
* 
*/ 
@Test
public void testAddComments() throws Exception {
    page.addComment(comment);
    Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(page.getComments().size()));
    page.addComment(comment);
    Assert.assertEquals(Integer.valueOf(2), Integer.valueOf(page.getComments().size()));
    Assert.assertNotEquals(Integer.valueOf(1), Integer.valueOf(page.getComments().size()));
}

/** 
* 
* Method: setComment(ArrayList<classes.Comment> comment)
* 
*/ 
@Test
public void testSetComments() throws Exception {
    page.addComment(comment);
    Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(page.getComments().size()));
    page.addComment(comment);
    Assert.assertEquals(Integer.valueOf(2), Integer.valueOf(page.getComments().size()));
    Assert.assertNotEquals(Integer.valueOf(1), Integer.valueOf(page.getComments().size()));
}

/** 
* 
* Method: addReport()
* 
*/ 
@Test
public void testAddReport() throws Exception {
    page.addReport(report);
    Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(page.getReports().size()));
    page.addComment(report);
    Assert.assertEquals(Integer.valueOf(2), Integer.valueOf(page.getReports().size()));
    Assert.assertNotEquals(Integer.valueOf(1), Integer.valueOf(page.getReports().size()));
} 

/** 
* 
* Method: getUser() 
* 
*/ 
@Test
public void testGetUser() throws Exception { 
    page.setUser(user);
    Assert.assertEquals(page.getUser(), user);
} 

/** 
* 
* Method: setUser(classes.User user)
* 
*/ 
@Test
public void testSetUser() throws Exception {
    page.setUser(user);
    Assert.assertEquals(page.getUser(), user);
} 

/** 
* 
* Method: checkForMostLikedCactusPage() 
* 
*/ 
@Test
public void testCheckForMostLikedCactusPage() throws Exception {
    Assert.assertEquals(page, page.checkForMostLikedCactusPage());
    Assert.assertNotEquals(anotherPage, page.checkForMostLikedCactusPage());
}

/** 
* 
* Method: createPage() 
* 
*/ 
@Test
public void testCreatePage() throws Exception { 
    Assert.assertTrue(String.valueOf(true), page.createPage());
} 

/** 
* 
* Method: editPage() 
* 
*/ 
@Test
public void testEditPage() throws Exception {
    Assert.assertTrue(String.valueOf(true), page.editPage("new page content"));
    Assert.assertEquals("new page content", page.getContent());
}

/** 
* 
* Method: deletePage() 
* 
*/ 
@Test
public void testDeletePage() throws Exception { 
    Assert.assertTrue(String.valueOf(true), page.deletePage());
} 

/** 
* 
* Method: reportPage() 
* 
*/ 
@Test
public void testReportPage() throws Exception {
    Assert.assertTrue(String.valueOf(true), page.reportPage(page));
} 

/** 
* 
* Method: verifyContent() 
* 
*/ 
@Test
public void testVerifyContent() throws Exception {
    Assert.assertTrue(String.valueOf(true), page.verifyContent("SomeContent"));
} 


} 
