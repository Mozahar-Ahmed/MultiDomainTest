import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePagePOM {
    @FindBy(xpath = "//input[@id='email']")
    WebElement emailOrPhone;
    @FindBy(xpath = "//input[@id='pass']")
    WebElement pass;
    @FindBy(xpath = "//input[@id='u_0_4']")
    WebElement loginButton;
    @FindBy(xpath = "//a[contains(text(),'Forgot account?')]")
    WebElement forgotPass;
    @FindBy(xpath = "//h2[@class='uiHeaderTitle']")
    WebElement passwordRetrievePage;

    public void typeEmailAndPassword(String email, String password) {
        emailOrPhone.sendKeys(email);
        pass.sendKeys(password);
    }

    public void clickOnLoginButton() {
        loginButton.click();
    }

    public void clickOnForgotPassword() {
        forgotPass.click();
    }

    public void validateForgotPasswordClickable() {
        Assert.assertEquals(passwordRetrievePage.isDisplayed(), true, "forgot password is not clickable");
    }
}
