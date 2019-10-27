package signin;

import base.CommonAPI;
import homePage.HomePage;

public class Signout extends CommonAPI {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    public void validateSignOut() {
        homePage.signIn();
        loginPage.validateLoginField("username");
        loginPage.continueButton();
        loginPage.validatePasswordField("password");
        loginPage.clickOnSignInButton();
        clickOnElementByXpath("//a[@id='nav-link-accountList']");
        clickOnElementByXpath("//a[@id='nav-item-signout']");
    }
}
