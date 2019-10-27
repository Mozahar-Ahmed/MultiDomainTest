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

    @Test
    public void testOnGroupPlans() {
        medicarePlans.validateGroupPlans();
    }

    @Test
    public void testOnCareProvider() {
        medicarePlans.validateCareProvider();
    }

    @Test
    public void testOnDisplay() {
        medicarePlans.setDisplay();
    }

    @Test
    public void testOnMedicarePlans() {
        medicarePlans.setMedicarePlans();
    }
}
