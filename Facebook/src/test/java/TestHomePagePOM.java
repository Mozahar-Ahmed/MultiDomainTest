import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePagePOM extends CommonAPI {
    HomePagePOM homePagePOM;

    @BeforeMethod
    public void setHomePagePOM() {
        homePagePOM = PageFactory.initElements(driver, HomePagePOM.class);
    }

    @Test(enabled = false)
    public void login() {
        homePagePOM.typeEmailAndPassword("demousser9533@gmai.com", "abcd1234");
        homePagePOM.clickOnLoginButton();
    }

    @Test
    public void forgotPasswordValidation() {
        homePagePOM.clickOnForgotPassword();
        homePagePOM.validateForgotPasswordClickable();
    }
}
