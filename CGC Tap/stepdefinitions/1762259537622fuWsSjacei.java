package com.CGC_Tap.stepdefinitions;

import com.CGC Tap.utils.ElementUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import com.CGC Tap.driverfactory.DriverFactory;
import com.CGC_Tap.pages.CGC_TapPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class CGC_Tap extends DriverFactory {
CGC_TapPage cgcTapPage = new CGC_TapPage(driver);
// @Given("the user is on the login page")
// public void the_user_is_on_the_login_page() {
// driver = DriverFactory.getDriver();
// cgcTapPage.navigateToLoginPage();
// }
@Given("the application is installed on a mobile device")
public void the_application_is_installed_on_a_mobile_device() {
// Logic to check if the application is installed on a mobile device
}
// @Given("the application is open")
// public void the_application_is_open() {
// Logic to check if the application is open
// }
// @When("the user enters a valid email address {string}")
// public void the_user_enters_a_valid_email_address(String email) {
// cgcTapPage.enterEmail(email);
// }
// @When("the user enters a valid password {string}")
// public void the_user_enters_a_valid_password(String password) {
// cgcTapPage.enterPassword(password);
// }
// @When("the user clicks the login button")
// public void the_user_clicks_the_login_button() {
// cgcTapPage.clickLoginButton();
// }
// @Then("the login button should be enabled")
// public void the_login_button_should_be_enabled() {
// cgcTapPage.isLoginButtonEnabled();
// }
// @Then("the user should be logged in successfully")
// public void the_user_should_be_logged_in_successfully() {
// cgcTapPage.isUserLoggedIn();
// }
// @Then("the home screen should load without errors")
// public void the_home_screen_should_load_without_errors() {
// cgcTapPage.isHomeScreenLoaded();
// }
// @Then("the Google Map should be displayed on the home screen")
// public void the_google_map_should_be_displayed_on_the_home_screen() {
// cgcTapPage.isGoogleMapDisplayed();
// }
// @Then("the menu bar and recenter icon should be visible on the home screen")
// public void the_menu_bar_and_recenter_icon_should_be_visible_on_the_home_screen() {
// cgcTapPage.isMenuBarVisible();
// cgcTapPage.isRecentIconVisible();
// }
@When("the user checks the {string} checkbox")
public void the_user_checks_the_checkbox(String checkbox) {
cgcTapPage.checkCheckbox(checkbox);
}
// @Then("the password should be visible")
// public void the_password_should_be_visible() {
// cgcTapPage.isPasswordVisible();
// }
@When("the user logs out of the application")
public void the_user_logs_out_of_the_application() {
cgcTapPage.logout();
}
@Then("the user should be automatically logged back in")
public void the_user_should_be_automatically_logged_back_in() {
cgcTapPage.isUserLoggedIn();
}
@When("the user enters an invalid email format {string}")
public void the_user_enters_an_invalid_email_format(String email) {
cgcTapPage.enterEmail(email);
}
// @Then("I should see an error message")
// public void i_should_see_an_error_message() {
// cgcTapPage.isErrorMessageDisplayed();
// }
@Then("the error message should be clearElement and informative")
public void the_error_message_should_be_clear_and_informative() {
cgcTapPage.isErrorMessageClear();
}
@When("the user enters an incorrect password {string}")
public void the_user_enters_an_incorrect_password(String password) {
cgcTapPage.enterPassword(password);
}
@Then("the user should see a success message")
public void the_user_should_see_a_success_message() {
cgcTapPage.isSuccessMessageDisplayed();
}
@When("the user enters a valid complex password {string}")
public void the_user_enters_a_valid_complex_password(String password) {
cgcTapPage.enterPassword(password);
}
@When("the user enters both email and password fields empty")
public void the_user_enters_both_email_and_password_fields_empty() {
cgcTapPage.clearEmailAndPasswordFields();
}
@Then("the user should be redirected to the login page")
public void the_user_should_be_redirected_to_the_login_page() {
cgcTapPage.isOnLoginPage();
}
@When("the user attempts to navigate to another page")
public void the_user_attempts_to_navigate_to_another_page() {
cgcTapPage.navigateToAnotherPage();
}
@Then("the session expiration should be handled correctly")
public void the_session_expiration_should_be_handled_correctly() {
cgcTapPage.isSessionExpiredHandled();
}
@When("the user enters a valid email {string} for an unverified account")
public void the_user_enters_a_valid_email_for_an_unverified_account(String email) {
cgcTapPage.enterEmail(email);
}
@Then("the user should see an unexpected error message")
public void the_user_should_see_an_unexpected_error_message() {
cgcTapPage.isUnexpectedErrorMessageDisplayed();
}
@When("the user enters valid credentials for a verified account")
public void the_user_enters_valid_credentials_for_a_verified_account() {
cgcTapPage.enterEmail("verifiedUser@gmail.com");
cgcTapPage.enterPassword("validPassword123");
}
@Then("the user should be logged out successfully")
public void the_user_should_be_logged_out_successfully() {
cgcTapPage.isUserLoggedOut();
}
@When("the user enters a valid email {string} for an expired account")
public void the_user_enters_a_valid_email_for_an_expired_account(String email) {
cgcTapPage.enterEmail(email);
}
@When("the user enters a valid email {string} for a locked account")
public void the_user_enters_a_valid_email_for_a_locked_account(String email) {
cgcTapPage.enterEmail(email);
}
@When("the user enters a valid email {string} for an active account")
public void the_user_enters_a_valid_email_for_an_active_account(String email) {
cgcTapPage.enterEmail(email);
}
@When("the user enters a valid email {string} for a verified account")
public void the_user_enters_a_valid_email_for_a_verified_account(String email) {
cgcTapPage.enterEmail(email);
}
@When("the user enters a valid password {string} for a verified account")
public void the_user_enters_a_valid_password_for_a_verified_account(String password) {
cgcTapPage.enterPassword(password);
}
@When("the user enters a valid password {string} for an active account")
public void the_user_enters_a_valid_password_for_an_active_account(String password) {
cgcTapPage.enterPassword(password);
}
@When("the user enters a valid password {string} for a locked account")
public void the_user_enters_a_valid_password_for_a_locked_account(String password) {
cgcTapPage.enterPassword(password);
}
@When("the user enters a valid password {string} for an expired account")
public void the_user_enters_a_valid_password_for_an_expired_account(String password) {
cgcTapPage.enterPassword(password);
}
@When("the user enters a valid email {string} for a server error")
public void the_user_enters_a_valid_email_for_a_server_error(String email) {
cgcTapPage.enterEmail(email);
}
@When("the user enters a valid password {string} for a server error")
public void the_user_enters_a_valid_password_for_a_server_error(String password) {
cgcTapPage.enterPassword(password);
}
@When("the user enters a valid email {string} for a network error")
public void the_user_enters_a_valid_email_for_a_network_error(String email) {
cgcTapPage.enterEmail(email);
}
@When("the user enters a valid password {string} for a network error")
public void the_user_enters_a_valid_password_for_a_network_error(String password) {
cgcTapPage.enterPassword(password);
}
@When("the user enters a valid email {string} for a session timeout")
public void the_user_enters_a_valid_email_for_a_session_timeout(String email) {
cgcTapPage.enterEmail(email);
}
@When("the user enters a valid password {string} for a session timeout")
public void the_user_enters_a_valid_password_for_a_session_timeout(String password) {
cgcTapPage.enterPassword(password);
}
@When("the user enters a valid email {string} for an SQL injection attempt")
public void the_user_enters_a_valid_email_for_an_sql_injection_attempt(String email) {
cgcTapPage.enterEmail(email);
}
@When("the user enters a valid password {string} for an SQL injection attempt")
public void the_user_enters_a_valid_password_for_an_sql_injection_attempt(String password) {
cgcTapPage.enterPassword(password);
}
@When("the user enters a valid email {string} for an XSS attempt")
public void the_user_enters_a_valid_email_for_an_xss_attempt(String email) {
cgcTapPage.enterEmail(email);
}
@When("the user enters an XSS attempt {string} in the password field")
public void the_user_enters_an_xss_attempt_in_the_password_field(String xss) {
cgcTapPage.enterPassword(xss);
}
//    @When("the user enters a valid email {string} for an expired account")
//    @When("the user enters a valid password {string} for an expired account")
//    @When("the user enters a valid email {string} for a locked account")
//    @When("the user enters a valid password {string} for a locked account")
//    @When("the user enters a valid email {string} for a verified account")
//    @When("the user enters a valid password {string} for a verified account")
//    @When("the user enters a valid email {string} for a server error")
//    @When("the user enters a valid password {string} for a server error")
//    @When("the user enters a valid email {string} for a network error")
//    @When("the user enters a valid password {string} for a network error")
//    @When("the user enters a valid email {string} for a session timeout")
//    @When("the user enters a valid password {string} for a session timeout")

}