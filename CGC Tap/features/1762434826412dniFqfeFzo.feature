Feature: Login with valid credentials
 As a user
 I want to log in with an email address at the maximum allowed length
 So that I can access the home screen

 Background:
  Given I am on the login page

 Scenario: User logs in with maximum length email and valid password
  Given the email input field contains "a * 1000"
  And the password input field contains "validPassword123"
  When I click the login button
  Then the home screen should load without errors
  And I should be navigated to the home screen
  And the Google Map should be displayed
  And the menu bar should be visible
 As a user
 I want to log in with a password at the minimum allowed length
 So that I can access the home screen

  Given I am on the login page

 Scenario: User logs in with valid credentials and minimum length password
  Given I enter a valid email address "krishna@gmail.com" in the email input field
  And I enter a password "a * 6" in the password input field
  When I click the login button
  Then the home screen should load without errors
  And I should be navigated to the home screen
  And the Google Map should be displayed
  And the menu bar should be visible on the home screen
 As a user
 I want to log in with an email address containing special characters
 So that I can access my account

  Given I am on the login page

 Scenario: User logs in with an email address containing special characters
  Given I enter "krishna!@gmail.com" in the email input field
  And I enter "validPassword123" in the password input field
  When I click the login button
  Then the home screen should load without errors
  And I should be navigated to the home screen
  And the Google Map should be displayed
  And the menu bar should be visible on the home screen

 As a user
 I want to log in with an email address containing consecutive dots
 So that I can access my account

  Given I am on the login page

 Scenario: User logs in with an email address containing consecutive dots
  Given I enter the email "krishna..gmail.com" in the email input field
  And I enter the password "validPassword123" in the password input field
  When I click the login button
  Then the home screen should load without errors
  And I should be navigated to the home screen
  And the Google Map should be displayed
  And the menu bar should be visible on the home screen

 As a user
 I want to log in with an email address containing a plus sign
 So that I can access my account successfully

  Given I am on the login page

 Scenario: User logs in with an email address containing a plus sign
  Given I enter the email "krishna+test@gmail.com" in the email input field
  And I enter the password "validPassword123" in the password input field
  When I click the login button
  Then the home screen should load without errors
  And I should be navigated to the home screen
  And the Google Map should be displayed
  And the menu bar should be visible on the home screen

 As a user
 I want to log in with an email address containing a hyphen
 So that I can access the home screen

  Given I am on the login page

 Scenario: User logs in with a valid email address containing a hyphen
  Given I enter "krishna-smith@gmail.com" in the email input field
  And I enter "validPassword123" in the password input field
  When I click the login button
  Then the home screen should load without errors
  And I should be navigated to the home screen
  And the Google Map should be displayed
  And the menu bar should be visible
 As a user
 I want to log in with an email address containing numeric characters
 So that I can access the home screen

  Given I am on the login page

 Scenario: User logs in with an email containing numeric characters
  Given I enter "user123@gmail.com" in the email input field
  And I enter "validPassword123" in the password input field
  When I click the login button
  Then the home screen should load without errors
  And I should be navigated to the home screen
  And the Google Map should be displayed
  And the menu bar should be visible
