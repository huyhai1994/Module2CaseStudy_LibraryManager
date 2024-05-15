package user.manageroperation;

import database.DataBase;
import iooperations.WriteUserFile;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import user.type.Admin;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CreateTest {
    @Test
    void createOneAdmin() throws IOException {
        DataBase dataBase = DataBase.getInstance();
        Admin admin = new Admin();
        UserManagerOperation[] usersManager = dataBase.getUsersManagerOperation();
        Create create;
        create = (Create) usersManager[0];
        create.addAdmin(admin);
        int expected = 1;
        int result = dataBase.getUsers().size();
        assertEquals(expected, result);
        dataBase.getUsers().clear();
    }

    @Test
    void createTwoAdmin() throws IOException {
        DataBase dataBase = DataBase.getInstance();
        Admin admin = new Admin();
        UserManagerOperation[] usersManager = dataBase.getUsersManagerOperation();
        Create create;
        create = (Create) usersManager[0];
        create.addAdmin(admin);
        create.addAdmin(admin);
        int expected = 2;
        int result = dataBase.getUsers().size();
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Tao va ghi 3 tai khoan admin (id, ten, email, sdt, vai tro)")
    void createAndWriteThreeAdminToFile() throws IOException {
        DataBase dataBase = DataBase.getInstance();
        UserManagerOperation[] usersManager = dataBase.getUsersManagerOperation();
        Create create = (Create) usersManager[0];
        Admin admin1 = new Admin(1, "admin1");
        admin1.setEmail("admin1@gmail.com");
        admin1.setPhoneNumber("01-0000-0001");
        Admin admin2 = new Admin(2, "admin2");
        admin2.setEmail("admin2@gmail.com");
        admin2.setPhoneNumber("01-0000-0002");
        Admin admin3 = new Admin(3, "admin3");
        admin3.setEmail("admin3@gmail.com");
        admin3.setPhoneNumber("01-0000-0003");
        create.addAdmin(admin1);
        create.addAdmin(admin2);
        create.addAdmin(admin3);

    }

}