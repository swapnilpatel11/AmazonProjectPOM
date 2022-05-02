package com.fdmgroup.testscript;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fdmgroup.datafile.DataFile;
import com.fdmgroup.pages.SearchPage;
import com.fdmgroup.utill.DriverUtility;

public class SearchAnItemTest {
	private DriverUtility utility;
	private WebDriver driver;
	
	@Before
	public  void setup() 
	{ 
		utility =DriverUtility.getInstance();
		driver =utility.getDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void testSearchFUnctionality() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(DataFile.homePageURL);
		SearchPage.searchInputBox(driver).sendKeys(DataFile.searchData +Keys.ENTER);
		String Expected = SearchPage.searchField(driver).getText();
		System.out.println(Expected);
		String str1 =  Expected.replaceAll("\"", "");
		System.out.println(str1);
		assertEquals(DataFile.searchData,str1);
		System.out.println(str1);
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//label[text()='Sort by:']")).click();;
		//System.out.println(str1);
		 SearchPage.searchresultsText(driver).isDisplayed();
	        // SearchPage.chooseBrandFromTheBrandRefinements(driver, DataFile.brandName).click();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click()",SearchPage.chooseBrandFromTheBrandRefinements(driver, DataFile.brandName));
	    //    CommonUtils.jsClick(driver, SearchPage.chooseBrandFromTheBrandRefinements(driver, DataFile.brandName));
	        
	        SearchPage.selectSizeFromTheBrandFilters(driver, DataFile.brandSize).click();
	        //SearchPage.selectColorFromTheBrandFilters(driver, DataFile.brandColor).click();
	       js.executeScript("arguments[0].click()",SearchPage.selectColorFromTheBrandFilters(driver, DataFile.brandColor));
	        
	        Thread.sleep(5000);
	        
	        String ResultsText = SearchPage.searchresultsText(driver).getText();
	        assertEquals(DataFile.ResultsText, ResultsText);

			String firstProductBrandName = SearchPage.searchresultsFirstProductBrand(driver).getText();
	        String secondProductBrandName = SearchPage.searchresultsLastProductBrand(driver).getText();
			assertEquals(firstProductBrandName, secondProductBrandName);
		
	}
	
}
