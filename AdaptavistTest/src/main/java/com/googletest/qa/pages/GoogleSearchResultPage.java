package com.googletest.qa.pages;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.googletest.qa.base.TestBase;

public class GoogleSearchResultPage extends TestBase {
	
	@FindBy(css ="div.r>a>h3")
	private List<WebElement> searchResults;
	
	public GoogleSearchResultPage(){
		PageFactory.initElements(driver,this);
	}
	
	public List<WebElement> getResults(){
		return this.searchResults;
		
	}
	
	public void printList(){
		for(int i=0; i<getResults().size();i++){
			System.out.println("printing list " + searchResults.get(i).getText());
		}
	}
	
	public void getScreenShot(int screenNumber){
		System.out.println("Enter getScreenShot.....");
		String filePath = System.getProperty("user.dir")+"//ScreenShots//"+screenNumber+".png";
		//":"+System.currentTimeMillis()+
		File targetFile = new File(filePath);
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(srcFile, targetFile);			 

		} catch (IOException e) {
			e.printStackTrace();
		}	
	//	FileUtils. copyFile(src, new File("C:/selenium/"+System.currentTimeMillis()+".png")); }
	}
	
	 
	
	public void navigateAndScreeShot(){
		for(int i=0; i<getResults().size();i++){
			if(getResults().get(i).getText().contains("Adaptavist")){
				getResults().get(i).click();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				getScreenShot(i);
				//get screen shoot and navigate back
				driver.navigate().back();
			}
			
		}
		
		
	}
	
	
	public void verifyText(String text){
		for(int i=0; i<getResults().size();i++){
			Assert.assertTrue(!(getResults().get(i).getText().contains("Adaptavist")));			
		}	
		
	}
	

}
