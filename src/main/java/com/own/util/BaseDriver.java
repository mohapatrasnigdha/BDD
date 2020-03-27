/**
 * 
 */
package com.own.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.own.pages.LoginPage;

/**
 * @author snigdhamohapatra
 *
 */
public class BaseDriver {

	public BaseDriver()
	{
		getDriver();
		
	}
	public static WebDriver driver =null;
	
	private static WebDriver getDriver() {
		
		if(driver == null) {//Create a Singleton instance of driver
			System.setProperty("webdriver.chrome.driver", "/Users/ketansaxena/codebase/BDD/chromedriver");
			
			driver = new ChromeDriver();
			
			
		}
		return driver;
		
	}

	
}
