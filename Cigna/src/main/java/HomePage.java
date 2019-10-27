import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {
    @FindBy(xpath = "//a[@class='nav-link'][contains(text(),'Individuals and Families')]")
    WebElement firstHeader;
    @FindBy(xpath = "//a[@class='nav-link'][contains(text(),'Employers and Brokers')]")
    WebElement secondHeader;
    @FindBy(xpath = "//a[@class='nav-link'][contains(text(),'Health Care Providers')]")
    WebElement thirdHeader;
    @FindBy(xpath = "//a[@class='nav-link'][contains(text(),'Health Care Providers')]")
    WebElement contactbutton;
    @FindBy(xpath = "//a[@class='nav-link'][contains(text(),'About Us')]")
    WebElement aboutUs;
    @FindBy(xpath = "//a[@class='nav-link small-text'][contains(text(),'Cigna International')]")
    WebElement cignaInternational;
    @FindBy(xpath = "//div[@class='container']//*[@class='d-inline-block align-top']")
    WebElement logo;

    public void setCignaInternational() {
        cignaInternational.isDisplayed();
    }

    public void setLogo() {
        logo.isDisplayed();
        logo.isEnabled();
    }

    public void validateFirstHeader() {
        firstHeader.click();
    }

    public void validateSecondHeader() {
        secondHeader.click();
    }

    public void validateThirdHeader() {
        thirdHeader.click();
    }

    public void validateContact() {
        contactbutton.click();
    }

    public void setAboutUs() {
        aboutUs.click();
    }
}
