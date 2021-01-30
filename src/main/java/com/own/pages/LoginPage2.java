package com.own.pages;

import java.awt.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.own.util.BaseDriver;

public class LoginPage2 extends BaseDriver {
	//This is signin page for Wordpress
	
	@FindBy(name = "usernameOrEmail")  //enter user name
	public WebElement userName;
	
	@FindBy (name ="password")   //enter password
	public WebElement password; 
	
	@FindBy(how = How.XPATH, using = "//button[@class='button form-button is-primary']")   //Click on button
	public WebElement logIn;
	
	
	
   public void inputUserName(String uname) {
		
	   userName.sendKeys(uname);
	}

   public void inputPassWord(String upass) {
		
		password.sendKeys(upass);
	}
   
   
     
   public void launchUrl(String url) {
		driver.get(url);
	}	
	
     

	public void logInButton() {
		// TODO Auto-generated method stub
		logIn.click();
		
	}

	
   
}
