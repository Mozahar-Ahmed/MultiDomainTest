package signinPageTest;

import org.testng.annotations.Test;
import signinPage.Signout;

public class SignoutTest extends Signout {
    @Test
    public void signOut() {
        validateSignOut();
    }
}
