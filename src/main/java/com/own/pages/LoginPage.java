package com.own.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.own.util.BaseDriver;

public class LoginPage extends BaseDriver {
	
	@FindBy(id = "identifierId")
	private WebElement userName;
	
	@FindBy (name ="password")
	private WebElement passWord; 
	
	
	@FindBy (xpath = "\"//span[contains(text(), 'Next')]\"")
	private WebElement Next;
	
//	@FindBy (tagName ="Title")
//	private WebElement title;
	
	
	public void inputUserName() {
		String username="khirodpanda4add";
		//driver.get("")
	}
	
	public String checkTitle() {
		System.out.println(" Title Is "+BaseDriver.getDriver().getTitle());
		return BaseDriver.getDriver().getTitle();
	}

}
