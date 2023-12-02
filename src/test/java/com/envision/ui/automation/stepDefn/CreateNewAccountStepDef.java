package com.envision.ui.automation.stepDefn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.envision.ui.automation.configuration.BrowserFactory;
import com.envision.ui.automation.pages.GmailAboutPage;
import com.envision.ui.automation.pages.GooglePage;

import io.cucumber.java.en.When;

public class CreateNewAccountStepDef extends BaseStepDef {

	private WebDriver driver;
	private GooglePage googlePage;
	private GmailAboutPage gmailAboutPage;
	
	public CreateNewAccountStepDef(BrowserFactory browserFactoryObject) {
		super(browserFactoryObject);
		// TODO Auto-generated constructor stub
	}

	@When("User enter Gmail Link")
	public void user_enter_gmail_link() {
	    this.driver = super.browserFactory.getDriverInstance();
	    this.googlePage = PageFactory.initElements(this.driver, GooglePage.class);
	    googlePage.clickGmailLink();
	}
	
	@When("User click Create New Account")
	public void user_click_create_new_account() {
	   this.gmailAboutPage = PageFactory.initElements(this.driver, GmailAboutPage.class);
	   this.gmailAboutPage.clickCreateNewAccount();
	}
}

