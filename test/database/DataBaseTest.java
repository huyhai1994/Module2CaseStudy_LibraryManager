package database;

import org.junit.jupiter.api.Test;
import user.manageroperation.*;
import user.type.User;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DataBaseTest {

    @Test
    void getInstanceNotNull() {
        DataBase dataBase = DataBase.getInstance();
        assertNotNull(dataBase);
    }

    @Test
    void getNumberOfObjects() {
        DataBase.getInstance();
        int expectedNumberOfObjects = 1;
        int actualNumberOfObjects = DataBase.numberOfObjects;
        assertEquals(expectedNumberOfObjects, actualNumberOfObjects);
    }

    @Test
    void createTwoInstanceOfDataBase() {
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
    void usersManagerOperationsNotNull() {
        DataBase dataBase = DataBase.getInstance();
        UserManagerOperation[] usersManager = dataBase.getUsersManagerOperation();
        assertNotNull(usersManager);
    }

    @Test
    void isCreateObjectInUsersManagerOperations() {
        DataBase dataBase = DataBase.getInstance();
        UserManagerOperation[] usersManager = dataBase.getUsersManagerOperation();
        assertTrue(usersManager[0] instanceof Create);
    }


    @Test
    void isReadObjectInUsersManagerOperations() {
        DataBase dataBase = DataBase.getInstance();
        UserManagerOperation[] usersManager = dataBase.getUsersManagerOperation();
        assertTrue(usersManager[1] instanceof Read);
    }

    @Test
    void isUpdateObjectInUsersManagerOperations() {
        DataBase dataBase = DataBase.getInstance();
        UserManagerOperation[] usersManager = dataBase.getUsersManagerOperation();
        assertTrue(usersManager[2] instanceof Update);
    }

    @Test
    void isDeleteObjectInUsersManagerOperations() {
        DataBase dataBase = DataBase.getInstance();
        UserManagerOperation[] usersManager = dataBase.getUsersManagerOperation();
        assertTrue(usersManager[3] instanceof Delete);
    }

    @Test
    void getUsersNotNull() {
        DataBase dataBase = DataBase.getInstance();
        ArrayList<User> users = dataBase.getUsers();
        assertNotNull(users);
    }
}