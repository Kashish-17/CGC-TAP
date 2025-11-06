package com.CGC Tap.pages;

import com.CGC Tap.utils.ElementUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CGCTap1762430769144HWIqCqTAvwPage {

    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "emailInputField")
    private WebElement emailInputField;

    @FindBy(id = "passwordInputField")
    private WebElement passwordInputField;

    @FindBy(id = "loginButton")
    private WebElement loginButton;

    @FindBy(id = "homeScreen")
    private WebElement homeScreen;

    @FindBy(id = "googleMap")
    private WebElement googleMap;

    @FindBy(id = "menuBar")
    private WebElement menuBar;

    public CGCTap1762430769144HWIqCqTAvwPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void enterEmail(String email) {
        try {
            elementUtils.clearAndSendKeys(emailInputField, email);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterPassword(String password) {
        try {
            elementUtils.clearAndSendKeys(passwordInputField, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickLoginButton() {
        try {
            elementUtils.clickElement(loginButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




}