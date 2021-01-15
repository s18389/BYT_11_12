package test;

import classes.Guest;
import classes.User;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GuestTest {

    private User user;
    private Guest guest;

@Before
public void before() throws Exception {
    guest = new Guest();
    user = new User(1, "DonaldosTrumpus", "biddenlost", "IAmPresident@win.us");
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: logIn() 
* 
*/ 
@Test
public void testLogIn() throws Exception {
   Assert.assertTrue(String.valueOf(true),  guest.logIn("DonaldosTrumpus", "biddenlost"));
} 

/** 
* 
* Method: register() 
* 
*/ 
@Test
public void testRegister() throws Exception { 
    Assert.assertEquals(user.getUserID(), guest.register(1, "DonaldosTrumpus", "biddenlost", "IAmPresident@win.us").getUserID());
} 


} 
