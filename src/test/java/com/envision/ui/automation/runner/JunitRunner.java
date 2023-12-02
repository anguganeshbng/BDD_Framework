package com.envision.ui.automation.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		        features = {"./Features"},
				glue = { "com.envision.ui.automation.stepDefn",
						"com.envision.ui.automation.configuration"}, 
				tags = "@smokeTest", 
				publish = true, 
				dryRun = false, 
				plugin = {

						"pretty",
						"html:target/cucumberHTML/cucumber-html-report.html",
						"json:target/cucumberJson/cucumber.json",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		        } 
) 

public class JunitRunner {

}
