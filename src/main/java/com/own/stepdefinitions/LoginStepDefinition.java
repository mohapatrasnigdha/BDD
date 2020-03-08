package com.own.stepdefinitions;



import com.own.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.own.util.BaseDriver;

public class LoginStepDefinition extends LoginPage {
	
	LoginPage loginpg= new LoginPage();
	
	@Given("^user is already on login page$")
	public void user_is_already_on_login_page()  {
		loginpg.launchUrl("https://gmail.com");
	}
	

	@When("^title of login Page is Gmail$")
	public void title_of_login_Page_is_Gmail() {
		Assert.assertEquals(loginpg.checkTitle(), "Gmail");
	}
	
	
	@Then("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
		WebDriver driver =LoginPage.getDriver();
		
		PageFactory.initElements(driver, loginpg);
	
		//read from a file 
		loginpg.inputUserName("khirodpanda");
	    // Write code here that turns the phrase above into concrete actions
	   
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
