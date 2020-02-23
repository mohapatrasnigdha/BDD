package com.own;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
/**
 * 
 */

/**
 * @author snigdhamohapatra
 *
 */



@RunWith(Cucumber.class)
@CucumberOptions(
		
		features ="/Users/snigdhamohapatra/eclipse-workspace/MyBDDAutomation/src/main/resources/features/login.feature",
		glue= {"/Users/snigdhamohapatra/eclipse-workspace/MyBDDAutomation/src/main/java/stepDefinitions"}
		
		)

public class TestRunner {

}
