package com.envision.ui.automation.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utilities {
	
	public void getScreenshot(WebDriver driver, String scenarioName) {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source =  ts.getScreenshotAs(OutputType.FILE);
		String filePath = "target/Screenshot/" + scenarioName + ".PNG";
		
		File destination = new File(filePath);
		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	public String getBase64Screenshot(WebDriver driver) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		String base64 =  ts.getScreenshotAs(OutputType.BASE64);
		return base64;
	}
	
	
}
