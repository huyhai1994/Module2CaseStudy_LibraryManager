package user.type;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminTest {
    @Test
    void getEmailFail() {
        String expected = "test@example.com";
        Admin admin = new Admin();
        String result = admin.getEmail();
        assertNotEquals(expected, result);
    }

    @Test
    void getEmailPass() {
        String expected = "test@example.com";
        Admin admin = new Admin();
        admin.setEmail("test@example.com");
        String result = admin.getEmail();
        assertEquals(expected, result);
    }

    @Test
    void getEmailNull() {
        Admin admin = new Admin();
        assertNull(admin.getEmail());
    }

}