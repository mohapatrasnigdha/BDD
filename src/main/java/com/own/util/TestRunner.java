package com.own.util;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
/**
 * 
 */

/**
 * @author Deepti Kandpal
 *
 */



@RunWith(Cucumber.class)
@CucumberOptions(
		
		features ="/Users/ketansaxena/codebase/deeptiBDD/BDD/src/main/resources/features/Login1.feature",
		glue= {"com.own.stepdefinitions/"}
		
		)

public class TestRunner {

}
