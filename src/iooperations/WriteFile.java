package iooperations;

import user.type.Admin;
import user.type.User;

import java.util.ArrayList;

public interface WriteFile {
    
    void writeContentsToFile(String contents);

    void writeContentsToFile(ArrayList<Admin> admins);

    boolean isFileExist();
}
