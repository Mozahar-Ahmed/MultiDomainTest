import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class FooterTest extends Footer {
    @Test(enabled = false)
    public void testOnHealth() {
        validateHealthButton();
    }

    @Test(enabled = false)
    public void validateHealthValueDisplayed() {
        validateHealthButton();
    }

    @Test(enabled = false)
    public void testOnTermsAndUse() {
        validateTermsAndUse();
    }

    @Test(enabled = false)
    public void validateTermsValueDisplayed() {
        validateTermsAndUse();
    }

    @Test(enabled = false)
    public void testOnFooterMenu() {
        List<WebElement> footerMenuList = footerMenu();
        System.out.println(footerMenuList.size());
    }

    @Test(enabled = false)
    public void testOnPrivacyPolicy() {
        validatePrivacyPolicy();
    }

    @Test(enabled = false)
    public void testOnPrivacyPolicyValueEnabled() {
        validatePrivacyPolicy();
    }

    @Test(enabled = false)
    public void testOnPageDocumentation() {
        validatePageDocumentation();
    }

    @Test(enabled = false)
    public void testOnFooterTurner() {
        validateFooterTurner();
    }

    @Test(enabled = false)
    public void testOnLinkedText() {
        validateLinkTextSports();
    }

    @Test
    public void testOnFooterLinktext() {
        validateLinkedtext();
    }
}
