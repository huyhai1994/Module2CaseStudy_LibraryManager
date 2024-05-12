package user.type;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminTest {

    public Admin admin;

    @Test
    void getEmailFail() {
        String expected = "test@example.com";
        admin = new Admin();
        String result = admin.getEmail();
        assertNotEquals(expected, result);
    }

    @Test
    void getEmailPass() {
        String expected = "test@example.com";
        admin = new Admin();
        admin.setEmail("test@example.com");
        String result = admin.getEmail();
        assertEquals(expected, result);
    }

    @Test
    void getEmailNull() {
        admin = new Admin();
        assertNull(admin.getEmail());
    }

    @Test
    void getNameNull() {
        admin = new Admin();
        assertNull(admin.getName());
    }

    @Test
    void getNamePass() {
        admin = new Admin("Hai", 0);
        String expected = "Hai";
        String result = admin.getName();
        assertEquals(expected, result);
    }

    @Test
    void setNamPass() {
        admin = new Admin();
        assertNull(admin.getName());
        admin.setName("Huy");
        String result = admin.getName();
        String expected = "Huy";
        assertEquals(expected, result);
    }

    @Test
    void getPhoneNumberNull() {
        admin = new Admin();
        assertNull(admin.getPhoneNumber());
    }

    @Test
    void getPhoneNumberPass() {
        admin = new Admin();
        admin.setPhoneNumber("02-3456-2141");
        String expected = "02-3456-2141";
        String result = admin.getPhoneNumber();
        assertEquals(expected, result);
    }

    @Test
    void getId_0() {
        admin = new Admin();
        assertEquals(admin.getId(), 0);
    }

    @Test
    void setId() {
        admin = new Admin();
        admin.setId(1);
        assertEquals(admin.getId(), 1);
    }

    @Test
    void isAdmin_0() {
        int expected = 0;
        int result = Admin.numberOfUsers;
        assertEquals(expected, result);
    }

    @Test
    void isAdmin_1() {
        int expected = 1;
        admin = new Admin();
        int result = Admin.numberOfUsers;
        assertEquals(expected, result);
    }

    @Test
    void isAdmin_2() {
        int expected = 2;
        admin = new Admin();
        int result = Admin.numberOfUsers;
        assertEquals(expected, result);
    }
}