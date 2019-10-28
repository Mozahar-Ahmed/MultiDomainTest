package signinPage;

import base.CommonAPI;
import homePage.HomePage;

public class Signout extends CommonAPI {
    Login login = new Login();
    HomePage homePage = new HomePage();

    public void validateSignOut() {
        homePage.signIn();
        login.validateLoginField("demouser95");
        login.validateContinueButton();
        login.validatePasswordField("abcd1234");
        login.clickOnSignInButton();
        clickOnElementByXpath("//a[@id='nav-link-accountList']");
        clickOnElementByXpath("//a[@id='nav-item-signout']");
    }
}
