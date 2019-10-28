package homePageTest;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownTest extends CommonAPI {
    @Test(enabled =true)
    public void testDropDown() {
        WebElement elementOfDropDown = elementByXpath("//select[@id='gh-cat']");
        Select select = new Select(elementOfDropDown);
        select.selectByIndex(3);
    }
}
