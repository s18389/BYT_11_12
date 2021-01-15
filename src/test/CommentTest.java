package test;

import classes.Comment;
import classes.Page;
import classes.User;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

public class CommentTest { 

    private User user;
    private User anotherUser;
    private Page page;
    private Page anotherPage;
    private Comment comment;

@Before
public void before() throws Exception {
    user = new User(1, "DonaldosTrumpus", "biddenlost", "IAmPresident@win.us");
    anotherUser = new User(2, "Biden", "pajden", "president@win.us");
    page = new Page(1, "Super Cactus!", "I LOVE MY CACTUS!", Date.valueOf("2021-01-14"), Date.valueOf("2021-01-14"), user);
    anotherPage = new Page(2, "Bad Cactus!", "I LOVE MY CACTUS!", Date.valueOf("2021-01-14"), Date.valueOf("2021-01-14"), user);
    comment = new Comment("I like this cactus", user, page);
    comment.setNumberOfLikes(10);
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getContent() 
* 
*/ 
@Test
public void testGetContent() throws Exception {
    Assert.assertEquals("I like this cactus", comment.getContent());
    Assert.assertNotEquals("I dont like this cactus!", comment.getContent());
}

/** 
* 
* Method: setContent(String content) 
* 
*/ 
@Test
public void testSetContent() throws Exception { 
    comment.setContent("This cactus make me happy :D");
    Assert.assertEquals("This cactus make me happy :D", comment.getContent());
    Assert.assertNotEquals("I dont like this cactus!", comment.getContent());
} 

/** 
* 
* Method: getNumberOfLikes() 
* 
*/ 
@Test
public void testGetNumberOfLikes() throws Exception {
    Assert.assertEquals(Integer.valueOf(10), comment.getNumberOfLikes());
    Assert.assertNotEquals(Integer.valueOf(100), comment.getNumberOfLikes());
} 

/** 
* 
* Method: setNumberOfLikes(Integer numberOfLikes) 
* 
*/ 
@Test
public void testSetNumberOfLikes() throws Exception {
    comment.setNumberOfLikes(11);
    Assert.assertEquals(Integer.valueOf(11), comment.getNumberOfLikes());
    Assert.assertNotEquals(Integer.valueOf(10), comment.getNumberOfLikes());
} 

/** 
* 
* Method: getUser() 
* 
*/ 
@Test
public void testGetUser() throws Exception {
    Assert.assertEquals(user, comment.getUser());
    Assert.assertNotEquals(anotherUser, comment.getUser());
} 

/** 
* 
* Method: setUser(classes.User user)
* 
*/ 
@Test
public void testSetUser() throws Exception { 
    comment.setUser(anotherUser);
    Assert.assertEquals(anotherUser, comment.getUser());
    Assert.assertNotEquals(user, comment.getUser());
} 

/** 
* 
* Method: getPage() 
* 
*/ 
@Test
public void testGetPage() throws Exception { 
    Assert.assertEquals(page, comment.getPage());
    Assert.assertNotEquals(anotherPage, comment.getPage());
}

/** 
* 
* Method: setPage(classes.Page page)
* 
*/ 
@Test
public void testSetPage() throws Exception { 
    comment.setPage(anotherPage);
    Assert.assertEquals(anotherPage, comment.getPage());
    Assert.assertNotEquals(page, comment.getPage());
} 

/** 
* 
* Method: update() 
* 
*/ 
@Test
public void testUpdate() throws Exception {
    Assert.assertTrue(comment.update());
} 

/** 
* 
* Method: edit() 
* 
*/ 
@Test
public void testEdit() throws Exception {
    Assert.assertTrue(comment.edit("The new comment content"));
} 

/** 
* 
* Method: add() 
* 
*/ 
@Test
public void testAdd() throws Exception {
    Assert.assertTrue(comment.add("My comment!"));
} 

/** 
* 
* Method: delete() 
* 
*/ 
@Test
public void testDelete() throws Exception {
    Assert.assertTrue(comment.delete());
} 


} 
