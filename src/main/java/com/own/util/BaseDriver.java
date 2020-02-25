/**
 * 
 */
package com.own.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author snigdhamohapatra
 *
 */
public class BaseDriver {

	
	private static WebDriver driver =null;
	
	protected BaseDriver() {
		System.out.print("");
	}
	public static WebDriver getDriver() {
		
		if(driver == null) {//Create a Singleton instance of driver
			System.setProperty("webdriver.chrome.driver", "/Users/snigdhamohapatra/Jars/chromedriver");
			
			driver = new ChromeDriver();
			
			
		}
		return driver;
		
	}

		
	
}
