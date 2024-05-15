package iooperations;

import user.type.Admin;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteUserFile extends IOOperations implements WriteFile {
    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;
    private CreateFile createFile;

    public WriteUserFile(String filePath) throws IOException {
        this.filePath = filePath;
        this.file = new File(this.filePath);
        this.createFile = new CreateFile(this.filePath);
        this.createFile.createFile();
    }

    public WriteUserFile() throws IOException {
        this.file = new File(this.filePath);
        this.createFile = new CreateFile(this.filePath);
        this.createFile.createFile();
    }

    @Override
    public void writeContentsToFile(String contents) {
        try {
            this.fileWriter = new FileWriter(this.file);
            this.bufferedWriter = new BufferedWriter(this.fileWriter);
            this.bufferedWriter.write(contents);
            this.bufferedWriter.close();
            this.fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void writeContentsToFile(ArrayList<Admin> admins) {
        try {
            this.fileWriter = new FileWriter(this.file);
            this.bufferedWriter = new BufferedWriter(this.fileWriter);
            for (Admin admin : admins) {
                this.bufferedWriter.write(admin.toString());
                this.bufferedWriter.newLine();
            }
            this.bufferedWriter.close();
            this.fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isFileExist() {
        return this.file.exists();
    }

}
