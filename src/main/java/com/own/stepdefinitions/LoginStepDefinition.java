package com.own.stepdefinitions;



import com.own.pages.LoginPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginStepDefinition extends LoginPage {
	
	 LoginPage loginpg;
	 WebDriverWait wait;
	
	@Given("^user is already on login page$")
	public void user_is_already_on_login_page()  {
		loginpg=new LoginPage();
		loginpg.launchUrl("https://gmail.com");
	}
	

	@When("^title of login Page is Gmail$")
	public void title_of_login_Page_is_Gmail() {
		Assert.assertEquals(loginpg.checkTitle(), "Gmail");
	}
	
	
	@Then("^user enters username$")
	public void user_enters_username() {
		
		loginpg=PageFactory.initElements(driver, LoginPage.class);
		
		loginpg.inputUserName("urgmail ID");
		
		loginpg.nextButton(null);
	}
	
	@Then("^user enters password$")
	public void user_enters_password() {
		loginpg=PageFactory.initElements(driver, LoginPage.class);
		wait = new WebDriverWait(driver, 15, 100);
		
		wait.until(ExpectedConditions.elementToBeClickable(loginpg.password)).sendKeys("ur password");
		
		
		wait.until(ExpectedConditions.elementToBeClickable(loginpg.Next1)).click();
	} 
	   

			
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
	}

	@Then("^user should be on home page$")
	public void user_should_be_on_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^I should be happy$")
	public void sfsfsf() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

}
