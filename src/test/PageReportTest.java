package test;

import classes.Page;
import classes.PageReport;
import classes.User;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

/** 
* classes.PageReport Tester.
* 
* @author <Authors name> 
* @since <pre>Jan 14, 2021</pre> 
* @version 1.0 
*/ 
public class PageReportTest {

    private PageReport pageReport;
    private User user;
    private Page page;

@Before
public void before() throws Exception {
    user = new User(1, "DonaldosTrumpus", "biddenlost", "IAmPresident@win.us");
    page = new Page(1, "Super Cactus!", "I LOVE MY CACTUS!", Date.valueOf("2021-01-14"), Date.valueOf("2021-01-14"), user);
    pageReport = new PageReport(user, page);
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getUser()
* 
*/ 
@Test
public void testGetUser() throws Exception {
    Assert.assertEquals(user, pageReport.getUser());
} 


/** 
* 
* Method: getPage()
* 
*/ 
@Test
public void testGetPageID() throws Exception {
    Assert.assertEquals(page, pageReport.getPage());
} 

/** 
* 
* Method: getMessage() 
* 
*/ 
@Test
public void testGetMessage() throws Exception { 
    pageReport.setReportMessage("This page is offensive towards our cactus society");
    Assert.assertEquals("This page is offensive towards our cactus society", pageReport.getReportMessage());
} 

/** 
* 
* Method: setMessage(String message) 
* 
*/ 
@Test
public void testSetMessage() throws Exception {
    pageReport.setReportMessage("This page is offensive towards our cactus society");
    Assert.assertEquals("This page is offensive towards our cactus society", pageReport.getReportMessage());
    pageReport.setReportMessage("This page is super offencive towards our cactus society");
    Assert.assertNotEquals("This page is offensive towards our cactus society", pageReport.getReportMessage());
    Assert.assertEquals("This page is super offencive towards our cactus society", pageReport.getReportMessage());
} 

/** 
* 
* Method: reject() 
* 
*/ 
@Test
public void testReject() throws Exception { 
    Assert.assertTrue(String.valueOf(true), pageReport.reject(page));
} 

/** 
* 
* Method: resolve() 
* 
*/ 
@Test
public void testResolve() throws Exception {
    Assert.assertTrue(String.valueOf(true), pageReport.resolve(page));
} 

/** 
* 
* Method: createReport() 
* 
*/ 
@Test
public void testCreateReport() throws Exception {
    Assert.assertTrue(String.valueOf(true), pageReport.createReport(page));
}

/** 
* 
* Method: requestEdit() 
* 
*/ 
@Test
public void testRequestEdit() throws Exception {
    Assert.assertTrue(String.valueOf(true), pageReport.requestEdit(page, user));
} 


} 
