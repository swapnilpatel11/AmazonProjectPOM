package com.fdmgroup.testscript;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fdmgroup.datafile.DataFile;
import com.fdmgroup.pages.AmazonPage;
import com.fdmgroup.pages.NewReleasesPage;
import com.fdmgroup.utill.DriverUtility;

public class NewReleasesTest {
	private DriverUtility driverUtilities;
	private WebDriver driver;

	@Before
	public void setUp() {
		driverUtilities = DriverUtility.getInstance();
		driver = driverUtilities.getDriver();
	}
	@Test
	public void newReleasesPageTest() {
		AmazonPage.newReleases(driver).click();
		String actual = NewReleasesPage.newReleasePageLabel(driver).getText();
		//Check right page or not
		assertEquals(DataFile.newReleaseLabel,actual);

		System.out.println("----------New Products---------");
		//Print the new Product list
		for(WebElement product : NewReleasesPage.newProducts(driver)) {
			System.out.println("--------");
			System.out.println(product.getText());
			System.out.println("------------------");
		}
	}
	

}
