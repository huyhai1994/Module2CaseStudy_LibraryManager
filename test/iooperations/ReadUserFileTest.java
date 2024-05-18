package iooperations;

import org.junit.jupiter.api.Test;
import user.type.Admin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class ReadUserFileTest {

    private String filePath = "datatest/userWriteTest.csv";

    @Test
    void testReadContentsFromTestFile() throws IOException {
        ReadUserFile readUserFile = new ReadUserFile(filePath);
        assertTrue(readUserFile.isContentExist());
        System.out.println();
    }

    @Test
    void testReadContentsReturnsUserlist() throws IOException {
        ReadUserFile readUserFile = new ReadUserFile(filePath);
        ArrayList<Admin> expected = getAdmins();
        ArrayList<Admin> results = readUserFile.readContentsFromFile();
        for (int i = 0; i < expected.size(); i++) {
            assertTrue(results.get(i).getName().equals(expected.get(i).getName()));
            assertTrue(results.get(i).getEmail().equals(expected.get(i).getEmail()));
            assertTrue(results.get(i).getPhoneNumber().equals(expected.get(i).getPhoneNumber()));
        }
    }
    @Test
    void testArrayListObjectsEqual(){
        ArrayList<Admin> expected = getAdmins();
        ArrayList<Admin> result = getAdmins();
        assertEquals(expected.get(0).getName(), result.get(0).getName());
        assertEquals(expected.get(1).getName(), result.get(1).getName());
        assertEquals(expected.get(2).getName(), result.get(2).getName());
    }

    private static ArrayList<Admin> getAdmins() {
        ArrayList<Admin> expected = new ArrayList<>();
        Admin admin1 = new Admin(1, "admin1");
        admin1.setEmail("admin1@gmail.com");
        admin1.setPhoneNumber("01-0000-0001");
        Admin admin2 = new Admin(2, "admin2");
        admin2.setEmail("admin2@gmail.com");
        admin2.setPhoneNumber("01-0000-0002");
        Admin admin3 = new Admin(3, "admin3");
        admin3.setEmail("admin3@gmail.com");
        admin3.setPhoneNumber("01-0000-0003");
        expected.add(admin1);
        expected.add(admin2);
        expected.add(admin3);
        return expected;
    }
}