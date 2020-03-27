package com.own.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.own.pages.LandingPage;
import com.own.pages.LogOutPage;
import com.own.pages.LoginPage;
import com.own.pages.LoginPage1;
import com.own.pages.LoginPage2;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition1 extends LoginPage1{
	
	LoginPage1 loginpg1;
	LoginPage2 loginpg2; 
	LandingPage landingpg1;
	LogOutPage logoutpg1;
	WebDriverWait wait;
	 
	 
	 @Given("^user is on Home page$")
		public void home_page()  {
			loginpg1=new LoginPage1();
			loginpg1.launchUrl("https://wordpress.com/?apppromo");
		}
	 
	 @And("^title of homepage is Wordpress.com$")
		public void title_page() {
			Assert.assertEquals(loginpg1.checkTitle(), "WordPress.com");
		}
	 
	 
	 @And("^user Taps on signin button$")
		public void Sign_in() {
		 
		 // Fetching page-object of LoginPage1 from page-object factory
		 loginpg1=PageFactory.initElements(driver, LoginPage1.class);
		 
		 // calling Sign button from above loaded page object
		 loginpg1.signInButton();
		 
		 // As signing page is a different URL , registering new page-object in page-object factory
		 loginpg2=new LoginPage2();
		 
	     //Getting the signing-page url from anchor tag of signing
		
		 String url= loginpg1.signin.getAttribute("href");
		 
		 //Launching new page
		 loginpg2.launchUrl(url);
		 
		}
	 
	 
	 // Login Page 2 Starts ASK FOR USER NAME & PWD
	 @When("^user enters username in textbox$")
		public void user_enters_username() {
			
			loginpg2=PageFactory.initElements(driver, LoginPage2.class);
			
			loginpg2.inputUserName("Your email");
			
			loginpg2.logInButton();
		}
	 
	 @And("^user enters password in textbox$")
		public void user_enters_password() {
			loginpg2=PageFactory.initElements(driver, LoginPage2.class);
			
			//*Wait introduced as the element becomes visible after sometime on this page*//
			
			wait = new WebDriverWait(driver, 15, 100);
			
			wait.until(ExpectedConditions.elementToBeClickable(loginpg2.password)).sendKeys("Your Password");
			
			wait.until(ExpectedConditions.elementToBeClickable(loginpg2.logIn)).click();

          }
	 
	 @Then("^user is taken to landing page$")
		public void landing_page() {	 	 
		 
	 }
	 
	 @And("^user clicks on avatar icon$") 
	   public void avatar_icon() {
		 landingpg1=PageFactory.initElements(driver, LandingPage.class);
		 
          wait = new WebDriverWait(driver, 15, 100); //Introduced wait as page is rendered after sometime.
		 
		 wait.until(ExpectedConditions.elementToBeClickable(landingpg1.meLink)).click();
	 }
	   
	 @Then("^user taps on log out button$")
	  public void log_out() {
		 
		 logoutpg1=PageFactory.initElements(driver, LogOutPage.class);
		 logoutpg1.logout();
		 
	 }
	 
	 
	 }
	 
