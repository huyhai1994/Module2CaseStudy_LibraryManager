package iooperations;

import user.type.Admin;

import java.util.ArrayList;

public interface WriteFile {
    
    void writeContentsToFile(String contents);

    void writeContentsToFile(ArrayList<Admin> admins);

    boolean isFileExist();
}
