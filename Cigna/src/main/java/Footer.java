import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import report.TestLogger;

public class Footer extends CommonAPI {
    @FindBy(linkText = "Glossary")
    WebElement glossary;
    @FindBy(linkText = "CignaAccess")
    WebElement cignaAccess;
    @FindBy(linkText = "Suppliers")
    WebElement supplies;
    @FindBy(xpath = "//a[contains(text(),'View My Claims and')]")
    WebElement claims;

    public void validateglossary() {
        Assert.assertEquals(glossary.isDisplayed(), true, "glossary is displayed");
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
        Assert.assertEquals(supplies.isDisplayed(), true);
        Assert.assertEquals(supplies.isEnabled(), true);
        supplies.click();
        TestLogger.log("supplies button clicked");
    }

    public void validateClaims() {
        Assert.assertEquals(claims.isDisplayed(), true);
        Assert.assertEquals(claims.isEnabled(), true);
        claims.click();
    }
}
