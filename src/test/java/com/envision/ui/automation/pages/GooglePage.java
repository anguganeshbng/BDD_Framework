package com.envision.ui.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage {
	
	@FindBy(linkText = "Gmail")
	private WebElement gmail;
	
	@FindBy(xpath = "(//input[@value='Google Search'])[2]")
	private WebElement googleSearch;
	
	
	
	public void clickGmailLink() {
		this.gmail.click();
	}
	

}
