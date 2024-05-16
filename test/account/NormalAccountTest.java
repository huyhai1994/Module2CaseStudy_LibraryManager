package account;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class NormalAccountTest {
    @Test
    void checkNormalCountObjectNotNull() throws Exception {
        NormalAccount normalAccount = new NormalAccount();
        assertNotNull(normalAccount);
    }

    @DisplayName("Kiểm tra tính năng tạo mới tài khoản bình thường")
    public static void main(String[] args) throws IOException {
        NormalAccount normalAccount = new NormalAccount();
        normalAccount.getUserChoiseAndCreateUserAccount();
    }
}