package com.fdmgroup.testscript;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.net.MalformedURLException;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fdmgroup.datafile.DataFile;
import com.fdmgroup.pages.AmazonPage;
import com.fdmgroup.utill.DriverUtility;

public class FooterLinksTest {
	private DriverUtility driverUtilities;
	private WebDriver driver;

	@Before
	public void setUp() {
		driverUtilities = DriverUtility.getInstance();
		driver = driverUtilities.getDriver();
	}

	@Test
	public void footerLinkStatusCheck() throws MalformedURLException, IOException {
		// verify total links available in footer
		int allLinks = AmazonPage.footerLinks(driver).size();
		assertEquals(23, allLinks);

		// it checks link is available or not
		String linkName = AmazonPage.footerLinks(driver).get(1).getText();
		assertEquals(DataFile.footerLinkName, linkName);
		System.out.println("-----------Footer Links---------");
		// this code will check status code
		for (WebElement link : AmazonPage.footerLinks(driver)) {

			System.out.println(link.getText());

		}
	}
}
