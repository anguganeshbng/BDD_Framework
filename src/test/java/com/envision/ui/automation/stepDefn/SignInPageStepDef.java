package com.envision.ui.automation.stepDefn;

//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.envision.ui.automation.configuration.BrowserFactory;
import com.envision.ui.automation.pages.GmailAboutPage;
import com.envision.ui.automation.pages.GooglePage;
import com.envision.ui.automation.pages.SignInPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInPageStepDef extends BaseStepDef {

	private WebDriver driver;
	private GooglePage googlePage;
	private GmailAboutPage gmailAboutPage;
	private SignInPage signInPage;
	

	public SignInPageStepDef(BrowserFactory browserFactoryObject) {
		// TODO Auto-generated constructor stub
		super(browserFactoryObject);
	}

	@When("User navigate to Google Page")
	public void navigateToGooglePage() {
		this.driver = super.browserFactory.getDriverInstance();
		this.driver.get("https://www.google.com");
	}

	@When("User enter Gmail Link in Google Page")
	public void user_enter_gmail_link_in_google_page() {
	 this.googlePage = PageFactory.initElements(this.driver, GooglePage.class);
	 this.googlePage.clickGmailLink();
		
	}

	@When("User clicks Sign In button to Login")
	public void userClicksSignInButton() {
		this.gmailAboutPage =	PageFactory.initElements(this.driver, GmailAboutPage.class);
		this.gmailAboutPage.clickSignIn();
	}

	@When("User enter Email {string}")
	public void user_enter_email(String inputEmail) {
	   this.signInPage = PageFactory.initElements(this.driver, SignInPage.class);
	   this.signInPage.enterEmail(inputEmail);		
	}


}
