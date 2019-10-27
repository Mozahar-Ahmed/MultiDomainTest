package signinTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import signin.SigninPOM;

public class SigninPOMTest extends CommonAPI {
    SigninPOM signinPOM;

    @BeforeMethod
    public void initiate() {
        signinPOM = PageFactory.initElements(driver, SigninPOM.class);
    }

    @Test(enabled = false)
    public void accountAndListButtonValidation() {
        signinPOM.validateAccountButtonDisplayed();
        signinPOM.validateAccountButtonClickable();
    }

    @Test(enabled = false)
    public void emailFieldValidation() {
        signinPOM.validateEmailField("demouser95");
    }

    @Test(enabled = false)
    public void continueButtonValidation() {
        signinPOM.validateContinueButtonDisplayed();
        signinPOM.validateContinueButtonClickable();
    }

    @Test(enabled = false)
    public void passwordFieldValidation() {
        signinPOM.validatePasswordField("abcd1234");
    }

    @Test(enabled = false)
    public void signinButtonValidation() {
        signinPOM.validateSigninButtonDisplayed();
        signinPOM.validateSigninButtonClickable();
    }

    @Test(enabled = true)
    public void signinFunctionality() {
        signinPOM.signinFunctionality();
    }
}
