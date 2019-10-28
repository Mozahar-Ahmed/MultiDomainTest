package signinPageTest;

import homePage.HomePage;
import org.testng.annotations.Test;
import signinPage.Login;

public class LoginTest extends Login {
    HomePage homePage = new HomePage();
    @Test
    public void logInTest(){
        homePage.signIn();
        validateLoginField("demouser95");
        validateContinueButton();
        validatePasswordField("abcd1234");
        clickOnSignInButton();
    }
}
