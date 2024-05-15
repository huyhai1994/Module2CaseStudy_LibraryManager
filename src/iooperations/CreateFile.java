package iooperations;

import java.io.File;
import java.io.IOException;

public class CreateFile extends IOOperations {

    public CreateFile(String filePath) {
        this.filePath = filePath;
        this.file = new File(this.filePath);
    }

    public CreateFile() {
        this.file = new File(this.filePath);
    }

    public void createFile() throws IOException {
        if (isFileNotExist())
            this.file.createNewFile();
    }

    public boolean isFileExist() {
        return this.file.exists();
    }

    public boolean isFileNotExist() {
        return !this.file.exists();
    }

}
