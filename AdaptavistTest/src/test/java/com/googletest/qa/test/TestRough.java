package com.googletest.qa.test;

import org.testng.annotations.Test;

import com.googletest.qa.base.TestBase;

 

public class TestRough extends TestBase {
	
	@Test
	public void testGoogle(){
		
		System.out.println(System.getProperty("user.dir"));//System.getProperty("user.dir")
	
	String URL =	prop.getProperty("url");
	System.out.println(URL + System.currentTimeMillis());
		
	}

}
