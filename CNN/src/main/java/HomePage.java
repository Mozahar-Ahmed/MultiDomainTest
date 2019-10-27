import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import report.TestLogger;

/**
 * this class is representing multiple locators of different element of cnn.com
 * main homePage;including search and world button and i have used some methods from CommonAPi class
 * and stored some element in WebElement objs so that we can reUse them.
 */
public class HomePage extends CommonAPI {
    public void clickOnSearchButton() {
        clickOnElementByXpath("//button[@class='buttonstyles__ButtonBase-augw5g-0 headerstyles__IconButton-sc-1vh4dor-0 ikSuiI']//*[@class='search-icon']");
        TestLogger.log("search button clicked");
    }

    public void typeOnSearchBar(String value) {
        typeOnElementByXpath("//input[@id='header-search-bar']", value);
        TestLogger.log(value + "typed on search bar");
    }

    public void clickOnSearch() {
        clickOnElementByXpath(
                "//div[@class='Box-sc-1fet97o-0 iKQPmQ']//button[@class='Flex-sc-1sqrs56-0 search-barstyles__Button-yoe3fw-2 kxpkSG']");
        TestLogger.log("clicked on search bar");
    }

    public void validateSearchPageDisplayed() {
        WebElement elementOfNewsTodayDisplay = getElement("//div[@class='cnn-search__results-count']");
        Assert.assertEquals(elementOfNewsTodayDisplay.isDisplayed(), true, "element is not displayed");
        TestLogger.log("Element of News Today's page displayed");
    }

    public void validateWorldButton() {
        WebElement elementOfWorldButton = getElement("//div[@class='Flex-sc-1sqrs56-0 headerstyles__HideOnMobile-sc-1vh4dor-9 kkGIDQ']//li[2]");
        Assert.assertEquals(elementOfWorldButton.isDisplayed(), true, "world button didn't displayed");
        elementOfWorldButton.click();
        WebElement valueOfWorldButton = getElement("//h1[@class='metadata-header__title']");
        valueOfWorldButton.getText();
    }

    public void validateBusinessButton() {
        WebElement elementOfBusinessButton = getElement("//div[@class='Flex-sc-1sqrs56-0 headerstyles__HideOnMobile-sc-1vh4dor-9 kkGIDQ']//li[4]");
        Assert.assertEquals(elementOfBusinessButton.isDisplayed(), true, "business button is not displayed");
        Assert.assertEquals(elementOfBusinessButton.isEnabled(), true, "business button is not enabled");
        elementOfBusinessButton.click();
        driver.navigate().to("https://cnn.com");
    }

    public void validateEditionButton() {
        WebElement elementOfEditionButton = getElement("//div[@id='edition-picker-toggle-desktop']");
        Assert.assertEquals(elementOfEditionButton.isDisplayed(), true, "edition button is not displayed");
        elementOfEditionButton.click();
        WebElement valueOfEditionMethod = getElement("//div[@class='Box-sc-1fet97o-0 edition-pickerstyles__Dropdown-t9lxqp-2 gTgbio']");
        Assert.assertEquals(valueOfEditionMethod.isDisplayed(), true, "value doesn'tdisplayed");
    }

    public void validateTrending() {
        WebElement elementOfTrending = getElement("//span[@class='cd__pre-headline']");
        Assert.assertEquals(elementOfTrending.isDisplayed(), true);
        Assert.assertEquals(elementOfTrending.isEnabled(), true);
        elementOfTrending.click();
    }

    public void menuIcon() {
        clickOnElementByXpath("//*[@class='menu-icon']");
    }

    public void validateLiveTv() {
        WebElement elementOFLiveTV = getElement("//span[@class='Text-sc-1amvtpj-0-span bcvWKK']");
        Assert.assertEquals(elementOFLiveTV.isDisplayed(), true);
        elementOFLiveTV.click();
    }

    public void validateTechLocator() {
        WebElement elementOfTech = getElement("//h2[contains(text(),'Tech')]");
        Assert.assertEquals(elementOfTech.isDisplayed(), true);
        Assert.assertEquals(elementOfTech.isEnabled(), true);
    }

    public void validateScienceAndHealth() {
        WebElement elementOfScienceAndHealh = getElement("//h2[contains(text(),'Science & Health')]");
        Assert.assertEquals(elementOfScienceAndHealh.isDisplayed(), true);
        Assert.assertEquals(elementOfScienceAndHealh.isEnabled(), true);
    }

    public void validateVideo() {
        clickOnElementByXpath("//div[@class='Grid-sc-1kcyc0j-0 headerstyles__NavGrid-sc-1vh4dor-3 EHnfs']//li[11]");
    }
}
