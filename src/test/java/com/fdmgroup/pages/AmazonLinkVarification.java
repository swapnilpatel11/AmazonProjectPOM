package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonLinkVarification {
	
	//correct website link 
	public static WebElement link(WebDriver driver) 
	{
		return driver.findElement(By.id("nav-logo-sprites"));
	}

}
