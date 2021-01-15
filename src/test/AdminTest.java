package test;

import classes.Admin;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AdminTest {

    private Admin admin;

@Before
public void before() throws Exception {
     admin = new Admin(1, "adminGuy", "admin123", "unknow@what.org");
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
    Assert.assertEquals(Integer.valueOf(1), admin.getUserID());
    Assert.assertNotEquals(Integer.valueOf(10), admin.getUserID());
}

/** 
* 
* Method: setUserID(int userID) 
* 
*/ 
@Test
public void testSetUserID() throws Exception {
    admin.setUserID(2);
    Assert.assertEquals(Integer.valueOf(2), admin.getUserID());
    Assert.assertNotEquals(Integer.valueOf(1), admin.getUserID());
} 


} 
