package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage extends CommonAPI {
    @FindBy(xpath = "//a[contains(text(),'Customer Service')]")
    WebElement customerService;
    @FindBy(xpath = "//span[@class='nav-line-2 nav-long-width']")
    WebElement accountAndLists;

    public void validateHomePage() {
        System.out.println(customerService.isDisplayed());
        Assert.assertEquals(customerService.isDisplayed(), true, "amazon home page is not displayed");
    }

    public void clickOnAccountAndLists() {
        accountAndLists.click();
    }

    public void signIn() {
        clickOnElementByXpath("//div[@id='nav-signin-tooltip']//span[@class='nav-action-inner'][contains(text(),'Sign in')]");
    }
}
