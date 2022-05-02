package com.fdmgroup.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewReleasesPage {
	public static WebElement newReleasePageLabel(WebDriver driver) {
		return driver.findElement(By.id("zg_banner_text"));
	}
	
	public static List<WebElement> newProducts(WebDriver driver){
		return driver.findElements(By.cssSelector("div[id='anonCarousel1'] ol[role='list']"));
	}
}
