package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//login pocess 
public class LoginPage {
	
	public static WebElement email(WebDriver driver) 
	{
		return driver.findElement(By.id("ap_email")) ;
	}
	
	public static WebElement submit(WebDriver driver) 
	{
		return driver.findElement(By.id("continue"));
	}
	public static WebElement password(WebDriver driver) 
	{
		return driver.findElement(By.name("password"));
	}
	public static WebElement checkbox(WebDriver driver) 
	{
		return driver.findElement(By.xpath("//*[contains(@type,'checkbox')]"));
	}
	
	public static WebElement enter(WebDriver driver) 
	{
		return driver.findElement(By.xpath("//*[contains(@id,'signInSubmit')]"));
	}
	
}
