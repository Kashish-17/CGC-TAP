package com.CGC Tap.stepdefinitions;

import com.CGC Tap.utils.ElementUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import com.CGC Tap.driverfactory.DriverFactory;
import com.CGC Tap.pages.CGC TapPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class CGC Tap extends DriverFactory {
CGC TapPage cgcTapPage = new CGC TapPage(driver);
@Given("I am on the login page")
public void i_am_on_the_login_page() {
driver = DriverFactory.getDriver();
cgcTapPage.navigateToLoginPage();
}
@Given("the email input field contains {string}")
public void the_email_input_field_contains(String email) {
cgcTapPage.enterEmail(email);
}
@Given("the password input field contains {string}")
public void the_password_input_field_contains(String password) {
cgcTapPage.enterPassword(password);
}
@When("I click the login button")
public void i_click_the_login_button() {
cgcTapPage.clickLoginButton();
}
@Then("the home screen should load without errors")
public void the_home_screen_should_load_without_errors() {
cgcTapPage.isHomeScreenLoaded();
}
@And("I should be navigated to the home screen")
public void i_should_be_navigated_to_the_home_screen() {
cgcTapPage.isUserOnHomeScreen();
}
@And("the Google Map should be displayed")
public void the_google_map_should_be_displayed() {
cgcTapPage.isGoogleMapDisplayed();
}
@And("the menu bar should be visible")
public void the_menu_bar_should_be_visible() {
cgcTapPage.isMenuBarVisible();
}
@Given("I enter a valid email address {string} in the email input field")
public void i_enter_a_valid_email_address_in_the_email_input_field(String email) {
cgcTapPage.enterEmail(email);
}
@Given("I enter a password {string} in the password input field")
public void i_enter_a_password_in_the_password_input_field(String password) {
cgcTapPage.enterPassword(password);
}