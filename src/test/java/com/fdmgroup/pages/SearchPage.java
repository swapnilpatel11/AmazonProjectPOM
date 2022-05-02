package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	//search for amazon website 
	public static WebElement websiteLink(WebDriver driver) 
	{
		return driver.findElement(By.xpath("//*[@id=\"tads\"]/div[1]/div/div/div/div[1]/a/div[1]/span")) ;
	}
	public static WebElement searchInputBox(WebDriver driver) {
		return driver.findElement(By.id("twotabsearchtextbox"));
	}
	public static WebElement searchField(WebDriver driver) {
		return driver.findElement(By.xpath("//span[contains(@class,'a-color-state a-text-bold')]"));	
	}
	public static WebElement searchresultsText(WebDriver driver) {
		return driver.findElement(By.xpath("//span[text()='RESULTS']"));
	}

	public static WebElement searchresultsFirstProductBrand(WebDriver driver) {
		return driver.findElement(By.xpath("(//div[contains(@cel_widget_id,'MAIN-SEARCH_RESULTS')]//h5/span)[1]"));
	}

	public static WebElement searchresultsLastProductBrand(WebDriver driver) {
		return driver.findElement(By.xpath("(//div[contains(@cel_widget_id,'MAIN-SEARCH_RESULTS')]//h5/span)[last()]"));
	}

	public static WebElement chooseBrandFromTheBrandRefinements(WebDriver driver,String brandName) {
		return driver.findElement(By.xpath("//div[@id='brandsRefinements']/ul/li[@aria-label='"+brandName+"']//input"));
	}

	public static WebElement selectSizeFromTheBrandFilters(WebDriver driver,String size) {
		return driver.findElement(By.xpath("//div[@id='filters']/ul/li//button[@aria-label='"+size+"']"));
	}

	public static WebElement selectColorFromTheBrandFilters(WebDriver driver,String color) {
		return driver.findElement(By.xpath("//div[@id='filters']/ul/li//a[@title='"+color+"']"));
	}
	
	
}
