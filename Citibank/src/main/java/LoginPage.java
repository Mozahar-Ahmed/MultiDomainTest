import base.CommonAPI;

public class LoginPage extends CommonAPI {

    public void login() {
        typeOnElementByXpath("/html//input[@id='username']", "demouser95");
        typeOnElementByXpath("/html//input[@id='password']", "adcd1234");
        clickOnElementByXpath("//input[@id='signInBtn']");
    }
}
