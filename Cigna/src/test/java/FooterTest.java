import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FooterTest extends CommonAPI {
    Footer Footer;

    @BeforeMethod
    public void setPageFooter() {
        Footer = PageFactory.initElements(driver, Footer.class);
    }

    @Test
    public void testOnGlossary() {
        Footer.validateglossary();
    }

    @Test
    public void testOnCignaAccess() {
        Footer.validateCignaAccess();
    }

    @Test
    public void testOnSupplies() {
        Footer.validateSupplies();
    }

    @Test
    public void testOnClaims() {
        Footer.validateClaims();
    }
}
