package signinTest;

import org.testng.annotations.Test;
import signin.Signout;

public class SignoutTest extends Signout {
    @Test
    public void signOut() {
        validateSignOut();
    }
}
