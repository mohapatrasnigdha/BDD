package com.own.pages;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.own.util.BaseDriver;

public class LogOutPage extends BaseDriver {
	//This is logout page for WordPress
	
	
	
	@FindBy(how = How.XPATH, using = "//button[@class='button sidebar__me-signout-button is-compact']")   //Click on log out button
	public WebElement logOut;
	
  
	public void logout() {
		logOut.click();
		
	}	
   
}
