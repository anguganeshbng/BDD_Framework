package com.envision.ui.automation.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
		
		features = {"./Features"},
		glue = { "com.envision.ui.automation.stepDefn",
				"com.envision.ui.automation.configuration"}, 
		tags = "@regressionTest", 
		publish = true, 
		dryRun = false, 
		plugin = {


				"pretty",
				"html:target/cucumberHTML/cucumber-html-report.html",
				"json:target/cucumberJson/cucumber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        } 
		
)



public class TestNGRunner_Regression extends AbstractTestNGCucumberTests {

}
