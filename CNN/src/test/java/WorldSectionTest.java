import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class WorldSectionTest extends WorldSection {
    @Test
    public void worldSectionPageTest() {
        detailedElementOfWorldSection("//div[@class='Cell-i0zvfi-0 headerstyles__NavBarContent-sc-1vh4dor-4 gcRmuT']");
        List<WebElement> worldElementList = getPageHeaderOfWorldPage();
        System.out.println(worldElementList.size());
        for (int j = 0; j < worldElementList.size(); j++) {
            System.out.println(worldElementList.get(j).getText());
        }
    }
}
