package access;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.Assert.assertNotNull;

class SignUpTest {

    @Test
    @DisplayName("Kiểm tra tính năng đăng kí Admin")
    public void testAdminAccountCreate() throws Exception {
        SignUp signUp = new SignUp();
        assertNotNull(signUp);
        signUp.createAccountDependOnUserChoice(1);
    }

    public static void main(String[] args) throws IOException {
        SignUp signUp = new SignUp();
        signUp.createAccountDependOnUserChoice(2);
    }

}