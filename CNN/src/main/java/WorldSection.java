import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WorldSection extends CommonAPI {
    HomePage homePage = new HomePage();

    public void detailedElementOfWorldSection(String locatorOfWorldPageHeaderCollection) {
        homePage.validateWorldButton();
        getValueByXpath(locatorOfWorldPageHeaderCollection);
    }

    public List<WebElement> getPageHeaderOfWorldPage() {
        return driver.findElements(By.xpath("//*[contains(@class,'nav-linksstyles__NavLink-sc-1tike8v-1 fxRQgN')]"));
    }


}
