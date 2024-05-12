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

    @Test
    void getNameNull() {
        Admin admin = new Admin();
        assertNull(admin.getName());
    }

    @Test
    void getNamePass() {
        Admin admin = new Admin("Hai", 0);
        String expected = "Hai";
        String result = admin.getName();
        assertEquals(expected, result);
    }

    @Test
    void setNamPass() {
        Admin admin = new Admin();
        assertNull(admin.getName());
        admin.setName("Huy");
        String result = admin.getName();
        String expected = "Huy";
        assertEquals(expected, result);
    }

    @Test
    void getPhoneNumberNull() {
        Admin admin = new Admin();
        assertNull(admin.getPhoneNumber());
    }

    @Test
    void getPhoneNumberPass() {
        Admin admin = new Admin();
        admin.setPhoneNumber("02-3456-2141");
        String expected = "02-3456-2141";
        String result = admin.getPhoneNumber();
        assertEquals(expected, result);
    }

    @Test
    void getId_0() {
        Admin admin = new Admin();
        assertEquals(admin.getId(), 0);
    }

    @Test
    void setId() {
        Admin admin = new Admin();
        admin.setId(1);
        assertEquals(admin.getId(), 1);
    }
}