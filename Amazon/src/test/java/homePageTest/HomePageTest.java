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

    @Test
    public void testOnHomepage() {
        homePage.validateHomePage();
    }

    @Test
    public void testONaccountList() {
        homePage.validateAccountList();
    }

    @Test
    public void validateSignIN() {
        homePage.signIn();
    }
}
