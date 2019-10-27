import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFactoryHomePage extends CommonAPI {
    @FindBy(className = "menu-icon")
    public static WebElement getmenuIcon;
    @FindBy(xpath = "//li[@class='nav-linksstyles__SectionTitle-sc-1tike8v-3 hNYoQv']//a[@name='world'][contains(text(),'World')]")
    public static WebElement getWorldSection;
    @FindBy(xpath = "//li[@class='nav-linksstyles__SectionTitle-sc-1tike8v-3 hNYoQv']//a[@name='travel'][contains(text(),'Travel')]")
    public static WebElement getStyleSection;
    @FindBy(xpath = "//li[@class='nav-linksstyles__SectionTitle-sc-1tike8v-3 hNYoQv']//a[@name='politics'][contains(text(),'Politics')]")
    public static WebElement getPoliticsSection;

    public void validateMenuIcon() {
        getmenuIcon.click();
    }

    public void validateWorldButton2() {
        getWorldSection.click();
    }

    public void validateStyleSection() {
        getStyleSection.click();
    }

    public void validatePolitics() {
        getPoliticsSection.click();
    }
}
