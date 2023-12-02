#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@ValidateGooglePageScenarios
Feature: Title of your feature
  I want to use this template for my feature file

  @smokeTest @EnterEmailInSignInPage
  Scenario: enter Email in Sign In Page
    When User navigate to Google Page
    And User enter Gmail Link in Google Page
    And User clicks Sign In button to Login
    And User enter Email "ganesh@gmail.com"
    
   @regressionTest @smokeTest
  Scenario: Create New Account
    When User navigate to Google Page
    And User enter Gmail Link
    And User click Create New Account


