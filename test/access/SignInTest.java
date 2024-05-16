package access;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class SignInTest {
    @Test
    @DisplayName("Kiểm tra thử tính năng đăng nhập")
    void operating() throws IOException {
        SignIn signIn = new SignIn();
        assertNotNull(signIn);
        signIn.operating();
    }
}