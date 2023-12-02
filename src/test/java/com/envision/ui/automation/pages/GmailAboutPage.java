package com.envision.ui.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GmailAboutPage {

	@FindBy(linkText = "Sign in")
	private WebElement signIn;
	
	@FindBy(xpath = "(//*[text()='Create an account'])[15]")
	private WebElement createNewAccount;
	

	public void clickSignIn() {
		this.signIn.click();
	}
	
	public void clickCreateNewAccount() {
		this.createNewAccount.click();
	}

}
