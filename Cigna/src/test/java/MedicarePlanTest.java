import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MedicarePlanTest extends CommonAPI {
    MedicarePlans medicarePlans;

    @BeforeMethod
    public void setMedicarePlans() {
        medicarePlans = PageFactory.initElements(driver, MedicarePlans.class);
    }

    @Test(enabled = false)
    public void testOnGroupPlans() {
        medicarePlans.validateGroupPlans();
    }

    @Test(enabled = false)
    public void testOnCareProvider() {
        medicarePlans.validateCareProvider();
    }

    @Test(enabled = false)
    public void testOnDisplay() {
        medicarePlans.setDisplay();
    }

    @Test
    public void testOnMedicarePlans() {
        medicarePlans.setMedicarePlans();
    }
}
