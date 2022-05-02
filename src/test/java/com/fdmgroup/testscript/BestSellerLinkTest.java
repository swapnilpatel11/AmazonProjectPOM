package com.fdmgroup.testscript;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fdmgroup.datafile.DataFile;
import com.fdmgroup.pages.AmazonPage;
import com.fdmgroup.pages.BestSellerPage;
import com.fdmgroup.utill.DriverUtility;

public class BestSellerLinkTest {
	private DriverUtility driverUtilities;
	private WebDriver driver;

	@Before
	public void setUp() {
		driverUtilities = DriverUtility.getInstance();
		driver = driverUtilities.getDriver();
	}
	
	@Test
	public void bestSellerLinkCheck() {
	AmazonPage.bestSeller(driver).click();
	String actual = BestSellerPage.bestSellerLabel(driver).getText();
	//Check right page or not
	assertEquals(DataFile.bestSellerLabel,actual);
	//driver.navigate().back();
	System.out.println("-----Best Seller Products------");
	for(WebElement product : BestSellerPage.bestProducts(driver)) {
		System.out.println("----");
		System.out.println(product.getText());
		System.out.println("-----------------");
	}
	}

}
