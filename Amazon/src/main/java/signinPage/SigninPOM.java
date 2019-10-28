package signinPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SigninPOM {
    @FindBy(xpath = "//a[@id='nav-link-accountList']")
    WebElement accountAndList;
    @FindBy(xpath = "//form[@name='signIn' and @class='a-spacing-small']")
    WebElement signinpage;
    @FindBy(xpath = "//input[@id='ap_email']")
    WebElement emailField;
    @FindBy(xpath = "//input[@id='continue']")
    WebElement continueButton;
    @FindBy(xpath = "//span[@class='a-label a-checkbox-label']")
    WebElement passwordPage;
    @FindBy(xpath = "//input[@id='ap_password']")
    WebElement passwordField;
    @FindBy(xpath = "//input[@id='signInSubmit']")
    WebElement signinButton;
    @FindBy(xpath = "//h1[contains(text(),'Authentication required')]")
    WebElement authenticationPage;

    public void validateAccountButtonDisplayed() {
        System.out.println(accountAndList.isDisplayed());
        Assert.assertEquals(accountAndList.isDisplayed(), true, "accounts & list button is not displayed");
    }

    public void validateAccountButtonClickable() {
        accountAndList.click();
        Assert.assertEquals(signinpage.isDisplayed(), true, "account and list button is not clickable");
    }

    public void validateEmailField(String email) {
        System.out.println(emailField.isDisplayed());
        Assert.assertEquals(emailField.isDisplayed(), true, "email field is not displayed");
        emailField.click();
        emailField.sendKeys("email");
    }

    public void validateContinueButtonDisplayed() {
        System.out.println(continueButton.isDisplayed());
        Assert.assertEquals(continueButton.isDisplayed(), true, "continue button is not displayed");

    }

    public void validateContinueButtonClickable() {
        continueButton.click();
        Assert.assertEquals(passwordPage.isDisplayed(), true, "continue button is not clickable");
    }

    public void validatePasswordField(String password) {
        System.out.println(passwordField.isDisplayed());
        Assert.assertEquals(passwordField.isDisplayed(), true, "password field is not get displayed");
        passwordField.click();
        passwordField.sendKeys("password");
    }

    public void validateSigninButtonDisplayed() {
        System.out.println(signinButton.isDisplayed());
        Assert.assertEquals(signinButton.isDisplayed(), true, "signin button is not get displayed");
    }

    public void validateSigninButtonClickable() {
        signinButton.click();
        Assert.assertEquals(authenticationPage.isDisplayed(), true, "sign in button is not get clicked");

    }

    public void signinFunctionality() {
        accountAndList.click();
        emailField.click();
        emailField.sendKeys("email");
        passwordField.click();
        passwordField.sendKeys("password");
        signinButton.click();
    }

}
