package iooperations;

import user.type.Admin;

import java.io.IOException;
import java.util.ArrayList;

public interface ReadFile {
    boolean isContentExist() throws IOException;

    ArrayList<Admin> readContentsFromFile() throws IOException;
}
