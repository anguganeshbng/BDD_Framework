package com.envision.ui.automation.configuration;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.model.Media;
import com.envision.ui.automation.utilities.ReadInputDetails;
import com.envision.ui.automation.utilities.Utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {

	private WebDriver driver;

	
	// Get Driver Instance Method
	// New changes
	public WebDriver getDriverInstance() {
		return this.driver;
	}
	
	@Before
	public void launchBrowser(Scenario scenario) {

		ReadInputDetails readData = new ReadInputDetails();
		String brname = readData.readPropertiesFile("src/test/resources/Properties/config.properties", "brname");

		
		switch (brname) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			this.driver = new ChromeDriver();
			break;
		case "firefox": 
			this.driver = new FirefoxDriver();
			break;
		case "edge":
			this.driver = new EdgeDriver();
			break;
		default:
			break;	
		}
		
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		this.driver.manage().window().maximize();
	}
	
	@After
	public void tearDown(Scenario scenario) {
		
		String scenarioName = scenario.getName();
		if(!scenario.getStatus().equals(Status.PASSED)) {
			
			Utilities utilities = new Utilities();
			utilities.getScreenshot(this.driver, scenarioName);
			String base64Type = utilities.getBase64Screenshot(this.driver);
		//	ExtentCucumberAdapter.getCurrentStep().addScreenCaptureFromBase64String(base64Type);
			
			com.aventstack.extentreports.Status status = com.aventstack.extentreports.Status.FAIL;
			Markup markup = MarkupHelper.createLabel(scenarioName + " is Failed", ExtentColor.RED);
			Media media = MediaEntityBuilder.createScreenCaptureFromBase64String(base64Type).build();
			ExtentCucumberAdapter.getCurrentStep().log(status, markup, media);
			
		}
		
		
		
		if(this.driver != null) {
			this.driver.close();
			this.driver.quit();
		}
	}
	
	
	
	
}
