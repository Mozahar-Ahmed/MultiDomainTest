import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PageFactoryHomePageTest extends CommonAPI {

    PageFactoryHomePage pageFactoryHomePage;

    @BeforeMethod
    public void setPageFactoryOfHomePage() {
        pageFactoryHomePage = PageFactory.initElements(driver, PageFactoryHomePage.class);
    }

    @Test
    public void testOnMenuIcon() {
        pageFactoryHomePage.validateMenuIcon();
    }

    @Test
    public void testOnWorldButton() {
        pageFactoryHomePage.validateWorldButton2();
    }

    @Test
    public void testOnStyleSection() {
        pageFactoryHomePage.validateStyleSection();
    }

    @Test
    public void testOnPoliticssection() {
        pageFactoryHomePage.validatePolitics();
    }
}
