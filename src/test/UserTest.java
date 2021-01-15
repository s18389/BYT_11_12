package test;

import classes.Comment;
import classes.Page;
import classes.User;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.Date;
import java.util.ArrayList;

public class UserTest {

    private User user;
    private User anotherUser;
    private Page page;
    private Page anotherPage;
    private Comment comment;
    private ArrayList<Comment> commentsList;

@Before
public void before() throws Exception {

    user = new User(1, "DonaldosTrumpus", "biddenlost", "IAmPresident@win.us");
    anotherUser = new User(2, "Biden", "pajden", "president@win.us");
    page = new Page(1, "Super Cactus!", "I LOVE MY CACTUS!", Date.valueOf("2021-01-14"), Date.valueOf("2021-01-14"), user);
    anotherPage = new Page(2, "Bad Cactus!", "I LOVE MY CACTUS!", Date.valueOf("2021-01-14"), Date.valueOf("2021-01-14"), anotherUser);
    comment = new Comment("I like this cactus", user, page);
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getUserID() 
* 
*/ 
@Test
public void testGetUserID() throws Exception {
    Assert.assertEquals(Integer.valueOf(1), user.getUserID());
    Assert.assertNotEquals(Integer.valueOf(99), user.getUserID());
}

/** 
* 
* Method: setUserID(Integer userID) 
* 
*/ 
@Test
public void testSetUserID() throws Exception {
    user.setUserID(99);
    Assert.assertEquals(Integer.valueOf(99), user.getUserID());
    Assert.assertNotEquals(Integer.valueOf(1), user.getUserID());
} 

/** 
* 
* Method: getUsername() 
* 
*/ 
@Test
public void testGetUsername() throws Exception { 
    Assert.assertEquals("DonaldosTrumpus", user.getUsername());
    Assert.assertNotEquals("Biden", user.getUsername());
}

/** 
* 
* Method: setUsername(String username) 
* 
*/ 
@Test
public void testSetUsername() throws Exception {
    user.setUsername("Obamus");
    Assert.assertEquals("Obamus", user.getUsername());
    Assert.assertNotEquals("DonaldosTrumpus", user.getUsername());
} 

/** 
* 
* Method: getPassword() 
* 
*/ 
@Test
public void testGetPassword() throws Exception {
    Assert.assertEquals("biddenlost", user.getPassword());
    Assert.assertNotEquals("admin1234", user.getPassword());
} 

/** 
* 
* Method: setPassword(String password) 
* 
*/ 
@Test
public void testSetPassword() throws Exception {
    user.setPassword("admin1234");
    Assert.assertEquals("admin1234", user.getPassword());
    Assert.assertNotEquals("biddenlost", user.getPassword());
} 

/** 
* 
* Method: getEmail() 
* 
*/ 
@Test
public void testGetEmail() throws Exception { 
    Assert.assertEquals("IAmPresident@win.us", user.getEmail());
    Assert.assertNotEquals("IAmNOTPresident@win.us", user.getEmail());
}

/** 
* 
* Method: setEmail(String email) 
* 
*/ 
@Test
public void testSetEmail() throws Exception {
    user.setEmail("IAmNOTPresident@win.us");
    Assert.assertEquals("IAmNOTPresident@win.us", user.getEmail());
    Assert.assertNotEquals("IAmPresident@win.us", user.getEmail());
} 

/** 
* 
* Method: getPages()
* 
*/ 
@Test
public void testGetPages() throws Exception {
    user.addPage(page);
    Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(user.getPages().size()));
    user.addPage(anotherPage);
    Assert.assertEquals(Integer.valueOf(2), Integer.valueOf(user.getPages().size()));
    Assert.assertNotEquals(Integer.valueOf(1), Integer.valueOf(user.getPages().size()));
}

/** 
* 
* Method: addPage(ArrayList<classes.Page> page)
* 
*/ 
@Test
public void testAddPage() throws Exception {
    user.addPage(page);
    Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(user.getPages().size()));
    user.addPage(anotherPage);
    Assert.assertEquals(Integer.valueOf(2), Integer.valueOf(user.getPages().size()));
    Assert.assertNotEquals(Integer.valueOf(1), Integer.valueOf(user.getPages().size()));
} 

/** 
* 
* Method: getComment() 
* 
*/ 
@Test
public void testGetComment() throws Exception {
    user.addComment(comment);
    Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(user.getComments().size()));
    user.addComment(comment);
    Assert.assertEquals(Integer.valueOf(2), Integer.valueOf(user.getComments().size()));
    Assert.assertNotEquals(Integer.valueOf(1), Integer.valueOf(user.getComments().size()));
} 

/** 
* 
* Method: setComment(ArrayList<classes.Comment> comment)
* 
*/ 
@Test
public void testSetComment() throws Exception {
    user.addComment(comment);
    Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(user.getComments().size()));
    user.addComment(comment);
    Assert.assertEquals(Integer.valueOf(2), Integer.valueOf(user.getComments().size()));
    Assert.assertNotEquals(Integer.valueOf(1), Integer.valueOf(user.getComments().size()));
} 


} 
