package database;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataBaseTest {

    @Test
    void getInstanceNotNull() {
        DataBase dataBase = DataBase.getInstance();
        assertNotNull(dataBase);
    }

    @Test
    void getNumberOfObjects() {
        DataBase dataBase = DataBase.getInstance();
        int expectedNumberOfObjects = 1;
        int actualNumberOfObjects = DataBase.numberOfObjects;
        assertEquals(expectedNumberOfObjects, actualNumberOfObjects);
    }

    @Test
    void createTwoInstanceOfDataBase() {
        DataBase dataBase = DataBase.getInstance();
        DataBase dataBase1 = DataBase.getInstance();
        int expectedNumberOfObjects = 2;
        int actualNumberOfObjects = DataBase.numberOfObjects;
        assertNotEquals(expectedNumberOfObjects, actualNumberOfObjects);
    }

    @Test
    void isOnlyOneObjectsCreated() {
        DataBase dataBase = DataBase.getInstance();
        DataBase dataBase1 = DataBase.getInstance();
        int expectedNumberOfObjects = 1;
        int actualNumberOfObjects = DataBase.numberOfObjects;
        assertEquals(expectedNumberOfObjects, actualNumberOfObjects);
    }

}