package com.CGC Tap.stepdefinitions;

import com.CGC Tap.utils.ElementUtils;
import org.junit.Assert;
import com.CGC Tap.driverfactory.DriverFactory;
import com.CGC Tap.pages.CGC TapPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class CGC Tap extends DriverFactory {
CGC TapPage cgcTapPage = new CGC TapPage(driver);
@Given("the user is on the login page")
public void the_user_is_on_the_login_page() {
cgcTapPage.navigateToLoginPage();
}
@Given("the user enters a valid email address {string}")
public void the_user_enters_a_valid_email_address(String email) {
cgcTapPage.enterEmail(email);
}
@Given("the user enters a valid password {string}")
public void the_user_enters_a_valid_password(String password) {
cgcTapPage.enterPassword(password);
}
@When("the user verifies that the login button is enabled")
public void the_user_verifies_that_the_login_button_is_enabled() {
cgcTapPage.isLoginButtonEnabled();
}
@When("the user clicks the login button")
public void the_user_clicks_the_login_button() {
cgcTapPage.clickElementLoginButton();
}
@Then("the user should be logged in successfully")
public void the_user_should_be_logged_in_successfully() {
cgcTapPage.isUserLoggedIn();
}
// @Then("the home screen should load without errors")
// public void the_home_screen_should_load_without_errors() {
// cgcTapPage.isHomeScreenLoaded();
// }
@Then("the Google Map should be displayed on the home screen")
public void the_google_map_should_be_displayed_on_the_home_screen() {
cgcTapPage.isGoogleMapDisplayed();
}
@Then("the menu bar and recenter icon should be visible on the home screen")
public void the_menu_bar_and_recenter_icon_should_be_visible_on_the_home_screen() {
cgcTapPage.isMenuBarVisible();
cgcTapPage.isRecenterIconVisible();
}
@When("I check the {string} checkbox")
public void i_check_the_checkbox(String checkbox) {
cgcTapPage.checkCheckbox(checkbox);
}
@Given("I am logged in")
public void i_am_logged_in() {
cgcTapPage.login("krishna@gmail.com", "ValidPassword123");
}
@When("I log out of the application")
public void i_log_out_of_the_application() {
cgcTapPage.logout();
}
@Then("the email field should be pre-filled with {string}")
public void the_email_field_should_be_pre_filled_with(String email) {
Assert.assertEquals(email, cgcTapPage.getEmailFieldValue());
}
@When("I navigate back to the login page")
public void i_navigate_back_to_the_login_page() {
cgcTapPage.navigateToLoginPage();
}
// @When("I enter a valid email address {string} in the email input field")
// public void i_enter_a_valid_email_address_in_the_email_input_field(String email) {
// cgcTapPage.enterEmail(email);
// }
@When("I enter a valid password {string} in the password input field")
public void i_enter_a_valid_password_in_the_password_input_field(String password) {
cgcTapPage.enterPassword(password);
}
@Then("the login button should be enabled")
public void the_login_button_should_be_enabled() {
cgcTapPage.isLoginButtonEnabled();
}
@When("I click the password visibility toggle")
public void i_click_the_password_visibility_toggle() {
cgcTapPage.togglePasswordVisibility();
}
@Then("the password should be visible")
public void the_password_should_be_visible() {
cgcTapPage.isPasswordVisible();
}
@When("I refresh the browser")
public void i_refresh_the_browser() {
driver.navigate().refresh();
}
@Then("the Google Map should still be displayed on the home screen")
public void the_google_map_should_still_be_displayed_on_the_home_screen() {
cgcTapPage.isGoogleMapDisplayed();
}
@Then("the menu bar and recenter icon should still be visible")
public void the_menu_bar_and_recenter_icon_should_still_be_visible() {
cgcTapPage.isMenuBarVisible();
cgcTapPage.isRecenterIconVisible();
}
@Given("the application is open")
public void the_application_is_open() {
cgcTapPage.openApplication();
}
@When("I navigate to the login page in {string}")
public void i_navigate_to_the_login_page_in(String browser) {
cgcTapPage.navigateToLoginPageInBrowser(browser);
}
@Then("I should see the home screen load without errors")
public void i_should_see_the_home_screen_load_without_errors() {
cgcTapPage.isHomeScreenLoaded();
}
@When("I enter a valid email {string} as the email")
public void i_enter_a_valid_email_as_the_email(String email) {
cgcTapPage.enterEmail(email);
}
@When("I enter a valid password {string} as the password")
public void i_enter_a_valid_password_as_the_password(String password) {
cgcTapPage.enterPassword(password);
}
@Then("I should see an error message")
public void i_should_see_an_error_message() {
cgcTapPage.isErrorMessageDisplayed();
}
@Then("the error message should indicate {string}")
public void the_error_message_should_indicate(String message) {
Assert.assertEquals(message, cgcTapPage.getErrorMessage());
}
@When("I leave the password input field empty")
public void i_leave_the_password_input_field_empty() {
cgcTapPage.clearElementPasswordField();
}
@When("the email input field is empty")
public void the_email_input_field_is_empty() {
cgcTapPage.clearElementEmailField();
}
@When("both the email and password fields are empty")
public void both_the_email_and_password_fields_are_empty() {
cgcTapPage.clearElementEmailField();
cgcTapPage.clearElementPasswordField();
}
@Then("an error message should be displayed")
public void an_error_message_should_be_displayed() {
cgcTapPage.isErrorMessageDisplayed();
}
@Then("the error message should indicate that both fields are required")
public void the_error_message_should_indicate_that_both_fields_are_required() {
Assert.assertEquals("Both fields are required", cgcTapPage.getErrorMessage());
}
@When("I enter an invalid email format {string} in the email input field")
public void i_enter_an_invalid_email_format_in_the_email_input_field(String email) {
cgcTapPage.enterEmail(email);
}
@When("I enter an incorrect password {string}")
public void i_enter_an_incorrect_password(String password) {
cgcTapPage.enterPassword(password);
}
@Then("the user data should be stored correctly in session storage")
public void the_user_data_should_be_stored_correctly_in_session_storage() {
cgcTapPage.isUserDataStoredInSessionStorage();
}
@Then("the login session cookie should be set correctly")
public void the_login_session_cookie_should_be_set_correctly() {
cgcTapPage.isLoginSessionCookieSet();
}
@Then("a success message should be displayed")
public void a_success_message_should_be_displayed() {
cgcTapPage.isSuccessMessageDisplayed();
}
@When("I wait for the session expiration time")
public void i_wait_for_the_session_expiration_time() {
cgcTapPage.waitForSessionExpiration();
}
@Then("I should be prompted to log in again")
public void i_should_be_prompted_to_log_in_again() {
cgcTapPage.isLoginPromptDisplayed();
}
@Then("I should not be able to access other pages without logging in")
public void i_should_not_be_able_to_access_other_pages_without_logging_in() {
cgcTapPage.canAccessOtherPages();
}
//    @When("I enter a valid email address {string} in the email input field")
@When("I enter a valid password")
public void i_enter_a_valid_password() {
cgcTapPage.enterPassword("ValidPassword123");
}
@Then("I should be logged out successfully")
public void i_should_be_logged_out_successfully() {
cgcTapPage.isUserLoggedOut();
}
//    @When("I enter a valid email {string} as the email")
//    @When("I enter a valid password {string} as the password")
@Then("the user role should be displayed correctly")
public void the_user_role_should_be_displayed_correctly() {
cgcTapPage.isUserRoleDisplayedCorrectly();
}
@When("I enter a valid email {string} and a valid password {string}")
public void i_enter_a_valid_email_and_a_valid_password(String email, String password) {
cgcTapPage.enterEmail(email);
cgcTapPage.enterPassword(password);
}
@Then("I should be redirected to the home screen")
public void i_should_be_redirected_to_the_home_screen() {
cgcTapPage.isHomeScreenLoaded();
}