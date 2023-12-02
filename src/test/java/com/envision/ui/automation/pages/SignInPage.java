package com.envision.ui.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {
	
	@FindBy(id = "identifierId")
	private WebElement emailTextBox;
	
	
	public void enterEmail(String inputEmail) {
		this.emailTextBox.sendKeys(inputEmail);
	}

}
