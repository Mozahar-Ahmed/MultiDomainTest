import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import report.TestLogger;

public class Footer extends CommonAPI {
    @FindBy(linkText = "Company Profile")
    WebElement companyProfile;
    @FindBy(linkText = "//h2[@class='promo-headline']")
    WebElement companyProfileValue;
    @FindBy(linkText = "Careers")
    WebElement careers;
    @FindBy(linkText = "Glossary")
    WebElement glossary;
    @FindBy(linkText = "CignaAccess")
    WebElement cignaAccess;
    @FindBy(linkText = "Suppliers")
    WebElement supplies;
    @FindBy(xpath = "//a[contains(text(),'View My Claims and')]")
    WebElement claims;

    public void validateCompanyProfiles() {
        Assert.assertEquals(companyProfile.isDisplayed(), true, "company profile is not get displayed");
        Assert.assertEquals(companyProfile.isEnabled(), true);
        companyProfile.click();
        Assert.assertEquals(companyProfileValue.isDisplayed(), true);
    }

    public void validateCareer() {
        Assert.assertEquals(careers.isDisplayed(), true, "career is not displayed");
        Assert.assertEquals(careers.isEnabled(), true);
        careers.click();
        TestLogger.log("career button clicked");
    }

    public void validateglossary() {
        Assert.assertEquals(glossary.isDisplayed(), true, "glossary is not displayed");
        Assert.assertEquals(glossary.isEnabled(), true);
        glossary.click();
        TestLogger.log("glossary button clicked");
    }

    public void validateCignaAccess() {
        Assert.assertEquals(cignaAccess.isDisplayed(), true, "cignaAccess is not displayed");
        Assert.assertEquals(cignaAccess.isEnabled(), true);
        cignaAccess.click();
        TestLogger.log("cigna access clicked");
    }

    public void validateSupplies() {
        Assert.assertEquals(supplies.isDisplayed(), true,"supplies is not displayed");
        Assert.assertEquals(supplies.isEnabled(), true);
        supplies.click();
        TestLogger.log("supplies button clicked");
    }

    public void validateClaims() {
        Assert.assertEquals(claims.isDisplayed(), true, "claims is not displayed");
        Assert.assertEquals(claims.isEnabled(), true);
        claims.click();
        TestLogger.log("claims button clicked");
    }
}
