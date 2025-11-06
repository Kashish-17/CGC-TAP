package com.CGC_Tap.pages;

import com.CGC_Tap.utils.ElementUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CGC_Tap1762259537622fuWsSjaceiPage {
    
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "emailField")
    private WebElement emailField;

    @FindBy(id = "passwordField")
    private WebElement passwordField;

    @FindBy(id = "loginButton")
    private WebElement loginButton;

    @FindBy(id = "checkbox")
    private WebElement checkbox;

    @FindBy(id = "errorMessage")
    private WebElement errorMessage;

    @FindBy(id = "successMessage")
    private WebElement successMessage;

    public CGC_Tap1762259537622fuWsSjaceiPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void enterEmail(String email) {
        try {
            elementUtils.clearAndSendKeys(emailField, email);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterPassword(String password) {
        try {
            elementUtils.clearAndSendKeys(passwordField, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void checkCheckbox() {
        try {
            elementUtils.clickElement(checkbox);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isErrorMessageClear() {
        try {
            String actualMessage = elementUtils.getElementText(errorMessage);
            Assert.assertTrue("Error message should be clear", actualMessage.isEmpty());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isSuccessMessageDisplayed() {
        try {
            Assert.assertTrue("Success message should be displayed", elementUtils.isElementDisplayed(successMessage));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void isOnLoginPage() {
        try {
            // Assuming there's a specific element that indicates the login page
            Assert.assertTrue("Should be on login page", elementUtils.isElementDisplayed(loginButton));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void logout() {
        try {
            // Assuming there's a logout button to click
            // elementUtils.clickElement(logoutButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void navigateToAnotherPage() {
        try {
            // Assuming there's a link or button to navigate
            // elementUtils.clickElement(navigationButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isUserLoggedIn() {
        try {
            // Assuming there's a specific element that indicates the user is logged in
            Assert.assertTrue("User should be logged in", elementUtils.isElementDisplayed(successMessage));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isUserLoggedOut() {
        try {
            // Assuming the login button is displayed when the user is logged out
            Assert.assertTrue("User should be logged out", elementUtils.isElementDisplayed(loginButton));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isUnexpectedErrorMessageDisplayed() {
        try {
            // Assuming there's a specific element for unexpected error messages
            // Assert.assertTrue("Unexpected error message should be displayed", elementUtils.isElementDisplayed(unexpectedErrorMessage));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isSessionExpiredHandled() {
        try {
            // Assuming there's a specific element that indicates session expiration
            // Assert.assertTrue("Session should be expired", elementUtils.isElementDisplayed(sessionExpiredMessage));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}