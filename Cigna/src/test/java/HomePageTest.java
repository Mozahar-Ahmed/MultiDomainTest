import base.CommonAPI;
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
    public void testHeaders() {
        homePage.validateFirstHeader();
        homePage.validateSecondHeader();
        homePage.validateThirdHeader();
    }

    @Test
    public void testContact() {
        homePage.validateContact();
    }

    @Test
    public void testAboutUs() {
        homePage.setAboutUs();
    }

    @Test
    public void testInternationalIcon() {
        homePage.setCignaInternational();
    }

    @Test
    public void testLogo() {
        homePage.setLogo();
    }
}
