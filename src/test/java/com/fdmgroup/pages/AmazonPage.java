package com.fdmgroup.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonPage {
	//amazon without signin 
	public static WebElement siginbutton(WebDriver driver) 
	{
		return driver.findElement(By.id("nav-link-accountList-nav-line-1")) ;
	}
	
	public static WebElement navigationBar(WebDriver driver) {
		return driver.findElement(By.cssSelector("div[id='nav-main'] div[class='nav-fill']"));
	}
	
	public static List<WebElement> footerLinks(WebDriver driver){
		return driver.findElements(By.cssSelector(".navFooterVerticalRow.navAccessibility a"));
	}
	
	public static WebElement bestSeller(WebDriver driver) {
		return driver.findElement(By.xpath("//a[@href='/Best-Sellers-generic/zgbs/?ref_=nav_cs_bestsellers']"));
	}
	
	public static WebElement newReleases(WebDriver driver) {
		return driver.findElement(By.xpath("//a[@href='/gp/new-releases/?ref_=nav_cs_newreleases']"));
	}

}
