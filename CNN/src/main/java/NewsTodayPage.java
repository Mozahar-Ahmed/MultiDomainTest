import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * News Today was the value of my search bar.So i created this class to emplement the
 * elements from my search result
 */
public class NewsTodayPage extends CommonAPI {
    public List<WebElement> getAllElementFromList() {
        return driver.findElements(By.xpath("//*[contains(@class,'facet_list')]"));
    }
}
