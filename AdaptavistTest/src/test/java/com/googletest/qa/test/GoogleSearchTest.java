package com.googletest.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.googletest.qa.base.TestBase;
import com.googletest.qa.pages.GoogleSearchPage;
import com.googletest.qa.pages.GoogleSearchResultPage;

public class GoogleSearchTest extends TestBase {
	GoogleSearchPage gsp;
	GoogleSearchResultPage gsrp;
	
	public GoogleSearchTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		//initialise();
		initialiseRemote();
		gsp = new GoogleSearchPage();
		gsrp = new GoogleSearchResultPage();		
	}
	
	/**@Test
	public void googleSearchTest1(){
		// Adaptavist Search Test
		gsp.goToGooglePage();
		//GoogleSearchResultPage pgf = gsp.doSearch("Adaptavist");
		//pgf.navigateAndScreeShot();
		gsp.doSearch("Adaptavist");	
		//gsrp.printList();
		gsrp.navigateAndScreeShot();
		
		
	}**/
	
	@Test
	public void googleSearchTest2(){
		// Atlassian Search Test
		gsp.goToGooglePage();
		gsp.doSearch("Atlassian");
		gsrp.verifyText("Adaptavist");
		
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	

}
