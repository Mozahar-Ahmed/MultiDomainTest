package homePageTest;

import base.CommonAPI;
import homePage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends CommonAPI {
    HomePage homePage;

    @BeforeMethod
    public void setHomePage() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test(enabled = false)
    public void homepageValidation() {
        homePage.validateHomePage();
    }

    @Test(enabled = false)
    public void accountButtonValidation() {
        homePage.clickOnAccountAndLists();
    }

    @Test(enabled = true)
    public void validateSignIN() {
        homePage.signIn();
    }
}
