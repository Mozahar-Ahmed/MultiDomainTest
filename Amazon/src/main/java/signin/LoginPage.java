package signin;

import base.CommonAPI;

public class LoginPage extends CommonAPI {
    public void validateLoginField(String value) {
        typeOnElementByXpath("//input[@id='ap_email']", value);
    }

    public void continueButton() {
        clickOnElementByXpath("//input[@id='continue']");
    }

    public void validatePasswordField(String value) {
        typeOnElementByXpath("//input[@id='ap_password']", value);
    }

    public void clickOnSignInButton() {
        clickOnElementByXpath("//input[@id='signInSubmit']");
    }
}
