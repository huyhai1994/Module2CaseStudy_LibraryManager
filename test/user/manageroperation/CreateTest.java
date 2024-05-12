package user.manageroperation;

import database.DataBase;
import org.junit.jupiter.api.Test;
import user.type.Admin;

import static org.junit.jupiter.api.Assertions.*;

class CreateTest {
    @Test
    void createOneAdmin() {
        DataBase dataBase = DataBase.getInstance();
        Admin admin = new Admin();
        UserManagerOperation[] usersManager = dataBase.getUsersManagerOperation();
        Create create;
        create = (Create) usersManager[0];
        create.addUser(admin);
        int expected = 1;
        int result = dataBase.getUsers().size();
        assertEquals(expected, result);
        dataBase.getUsers().clear();
    }

    @Test
    void createTwoAdmin() {
        DataBase dataBase = DataBase.getInstance();
        Admin admin = new Admin();
        UserManagerOperation[] usersManager = dataBase.getUsersManagerOperation();
        Create create;
        create = (Create) usersManager[0];
        create.addUser(admin);
        create.addUser(admin);
        int expected = 2;
        int result = dataBase.getUsers().size();
        assertEquals(expected, result);
    }

}