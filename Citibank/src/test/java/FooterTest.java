import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FooterTest extends CommonAPI {
    Footer footer;
    @BeforeMethod
    public void setFooter(){
        footer= PageFactory.initElements(driver,Footer.class);
    }
    @Test
    public void whycityValidation(){
        footer.validateWhyCiti();
    }
    @Test
    public void ralationshipBankingValidation(){
        footer.validateRelationshipBanking();
    }
    @Test
    public void businessBankingValidation(){
        footer.validateBusinessBanking();
    }
    @Test
    public void validateRates(){
        footer.validateRates();
    }

}
