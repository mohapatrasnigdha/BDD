package com.own.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.own.util.BaseDriver;

public class LoginPage extends BaseDriver {
	
	@FindBy(id = "identifierId")
	private WebElement userName;
	
	@FindBy (name ="password")
	public WebElement password; 
	
	@FindBy(id = "identifierNext")
	public WebElement Next;
	
	@FindBy(id = "passwordNext")
	public WebElement Next1;
	
	public void launchUrl(String url) {
		driver.get(url);
	}	
		
	public void inputUserName(String uname) {
		
		userName.sendKeys(uname);
	}
	
     public void inputPassWord(String upass) {
		
		password.sendKeys(upass);
	}
      
     
     public void nextButton(String unext) {
 		
 		Next.click();
 	}
       
     public void nextButton1(String unext1) {
  		
  		Next1.click();
  	} 
	
	public String checkTitle() {
		
		return driver.getTitle();
	}

}
