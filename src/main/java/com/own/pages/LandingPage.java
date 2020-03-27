package com.own.pages;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.own.util.BaseDriver;

public class LandingPage extends BaseDriver {
	//This is landing page for WordPress
	
	
	
	@FindBy(how = How.XPATH, using = "//a[@class='masterbar__item masterbar__item-me']")   //Click on avatar icon
	public WebElement meLink;
	       
	public void clickmeLink() {
		meLink.click();
		
	}

	public void launchUrl(String url) {
		driver.get(url);
		
	}

	

	

	
   
}
