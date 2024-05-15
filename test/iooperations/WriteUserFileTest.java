package iooperations;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import user.type.Admin;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


class WriteUserFileTest {

    String filePath = "data/userWriteTest.csv";

    @Test
    void isFileExistsTest() throws IOException {
        WriteUserFile writeUserFile = new WriteUserFile("data/userTest.csv");
        assertTrue(writeUserFile.isFileExist());
    }

    @Test
    @DisplayName("Thu ghi thong tin nguoi quan tri vao file default")
    void writeContentsToDefaultFileTest() throws IOException {
        WriteUserFile writeUserFile = new WriteUserFile();
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
        writeUserFile.writeContentsToFile(expected);
    }

    @Test
    @DisplayName("Thu ghi thong tin nguoi quan tri vao file")
    void writeContentsToFileTest() throws IOException {
        WriteUserFile writeUserFile = new WriteUserFile(filePath);
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
        writeUserFile.writeContentsToFile(expected);
    }

}
