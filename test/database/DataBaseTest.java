package database;

import org.junit.jupiter.api.Test;
import user.manageroperation.*;
import user.type.User;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DataBaseTest {

    @Test
    void getInstanceNotNull() throws IOException {
        DataBase dataBase = DataBase.getInstance();
        assertNotNull(dataBase);
    }

    @Test
    void getNumberOfObjects() throws IOException {
        DataBase.getInstance();
        int expectedNumberOfObjects = 1;
        int actualNumberOfObjects = DataBase.numberOfObjects;
        assertEquals(expectedNumberOfObjects, actualNumberOfObjects);
    }

    @Test
    void createTwoInstanceOfDataBase() throws IOException {
        DataBase.getInstance();
        DataBase.getInstance();
        int expectedNumberOfObjects = 2;
        int actualNumberOfObjects = DataBase.numberOfObjects;
        assertNotEquals(expectedNumberOfObjects, actualNumberOfObjects);
    }

    @Test
    void isOnlyOneObjectsCreated() {
        int expectedNumberOfObjects = 1;
        int actualNumberOfObjects = DataBase.numberOfObjects;
        assertEquals(expectedNumberOfObjects, actualNumberOfObjects);
    }

    @Test
    void usersManagerOperationsNotNull() throws IOException {
        DataBase dataBase = DataBase.getInstance();
        UserManagerOperation[] usersManager = dataBase.getUsersManagerOperation();
        assertNotNull(usersManager);
    }

    @Test
    void isCreateObjectInUsersManagerOperations() throws IOException {
        DataBase dataBase = DataBase.getInstance();
        UserManagerOperation[] usersManager = dataBase.getUsersManagerOperation();
        assertTrue(usersManager[0] instanceof Create);
    }


    @Test
    void isReadObjectInUsersManagerOperations() throws IOException {
        DataBase dataBase = DataBase.getInstance();
        UserManagerOperation[] usersManager = dataBase.getUsersManagerOperation();
        assertTrue(usersManager[1] instanceof Read);
    }

    @Test
    void isUpdateObjectInUsersManagerOperations() throws IOException {
        DataBase dataBase = DataBase.getInstance();
        UserManagerOperation[] usersManager = dataBase.getUsersManagerOperation();
        assertTrue(usersManager[2] instanceof Update);
    }

    @Test
    void isDeleteObjectInUsersManagerOperations() throws IOException {
        DataBase dataBase = DataBase.getInstance();
        UserManagerOperation[] usersManager = dataBase.getUsersManagerOperation();
        assertTrue(usersManager[3] instanceof Delete);
    }

    @Test
    void getUsersNotNull() throws IOException {
        DataBase dataBase = DataBase.getInstance();
        ArrayList<User> users = dataBase.getUsers();
        assertNotNull(users);
    }
}