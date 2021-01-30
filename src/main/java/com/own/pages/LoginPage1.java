package com.own.pages;

import java.awt.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.own.util.BaseDriver;

public class LoginPage1 extends BaseDriver {
	
	//This is home page for wordpress
	
	@FindBy(how = How.LINK_TEXT, using = "Sign In")  //sign in link
	public WebElement signin;
	

   
     public void launchUrl(String url) {
		driver.get(url);
	}	
	
	
     public String checkTitle() {
		
		return driver.getTitle();
	}


	public void signInButton() {
		// TODO Auto-generated method stub
		
	}

	

	
   
}
