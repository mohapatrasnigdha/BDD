package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class LoginStepDefinition {
	
	WebDriver driver;
	
	@Given("^User is already on login page$")
	public void user_is_already_on_login_page()  {
		System.setProperty("webdriver.chrome.driver", "/Users/snigdhamohapatra/Jars/chromedriver");
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.get("https://gmail.com");
		
	   
	}

}
