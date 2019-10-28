import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MedicarePlans extends CommonAPI {
    @FindBy(xpath = "//div[@class='container']//*[@class='d-inline-block align-top']")
    WebElement medicarePlans;
    @FindBy(xpath = "//h1[@class='display']")
    WebElement display;
    @FindBy(xpath = "//a[@class='nav-link'][contains(text(),'Group Plans')]")
    WebElement groupPlans;
    @FindBy(xpath = "//a[@class='nav-link small-text'][contains(text(),'For Health Care Providers')]")
    WebElement careProvider;

    public void validateGroupPlans() {
        Assert.assertEquals(groupPlans.isDisplayed(), true, "group plan is not displayed");
        Assert.assertEquals(groupPlans.isEnabled(), true, "group plan is not enabled");
    }

    public void validateCareProvider() {
        Assert.assertEquals(careProvider.isDisplayed(), true, "care provider is not displayed");
        Assert.assertEquals(careProvider.isEnabled(), true, "care provider is not enabled");
        careProvider.click();
    }

    public void setDisplay() {
        Assert.assertEquals(display.isDisplayed(), true, "is not displayed");
    }

    public void setMedicarePlans() {
        medicarePlans.click();
    }
}
