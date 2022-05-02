package com.fdmgroup.testscript;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.fdmgroup.datafile.DataFile;
import com.fdmgroup.pages.AmazonLinkVarification;
import com.fdmgroup.pages.AmazonPage;
import com.fdmgroup.pages.LoginPage;
import com.fdmgroup.pages.MainPage;
import com.fdmgroup.pages.SearchPage;
import com.fdmgroup.pages.SigninVarification;
import com.fdmgroup.utill.DriverUtility;

public class SigniinFunctionality {

	private DriverUtility utility;
	private WebDriver driver;
	
	@Before
	public  void setup() 
	{ 
		utility =DriverUtility.getInstance();
		driver =utility.getDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10 ));
	}
	
	@Test
	public void testLoginFunctionality() 
	{
		driver.manage().window().maximize(); //maximize the window
		driver.get(DataFile.browser); //open the search engine
		MainPage.searchbar(driver).sendKeys(DataFile.searchKeyword + Keys.ENTER); //enter the value in search bar
		SearchPage.websiteLink(driver).click(); //get the link for the website
		
		//checking for amazon website
		assertEquals(DataFile.logo, AmazonLinkVarification.link(driver).getText());
		
		AmazonPage.siginbutton(driver).click(); //for login
		
		//login functionality 
		LoginPage.email(driver).sendKeys(DataFile.username); //username 
		LoginPage.submit(driver).click();
		LoginPage.password(driver).sendKeys(DataFile.password); //password
		
		//check box 
		System.out.println("Before Clicking" + LoginPage.checkbox(driver).isSelected());
		LoginPage.checkbox(driver).click();
		System.out.println("After Clicking" + LoginPage.checkbox(driver).isSelected());
		
		//final click before signin 
		LoginPage.enter(driver).click();
		
		//correct user sign in varification 
		assertEquals(DataFile.usr, SigninVarification.getuser(driver).getText());
	}
}
