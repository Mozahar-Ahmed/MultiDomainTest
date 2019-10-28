import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageFooterTest extends CommonAPI {
    HomePageFooter homePageFooter;
    @BeforeMethod
    public void setHomePageFooter(){
        homePageFooter= PageFactory.initElements(driver,HomePageFooter.class);
    }
    @Test(enabled = false)
    public void facebookLiteValidation(){
        homePageFooter.validateFacebookLite();
    }
    @Test(enabled = false)
    public void watchValidation(){
        homePageFooter.validatemessanger();
    }
    @Test(enabled = false)
    public void peopleValidation(){
        homePageFooter.validatePeople();
    }
    @Test(enabled = false)
    public void pagesValidation(){
        homePageFooter.validatePages();
    }
    @Test(enabled = false)
    public void pageCategoriesValidation(){
        homePageFooter.validatePageCategories();
    }
    @Test
    public void placesValidation(){
        homePageFooter.validatePlaces();
    }

}
