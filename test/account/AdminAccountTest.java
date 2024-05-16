package account;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class AdminAccountTest {
    @Test
    void checkAdmindCountObjectNotNull() throws Exception {
        AdminAccount adminAccount = new AdminAccount();
        assertNotNull(adminAccount);
    }

    @DisplayName("Kiểm tra thử tính năng tạo tài khoản Admin")
    public static void main(String[] args) throws IOException {
        AdminAccount adminAccount = new AdminAccount();
        adminAccount.getUserChoiseAndCreateUserAccount();
    }
}