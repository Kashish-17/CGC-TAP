package com.CGC_Tap.stepdefinitions;

import com.CGC Tap.utils.ElementUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import com.CGC_Tap.driverfactory.DriverFactory;
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
// @When("the user enters a valid email address {string}")
// public void the_user_enters_a_valid_email_address(String email) {
// cgcTapPage.enterEmail(email);
// }
// @When("the user enters a valid password {string}")
// public void the_user_enters_a_valid_password(String password) {
// cgcTapPage.enterPassword(password);
// }
// @Then("the login button should be enabled")
// public void the_login_button_should_be_enabled() {
// cgcTapPage.isLoginButtonEnabled();
// }
// @When("the user clicks the login button")
// public void the_user_clicks_the_login_button() {
// cgcTapPage.clickLoginButton();
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
// @When("I check the {string} checkbox")
// public void i_check_the_checkbox(String checkbox) {
// cgcTapPage.checkRememberMeCheckbox();
// }
// @Given("I am logged in")
// public void i_am_logged_in() {
// cgcTapPage.loginWithValidCredentials("krishna@gmail.com", "ValidPassword123");
// }
// @When("I log out of the application")
// public void i_log_out_of_the_application() {
// cgcTapPage.logout();
// }
@Then("I should be automatically logged back in")
public void i_should_be_automatically_logged_back_in() {
cgcTapPage.isUserLoggedIn();
}
@Given("the application is installed on a mobile device")
public void the_application_is_installed_on_a_mobile_device() {
// Logic to check if the application is installed on a mobile device
}
@When("I navigate to the login page")
public void i_navigate_to_the_login_page() {
cgcTapPage.navigateToLoginPage();
}
// @When("I enter a valid email address {string} in the email input field")
// public void i_enter_a_valid_email_address_in_the_email_input_field(String email) {
// cgcTapPage.enterEmail(email);
// }
// @When("I enter a valid password {string} in the password input field")
// public void i_enter_a_valid_password_in_the_password_input_field(String password) {
// cgcTapPage.enterPassword(password);
// }
@Then("I should see a success message")
public void i_should_see_a_success_message() {
cgcTapPage.isSuccessMessageDisplayed();
}
// @When("I click the password visibility toggle")
// public void i_click_the_password_visibility_toggle() {
// cgcTapPage.togglePasswordVisibility();
// }
// @Then("the password should be visible")
// public void the_password_should_be_visible() {
// cgcTapPage.isPasswordVisible();
// }
// @When("I refresh the browser")
// public void i_refresh_the_browser() {
// driver.navigate().refresh();
// }
@Then("the home screen should remain displayed")
public void the_home_screen_should_remain_displayed() {
cgcTapPage.isHomeScreenDisplayed();
}
@Then("the Google Map should still be visible")
public void the_google_map_should_still_be_visible() {
cgcTapPage.isGoogleMapDisplayed();
}
@When("I open a new tab and navigate to the application")
public void i_open_a_new_tab_and_navigate_to_the_application() {
// Logic to open a new tab and navigate to the application
}
@Then("I should still be logged in on the first tab")
public void i_should_still_be_logged_in_on_the_first_tab() {
cgcTapPage.isUserLoggedIn();
}
// @When("I enter an invalid email format {string} in the email input field")
// public void i_enter_an_invalid_email_format_in_the_email_input_field(String email) {
// cgcTapPage.enterEmail(email);
// }
// @Then("I should see an error message")
// public void i_should_see_an_error_message() {
// cgcTapPage.isErrorMessageDisplayed();
// }
@Then("the error message should be clearElement and informative")
public void the_error_message_should_be_clear_and_informative() {
cgcTapPage.isErrorMessageInformative();
}
// @When("I enter an incorrect password {string}")
// public void i_enter_an_incorrect_password(String password) {
// cgcTapPage.enterPassword(password);
// }
@When("I wait for the error to resolve")
public void i_wait_for_the_error_to_resolve() {
// Logic to wait for the error to resolve
}
@When("I enter the correct password")
public void i_enter_the_correct_password() {
cgcTapPage.enterPassword("ValidPassword123");
}
@When("I enter both email and password fields are empty")
public void i_enter_both_email_and_password_fields_are_empty() {
cgcTapPage.clearEmailAndPasswordFields();
}
// @Then("an error message should be displayed")
// public void an_error_message_should_be_displayed() {
// cgcTapPage.isErrorMessageDisplayed();
// }
@When("I enter valid credentials for a verified account")
public void i_enter_valid_credentials_for_a_verified_account() {
cgcTapPage.enterEmail("verifiedUser@gmail.com");
cgcTapPage.enterPassword("validPassword123");
}
@When("I enter valid credentials for an unverified account")
public void i_enter_valid_credentials_for_an_unverified_account() {
cgcTapPage.enterEmail("krishna@gmail.com");
cgcTapPage.enterPassword("validPassword123");
}
@When("a server error occurs")
public void a_server_error_occurs() {
// Logic to simulate a server error
}
@When("a network error occurs")
public void a_network_error_occurs() {
// Logic to simulate a network error
}
@When("I wait for the session to timeout")
public void i_wait_for_the_session_to_timeout() {
// Logic to wait for session timeout
}
@Then("I should see the session timeout message")
public void i_should_see_the_session_timeout_message() {
cgcTapPage.isSessionTimeoutMessageDisplayed();
}
@When("I enter a valid email {string} for an expired account")
public void i_enter_a_valid_email_for_an_expired_account(String email) {
cgcTapPage.enterEmail(email);
}
@When("I enter a valid email {string} for a locked account")
public void i_enter_a_valid_email_for_a_locked_account(String email) {
cgcTapPage.enterEmail(email);
}
@When("I enter a valid email {string} for an active account")
public void i_enter_a_valid_email_for_an_active_account(String email) {
cgcTapPage.enterEmail(email);
}
@When("I enter a valid email {string} for an unverified account")
public void i_enter_a_valid_email_for_an_unverified_account(String email) {
cgcTapPage.enterEmail(email);
}
@When("I enter a valid password {string} for an unverified account")
public void i_enter_a_valid_password_for_an_unverified_account(String password) {
cgcTapPage.enterPassword(password);
}
@When("I enter a valid password {string} for a verified account")
public void i_enter_a_valid_password_for_a_verified_account(String password) {
cgcTapPage.enterPassword(password);
}
@When("I enter a valid password {string} for a locked account")
public void i_enter_a_valid_password_for_a_locked_account(String password) {
cgcTapPage.enterPassword(password);
}
@When("I enter a valid password {string} for an expired account")
public void i_enter_a_valid_password_for_an_expired_account(String password) {
cgcTapPage.enterPassword(password);
}