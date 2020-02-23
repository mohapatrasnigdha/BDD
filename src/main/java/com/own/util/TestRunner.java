package com.own.util;

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
		
		features ="/Users/snigdhamohapatra/eclipse-workspace/MyBDDAutomation/src/main/resources/features",
		glue= {"com.own.stepdefinitions"}
		
		)

public class TestRunner {

}
