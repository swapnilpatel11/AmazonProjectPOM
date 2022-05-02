package com.fdmgroup.utill;

//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtility {
	
	private static DriverUtility utility; //private static instance 
	private WebDriver driver;
	
	private DriverUtility() {  //private constructoer 
		super();
	}
	
	public static DriverUtility getInstance() { //static getinstance method to create object for class
		if(utility == null) {
			utility =new DriverUtility();
		}
		return utility;
	}

	public WebDriver getDriver() {
		if(driver==null) {
			createDriver();
		}
		return driver;
	}

	private void createDriver() {
		String driverName = getDriverName();
		// TODO Auto-generated method stub
		switch(driverName) {
		
		case "google chrome":
			System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
			this.driver= new ChromeDriver();
			break;
		}
		
	}

	private String getDriverName() {
		//Properties config = new Properties();
		String driverName= "google chrome";
		
//		try {
//			config.load(new FileInputStream("src\\test\\resources\\config.properties"));
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		for (String key : config.stringPropertyNames())
//		{
//			if(key.equals("browser")) 
//			{
//				driverName = config.getProperty(key);
//			}
//		}
		return driverName;
	}
	

	
}
