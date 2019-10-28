import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import report.TestLogger;

public class HomePageFooter {
    @FindBy(linkText = "Messenger")
    WebElement messanger;
    @FindBy(linkText = "Facebook Lite")
    WebElement facebookLite;
    @FindBy(linkText = "Watch")
    WebElement watch;
    @FindBy(linkText = "People")
    WebElement people;
    @FindBy(linkText = "Pages")
    WebElement pages;
    @FindBy(linkText = "Page Categories")
    WebElement pageCategories;
    @FindBy(linkText = "Places")
    WebElement places;

    public void validatemessanger() {
        Assert.assertEquals(messanger.isDisplayed(), true);
        messanger.click();
        TestLogger.log("messanger clicked");
    }

    public void validateFacebookLite() {
        Assert.assertEquals(facebookLite.isDisplayed(), true);
        facebookLite.click();
        TestLogger.log("watch clicked");
    }

    public void validateWatch() {
        Assert.assertEquals(watch.isDisplayed(), true);
        watch.click();
        TestLogger.log("watch clicked");
    }

    public void validatePeople() {
        Assert.assertEquals(people.isDisplayed(), true);
        people.click();
        TestLogger.log("people clicked");
    }

    public void validatePages() {
        Assert.assertEquals(pages.isDisplayed(), true);
        pages.click();
        TestLogger.log("pages clicked");
    }

    public void validatePageCategories() {
        Assert.assertEquals(pageCategories.isDisplayed(), true);
        pageCategories.click();
        TestLogger.log("page categories clicked");
    }

    public void validatePlaces() {
        Assert.assertEquals(places.isDisplayed(), true);
        places.click();
        TestLogger.log("places clicked");
    }
}
