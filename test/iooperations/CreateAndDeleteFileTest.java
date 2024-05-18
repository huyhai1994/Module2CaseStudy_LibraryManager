package iooperations;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class CreateAndDeleteFileTest {

    @Test
    public void isFileExist() {
        CreateFile createFile = new CreateFile();
        assertTrue(createFile.isFileExist());
    }

    @Test
    public void isNotFileExist() {
        CreateFile createFile = new CreateFile();
        assertFalse(createFile.isFileExist());
    }

    @Test
    @DisplayName("Tao va xoa file voi file csv mac dinh")
    public void createAndDeleteFileDefaultPath() throws IOException {
        CreateFile createFile = new CreateFile();
        createFile.createFile();
        assertTrue(createFile.isFileExist());
        DeleteFile deleteFile = new DeleteFile();
        deleteFile.deleteFile();
        assertTrue(createFile.isFileNotExist());
    }

    @Test
    @DisplayName("Tao va xoa file voi ten file nhap vao.")
    public void createAndDeleteFileWithInputFilePath() throws IOException {
        CreateFile createFile = new CreateFile("data/test1.csv");
        createFile.createFile();
        assertTrue(createFile.isFileExist());
        DeleteFile deleteFile = new DeleteFile("data/test1.csv");
        deleteFile.deleteFile();
        assertTrue(createFile.isFileNotExist());
    }
    @Test
    @DisplayName("Tao file MaxId")
    public void createMaxIdFile() throws IOException {
        CreateFile createFile = new CreateFile("datatest/maxTemporaryId.csv");
        createFile.createFile();
        assertTrue(createFile.isFileExist());
        DeleteFile deleteFile = new DeleteFile("datatest/maxTemporaryId.csv");
        deleteFile.deleteFile();
        assertFalse(deleteFile.isFileExist());
    }
}