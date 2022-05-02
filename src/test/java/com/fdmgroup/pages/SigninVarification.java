package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SigninVarification {
	//correct user varification 
	public static WebElement getuser(WebDriver driver) 
	{
		return driver.findElement(By.xpath("//*[contains(@id,'nav-link-accountList-nav-line-1')]"));
	}
}
