import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FunctionalityTests extends CommonAPI {

    @Test(enabled = true)
    public void testMouseHover() {
        WebElement element = getElementByLinkText("Careers");
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
        getElementByLinkText("Rewards");
    }

    @Test(enabled = false)
    public void scrollToView() {
        WebElement element = getElementByLinkText("Citi Priority");
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    @Test(enabled = false)
    public void testScrolling() {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,2000)");
    }

    @Test(enabled = false)
    public void testDropDown() {
        WebElement element = elementByXpath("//a[@id='banking']");
        Select select = new Select(element);
        select.selectByIndex(3);
    }
}
