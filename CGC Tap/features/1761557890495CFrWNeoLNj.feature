Feature: Login with valid credentials
 As a registered user
 I want to log in using valid credentials
 So that I can access the home screen

 Background:
  Given the user is on the login page

 Scenario: Successful login with valid credentials
  Given the user enters a valid email address "krishna@gmail.com"
  And the user enters a valid password "ValidPassword123"
  When the user verifies that the login button is enabled
  And the user clicks the login button
  Then the user should be logged in successfully
  And the home screen should load without errors
  And the Google Map should be displayed on the home screen
  And the menu bar and recenter icon should be visible on the home screen
 As a user
 I want to log in successfully with valid credentials and the "Remember Me" option checked
 So that my session persists after logging out

  Given I am on the login page

 Scenario: User logs in with valid credentials and "Remember Me" checked
  When I enter a valid email address "krishna@gmail.com"
  And I enter a valid password "ValidPassword123"
  And I check the "Remember Me" checkbox
  And I click the login button
  Then I should be logged in successfully
  And the home screen should load without errors

 Scenario: User logs out and returns to the login page
  Given I am logged in
  When I log out of the application
  And I navigate back to the login page
  Then the email field should be pre-filled with "krishna@gmail.com"
 As a user
 I want to log in successfully using valid credentials that do not contain special characters
 So that I can access the home screen

  Given I am on the login page

 Scenario: User logs in with valid credentials
  Given I enter a valid email address "krishna@gmail.com" in the email input field
  And I enter a valid password "validPassword123" in the password input field
  Then the login button should be enabled
  When I click the login button
  Then I should be logged in successfully
  And the home screen should load without errors
  And the Google Map should be displayed on the home screen
  And the menu bar and recenter icon should be visible on the home screen
 As a user
 I want to log in successfully using valid credentials with different cases for email and password
 So that I can access the home screen

  Given I am on the login page

 Scenario: User logs in with valid credentials using different casing
  Given I enter the email "krishna@gmail.com" in the email input field
  And I enter the password "Password123" in the password input field
  Then the login button should be enabled
  When I click the login button
  Then I should be logged in successfully
  And the home screen should load without errors
  And the Google Map should be displayed on the home screen
  And the menu bar and recenter icon should be visible on the home screen

 As a user
 I want to log in successfully using valid credentials
 Even with a slow network connection

  Given the slow network is simulated

 Scenario: User logs in with valid credentials
  When I navigate to the login page
  And I enter a valid email address "krishna@gmail.com"
  And I enter a valid password "validPassword123"
  And I click the login button
  Then the user should be logged in successfully
  And the home screen should load without errors
  And the Google Map should be displayed on the home screen
  And the menu bar and recenter icon should be visible on the home screen

 As a user
 I want to log in successfully using valid credentials
 So that my session persists after refreshing the browser

  Given I am on the login page

 Scenario: User logs in with valid credentials and session persists
  When I enter "krishna@gmail.com" in the email input field
  And I enter "ValidPassword123" in the password input field
  And I click the login button
  Then I should be logged in successfully
  And the home screen should load without errors
  When I refresh the browser
  Then the Google Map should still be displayed on the home screen
  And the menu bar and recenter icon should still be visible
 As a user
 I want to log in successfully using valid credentials across different web browsers
 So that I can access my account

  Given the application is open

 Scenario: Successful login in Chrome
  When I navigate to the login page in Chrome
  And I enter a valid email address "krishna@gmail.com"
  And I enter a valid password "validPassword123"
  And I click the login button
  Then I should see the home screen load without errors

 Scenario: Successful login in Firefox
  When I navigate to the login page in Firefox
  And I enter a valid email address "krishna@gmail.com"
  And I enter a valid password "validPassword123"
  And I click the login button
  Then I should see the home screen load without errors
 As a user
 I want to log in successfully using valid credentials on a mobile device
 So that I can access the home screen features

  Given the application is opened on a mobile device
  And the login page is displayed

 Scenario: User logs in with valid credentials
  Given I enter a valid email address "krishna@gmail.com"
  And I enter a valid password "ValidPassword123"
  When I click the login button
  Then I should be logged in successfully
  And the home screen should load without errors
  And the Google Map should be displayed correctly
  And the menu bar and recenter icon should be visible on the home screen

 As a user
 I want to log in successfully using valid credentials
 So that I can access my account and be logged out after a period of inactivity

  Given I am on the login page

 Scenario: Successful login with valid credentials
  When I enter a valid email "krishna@gmail.com"
  And I enter a valid password "ValidPassword123"
  And I click the login button
  Then I should be logged in successfully
  And the home screen should load without errors

 Scenario: Session timeout after inactivity
  Given I am logged in
  When I remain inactive for the session timeout period
  And I attempt to navigate to another page
  Then I should be prompted to log in again
  And I should not be able to access other pages without logging in
 As a user
 I want to log in successfully using valid credentials
 So that I can access the home screen with the Google Map displayed

  Given I am on the login page

 Scenario: User logs in with valid credentials and verifies password visibility
  Given I enter a valid email address "krishna@gmail.com"
  And I enter a valid password "ValidPassword123"
  When I click the password visibility toggle
  Then the password should be visible
  When I click the login button
  Then I should be logged in successfully
  And the home screen should load without errors
  And the Google Map should be displayed correctly

 As a user
 I want to log in successfully using valid credentials
 So that I can access the home screen and navigate back to the login page if needed

  Given I am on the login page

 Scenario: User logs in with valid credentials and uses the back button
  When I enter a valid email "krishna@gmail.com" in the email input field
  And I enter a valid password "validPassword123" in the password input field
  And I click the login button
  Then I should be logged in successfully
  And the home screen should load without errors
  When I click the browser back button
  Then the login page should be displayed
  And I should still be logged in

 As a user
 I want to log in successfully using valid credentials
 So that I can access my account while having multiple tabs open

  Given the application is open in one tab
  And the login page is displayed

 Scenario: User logs in with valid credentials and verifies session in multiple tabs
  When I enter a valid email "krishna@gmail.com" in the email input field
  And I enter a valid password "validPassword123" in the password input field
  And I click the login button
  Then I should be logged in successfully
  And I open a new tab and navigate to the application
  Then I should see that I am still logged in in the first tab
  And the login page should be displayed in the new tab

 As a user with different roles
 I want to log in successfully using valid credentials
 So that I can access the home screen

  Given I am on the login page

 Scenario: Admin user logs in successfully
  When I enter "admin@example.com" as the email
  And I enter "SecurePassword123" as the password
  And I click the login button
  Then I should be redirected to the home screen
  And I should see the home screen without errors
  When I log out of the application

 Scenario: Regular user logs in successfully
  When I enter "user@example.com" as the email
  And I enter "SecurePassword123" as the password
  And I click the login button
  Then I should be redirected to the home screen
  And I should see the home screen without errors
 As a user
 I want to log in using valid credentials
 So that I can access my account and ensure session data is stored correctly

  Given I am on the login page

 Scenario: User logs in successfully with valid credentials
  When I enter "krishna@gmail.com" in the email input field
  And I enter "ValidPassword123" in the password input field
  And I click the login button
  Then I should see the home screen
  And the home screen should load without errors
  And I open the browser's developer tools
  And I check the session storage for user data
  Then the user data should be stored correctly in session storage
 As a user
 I want to log in successfully using valid credentials after resetting my password
 So that I can access my account

  Given I am on the login page

 Scenario: User resets password and logs in successfully
  When I click on the "Forgot Password?" link
  And I enter a valid email address "krishna@gmail.com"
  Then I should receive a password reset link in my email
  When I follow the password reset link
  And I enter a new valid password "NewValidPassword123"
  Then my password should be reset successfully
  And I navigate back to the login page
  When I enter the valid email address "krishna@gmail.com"
  And I enter the new valid password "NewValidPassword123"
  Then I should be logged in successfully
 As a user
 I want to log in successfully using valid credentials
 So that I can access my account and ensure cookies are set correctly

  Given I am on the login page

 Scenario: User logs in with valid credentials
  When I enter "krishna@gmail.com" in the email input field
  And I enter "validPassword123" in the password input field
  And I click the login button
  Then I should be logged in successfully
  And the home screen should load without errors
  And I open the browser's developer tools
  And I check the cookies for the application
  Then the login session cookie should be set correctly
 As a user
 I want to receive appropriate feedback upon successful login using valid credentials
 So that I can access the home screen and its features

  Given I am on the login page

 Scenario: Successful login with valid credentials
  Given I enter a valid email address "krishna@gmail.com"
  And I enter a valid password "ValidPassword123"
  When I click the login button
  Then I should be logged in successfully
  And the home screen should load without errors
  And a success message should be displayed
  And the Google Map should be displayed correctly
  And the menu bar and recenter icon should be visible on the home screen

 As a user
 I want to log in successfully using valid credentials
 So that I can access the home screen with all features functional

  Given I am on the login page

 Scenario: User logs in with valid credentials and verifies accessibility features
  When I use a screen reader to read the login form
  And I enter a valid email address "krishna@gmail.com" in the email input field
  And I enter a valid password "ValidPassword123" in the password input field
  And I click the login button using keyboard navigation
  Then I should be logged in successfully
  And the home screen should load without errors
  And the Google Map should be displayed correctly
  And the menu bar and recenter icon should be visible on the home screen

 As a user
 I want to log in successfully using valid credentials
 So that I can access my account and be logged out after a session expiration time

  Given I am on the login page

 Scenario: Successful login with valid credentials
  When I enter a valid email "krishna@gmail.com"
  And I enter a valid password "ValidPassword123"
  And I click the login button
  Then I should see the home screen

 Scenario: Session expiration
  Given I am logged in
  When I wait for the session expiration time
  And I attempt to navigate to another page
  Then I should be prompted to log in again
  And I should not be able to access other pages without logging in

 As a user
 I want to log in successfully using valid credentials
 So that I can access features based on my role

  Given I am on the login page

 Scenario: User logs in with specific permissions
  When I enter "krishna@gmail.com" as the email
  And I enter "ValidPassword123" as the password
  And I click the login button
  Then I should be logged in successfully
  And the home screen should load without errors
  And I should have access to features based on my role
  When I log out of the application

 Scenario: User logs in with different permissions
  When I enter "ramu@gmail.com" as the email
  And I enter "AnotherValidPassword456" as the password
  And I click the login button
  Then I should be logged in successfully
  And the home screen should load without errors
  And I should have access to features based on my role
 As a user
 I want to log in successfully using valid credentials that meet password complexity requirements
 So that I can access the application features

  Given I am on the login page

 Scenario: User logs in with valid credentials
  Given I enter a valid email address "krishna@gmail.com"
  And I enter a valid password "P@ssw0rd123"
  When I click the login button
  Then I should be logged in successfully
  And the home screen should load without errors
  And the Google Map should be displayed on the home screen
  And the menu bar and recenter icon should be visible
  When I log out of the application
  Then I should be logged out successfully
 As a user
 I want to receive appropriate feedback messages upon successful login
 So that I can confirm that I have logged in successfully

  Given I am on the login page

 Scenario: Successful login with valid credentials
  Given I enter a valid email address "krishna@gmail.com"
  And I enter a valid password "ValidPassword123"
  When I click the login button
  Then I should be logged in successfully
  And the home screen should load without errors
  And a success message should be displayed
  And the Google Map should be displayed correctly
  And the menu bar and recenter icon should be visible on the home screen

 As a user
 I want to log in successfully using valid credentials
 So that I can access the home screen and manage my session correctly

  Given I am on the login page

 Scenario: User logs in with valid credentials and manages session
  When I enter a valid email address "krishna@gmail.com"
  And I enter a valid password "validPassword123"
  And I click the login button
  Then I should be logged in successfully
  And the home screen should load without errors

 Scenario: User logs out and attempts to access home screen
  Given I am logged in
  When I log out of the application
  And I attempt to access the home screen
  Then I should be redirected to the login page
 As a user
 I want to log in successfully using valid credentials
 So that I can access the application with the correct user role

  Given I am on the login page

 Scenario: User logs in with a specific role
  When I enter a valid email "krishna@gmail.com" 
  And I enter a valid password "correct_password"
  And I click the login button
  Then I should be logged in successfully
  And the home screen should load without errors
  And the user role should be displayed correctly
  When I log out of the application

 Scenario: User logs in with a different role
  When I enter a valid email "ramu@gmail.com" 
  And I enter a valid password "correct_password"
  And I click the login button
  Then I should be logged in successfully
  And the home screen should load without errors
  And the user role should be displayed correctly

 As a user
 I want to log in successfully using valid credentials
 So that I can access my account and be logged out after a period of inactivity

  Given I am on the login page

 Scenario: Successful login with valid credentials
  When I enter a valid email "krishna@gmail.com"
  And I enter a valid password "ValidPassword123"
  And I click the login button
  Then I should be logged in successfully
  And the home screen should load without errors

 Scenario: Session timeout after inactivity
  Given I am logged in
  When I remain inactive for the session timeout period
  And I attempt to navigate to another page
  Then I should be prompted to log in again
  And I should not be able to access other pages without logging in

 As a user
 I want to receive appropriate feedback messages upon failed login attempts
 So that I can understand the reason for my login failure

  Given I am on the login page

 Scenario: Failed login attempt with invalid credentials
  When I enter an invalid email "abc@" in the email input field
  And I enter an invalid password "short" in the password input field
  And I click the login button
  Then I should see an error message
  And the error message should indicate "Invalid credentials"

 Scenario: Successful login attempt with valid credentials
  When I enter a valid email "krishna@gmail.com" in the email input field
  And I enter a valid password "ValidPassword123" in the password input field
  And I click the login button
  Then I should be logged in successfully

 As a user
 I want to log in successfully using valid credentials
 So that I can access features based on my role

  Given I am on the login page

 Scenario: User logs in with specific access
  When I enter a valid email "krishna@gmail.com" 
  And I enter a valid password "SecurePassword123"
  And I click the login button
  Then I should be logged in successfully
  And the home screen should load without errors
  And I can access features based on my role
  When I log out of the application

 Scenario: User logs in with different access
  When I enter a valid email "ramu@gmail.com" 
  And I enter a valid password "AnotherSecurePassword456"
  And I click the login button
  Then I should be logged in successfully
  And the home screen should load without errors
  And I can access features based on my role
 As a user
 I want to log in successfully using valid credentials after resetting my password
 So that I can access my account

  Given I am on the login page

 Scenario: User resets password and logs in successfully
  When I click on the "Forgot Password?" link
  And I enter a valid email address "krishna@gmail.com"
  Then I should receive a password reset link in my email
  When I follow the password reset link
  And I enter a new valid password "NewValidPassword123"
  Then my password should be reset successfully
  And I navigate back to the login page
  When I enter the valid email address "krishna@gmail.com"
  And I enter the new valid password "NewValidPassword123"
  Then I should be logged in successfully

 As a user
 I want to log in successfully using valid credentials
 So that I can access the home screen and manage my session correctly

  Given I am on the login page

 Scenario: User logs in with valid credentials and manages session
  When I enter "krishna@gmail.com" in the email input field
  And I enter "validPassword123" in the password input field
  And I click the login button
  Then I should be logged in successfully
  And the home screen should load without errors

  When I log out of the application
  And I attempt to access the home screen again
  Then I should be redirected to the login page

 As a user
 I want to log in with valid credentials
 So that I can access my account

  Given I am on the login page

 Scenario: User cannot log in with an invalid email format
  When I enter an invalid email format "abc@" in the email input field
  And I enter a valid password "krishna123" in the password input field
  And I click the login button
  Then I should see an error message
  And the error message should indicate an invalid email format

 Scenario: User can log in with valid credentials
  Given I enter a valid email address "krishna@gmail.com" in the email input field
  And I enter a valid password "krishna123" in the password input field
  When I click the login button
  Then I should be logged in successfully
 As a user
 I want to verify that I cannot log in using a valid email and an incorrect password
 So that I receive an appropriate error message

  Given I am on the login page

 Scenario: User attempts to log in with a valid email and incorrect password
  Given I enter a valid email address "krishna@gmail.com"
  And I enter an incorrect password "wrong_password"
  When I click the login button
  Then I should see an error message
  And the error message should indicate "incorrect password"

 Scenario: User logs in with the correct password after an error
  Given I enter a valid email address "krishna@gmail.com"
  And I enter an incorrect password "wrong_password"
  When I click the login button
  Then I should see an error message
  And the error message should indicate "incorrect password"
  
  Given I enter the correct password
  When I click the login button
  Then I should be logged in successfully

 As a user
 I want to log in to my account
 So that I can access my dashboard

  Given I am on the login page

 Scenario: User cannot log in with an empty email field
  Given the email input field is empty
  And I enter a valid password "valid_password"
  When I click the login button
  Then I should see an error message
  And the error message should indicate that the email field is required

 Scenario: User can log in with valid credentials
  Given I enter a valid email address "krishna@gmail.com"
  And I enter a valid password "valid_password"
  When I click the login button
  Then I should be logged in successfully

 As a user
 I want to log in with valid credentials
 So that I can access my account

  Given I am on the login page

 Scenario: User cannot log in with an empty password field
  Given I enter a valid email address "krishna@gmail.com"
  And I leave the password input field empty
  When I click the login button
  Then I should see an error message
  And the error message should indicate that the password field is required

 Scenario: User can log in with valid credentials after entering password
  Given I enter a valid email address "krishna@gmail.com"
  And I enter a valid password
  When I click the login button
  Then I should be logged in successfully

 As a user
 I want to log in with valid credentials
 So that I can access my account

  Given I am on the login page

 Scenario: User cannot log in with both email and password fields empty
  Given both the email and password fields are empty
  When I click the login button
  Then an error message should be displayed
  And the error message should indicate that both fields are required

 Scenario: User logs in with valid credentials
  Given I have entered a valid email address "krishna@gmail.com" in the email field
  And I have entered a valid password "ValidPassword123" in the password field
  When I click the login button
  Then I should be logged in successfully
