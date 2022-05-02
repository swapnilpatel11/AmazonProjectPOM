package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

		public static WebElement searchbar(WebDriver driver) 
		{
			return driver.findElement(By.name("q")) ;
		}

}
