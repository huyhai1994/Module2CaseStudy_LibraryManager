package user.type;

import database.DataBase;
import iooperations.CreateFile;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;

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
        admin = new Admin(0, "Hai");
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

    @Test
    void toStringTest() {
        admin = new Admin(1, "CodeGym");
        admin.setPhoneNumber("03-0226-0046");
        admin.setEmail("codeGym123@gmail.com");
        String expected = "1,CodeGym,codeGym123@gmail.com,03-0226-0046,Admin";
        String result = admin.toString();
        assertEquals(expected, result);
    }
    @Test
    void idAutomaticallyIncrement() throws IOException {
        CreateFile createFile = new CreateFile("datatest/maxTemporaryId.csv");
        createFile.createFile();
        assertTrue(createFile.isFileExist());
        Admin admin1 = new Admin(1, "admin1");
        Admin admin2 = new Admin(2, "admin2");
        Admin admin3 = new Admin(3, "admin3");
        DataBase dataBase = DataBase.getInstance();
        ArrayList<Admin> admins = dataBase.getAdmins();
        admins.add(admin1);
        admins.add(admin2);
        admins.add(admin3);

        int expected = 1;
        int result = admins.size();

        assertEquals(expected , result);

    }
}