import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import report.TestLogger;
import sun.security.timestamp.TSRequest;

public class Footer {
    @FindBy(xpath = "//h2[@class='hidden-sm hidden-xs']//b[contains(text(),'Why Citi')]")
    WebElement whyCiti;
    @FindBy(xpath = "//h2[@class='hidden-sm hidden-xs']//b[contains(text(),'Relationship Banking')]")
    WebElement relationshipBanking;
    @FindBy(xpath = "//h2[@class='hidden-sm hidden-xs']//b[contains(text(),'Business Banking')]")
    WebElement businessBanking;
    @FindBy(xpath = "//h2[@class='hidden-sm hidden-xs']//b[contains(text(),'Rates')]")
    WebElement rates;
    @FindBy(xpath = "//h2[@class='hidden-sm hidden-xs']//b[contains(text(),'Help & Support')]")
    WebElement helpAndSupport;
    public void validateWhyCiti(){
        System.out.println(whyCiti.isDisplayed());
        Assert.assertEquals(whyCiti.isDisplayed(),true);
        whyCiti.click();
        TestLogger.log("why citi is clicked");
    }
    public void validateRelationshipBanking(){
        System.out.println(relationshipBanking.isDisplayed());
        Assert.assertEquals(relationshipBanking.isDisplayed(),true);
        relationshipBanking.click();
        TestLogger.log("relationship banking is clicked");
    }
    public void validateBusinessBanking(){
        System.out.println(businessBanking.isDisplayed());
        Assert.assertEquals(businessBanking.isDisplayed(),true);
        businessBanking.click();
        TestLogger.log("business banking is clicked");

    }
    public  void validateRates(){
        System.out.println(rates.isDisplayed());
        Assert.assertEquals(rates.isDisplayed(),true);
        rates.click();
        TestLogger.log("rates is clicked");
    }
}
