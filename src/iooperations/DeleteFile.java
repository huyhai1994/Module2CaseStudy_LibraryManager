package iooperations;

import java.io.File;

public class DeleteFile extends IOOperations {
    public DeleteFile(String filePath) {
        this.filePath = filePath;
        this.file = new File(this.filePath);
    }

    public DeleteFile() {
        this.file = new File(this.filePath);
    }

    public void deleteFile() {
        if (isFileExist()) {
            this.file.delete();
        }
    }

    public boolean isFileExist() {
        return this.file.exists();
    }
}
