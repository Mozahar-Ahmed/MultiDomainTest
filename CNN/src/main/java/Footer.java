import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

/**
 * this class is representing most of the elements from cnn.com page footer.I have created obj of HomePage class & brought
 * a method from that class which is necessary to get proper result of this class. And i have
 * used List to store some of the elements.
 */
public class Footer extends CommonAPI {
    HomePage homePage = new HomePage();

    public void validateHealthButton() {
        homePage.menuIcon();
        WebElement elementOfHealth = getElement("//div[@class='Box-sc-1fet97o-0 jSTOdN']//a[@name='health'][contains(text(),'Health')]");
        Assert.assertEquals(elementOfHealth.isDisplayed(), true);
        Assert.assertEquals(elementOfHealth.isEnabled(), true);
        elementOfHealth.click();
        WebElement valueOfHealth = getElement("//img[@class='metadata-header__logo']");
        Assert.assertEquals(valueOfHealth.isDisplayed(), true);
    }

    public void validateTermsAndUse() {
        WebElement elementOfTermsAndUse = getElement("//a[@name='terms-of-use']");
        Assert.assertEquals(elementOfTermsAndUse.isDisplayed(), true);
        Assert.assertEquals(elementOfTermsAndUse.isEnabled(), true);
        elementOfTermsAndUse.click();
        WebElement valueOfTermsAndUse = getElement("//h1[@class='pg-headline']");
        Assert.assertEquals(valueOfTermsAndUse.isDisplayed(), true);
    }

    public List<WebElement> footerMenu() {
        return driver.findElements(By.xpath("//ul[@class='nav-linksstyles__NavLinkList-sc-1tike8v-2 ksljyS']"));
    }

    public void validatePrivacyPolicy() {
        WebElement elementOfPeivacyPolicy = getElement("//a[@name='privacy-policy']");
        elementOfPeivacyPolicy.click();
        WebElement valueOfPrivacyPolicy = getElement("//body[@class='pg pg-cnn-info pg-leaf pg-article domestic t-light multi-ads--complete pg-show-read-all']/div[contains(@class,'pg-right-rail-tall pg-wrapper')]/article[contains(@class,'pg-rail-tall pg-rail--align-right')]/div[@class='l-container']/div[@class='pg-rail-tall__wrapper']/div[@class='pg-side-of-rail pg-rail-tall__side']/div[@class='pg-rail-tall__body']/section[@id='body-text']/div[@class='l-container']/div[@class='el__embedded el__embedded--standard']/div[@class='element-raw appearance-standard']/p[@class='zn-body__paragraph']/a[1]");
        Assert.assertEquals(valueOfPrivacyPolicy.isEnabled(), true);
    }

    public void validatePageDocumentation() {
        WebElement elementOfPageDocumentation = getElement("//div[@class='Box-sc-1fet97o-0 copyright__CopyrightContainer-f3mp1a-2 LmrhR']//span[1]");
        Assert.assertEquals(elementOfPageDocumentation.isDisplayed(), true);
    }

    public void validateFooterTurner() {
        WebElement elementOfFooterTurner = getElement("//a[@class='Text-sc-1amvtpj-0-a Link-sc-1hkqz5e-0 copyright__TBSLink-f3mp1a-1 iqIHwd']");
        Assert.assertEquals(elementOfFooterTurner.isDisplayed(), true);
        Assert.assertEquals(elementOfFooterTurner.isEnabled(), true);
        elementOfFooterTurner.click();
        driver.navigate().to("https://cnn.com");
    }

    public void validateLinkTextSports() {
        driver.findElement(By.linkText("Sports")).click();
        driver.navigate().to("https://cnn.com");
    }

    public void validateLinkedtext() {
        WebElement elementOfFooterLinktext = getElement("//div[@class='Flex-sc-1sqrs56-0 footerstyles__SocialWrap-sc-1gdpf6x-2 bJEKPs']//span[@class='Text-sc-1amvtpj-0-span jKFEoX'][contains(text(),'Follow CNN')]");
        Assert.assertEquals(elementOfFooterLinktext.isDisplayed(), true);
    }
}
