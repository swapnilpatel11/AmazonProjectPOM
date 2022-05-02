package com.fdmgroup.testscript;

import java.io.IOException;
import java.net.MalformedURLException;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import com.fdmgroup.pages.AmazonPage;
import com.fdmgroup.utill.DriverUtility;

public class NavigationBarTest {
	private DriverUtility driverUtilities;
	private WebDriver driver;

	@Before
	public void setUp() {
		driverUtilities = DriverUtility.getInstance();
		driver = driverUtilities.getDriver();
	}

	@Test
	public void navigationBarTest() throws MalformedURLException, IOException, InterruptedException {
//		driver.manage().window().maximize();
//		driver.get(DataFile.homePageURL);
		String actual = AmazonPage.navigationBar(driver).getText();
		System.out.println("-----------Quick Links------------");
		System.out.println(actual);		
	}
}
