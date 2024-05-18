package iooperations;

import org.junit.jupiter.api.Test;
import user.type.Admin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class ReadUserFileTest {
    @Test
    void testReadContentsFromTestFile() throws IOException {
        ReadUserFile readUserFile = new ReadUserFile("data/test.csv");
        assertTrue(readUserFile.isContentExist());
        System.out.println();
    }

    @Test
    void testReadContentsReturnsUserlist() throws IOException {
        ReadUserFile readUserFile = new ReadUserFile("datatest/userWriteTest.csv");
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
        ArrayList<Admin> results = readUserFile.readContentsFromFile();
        System.out.println(results);
        System.out.println(expected);
        //assertArrayEquals(expected.toArray(), results.toArray());
        assertEquals(expected.size(), results.size());
        for (int i = 0; i < expected.size(); i++)
            assertEquals( expected.get(i), results.get(i));

    }
}