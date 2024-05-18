package iooperations;

import user.type.Admin;

import java.io.*;
import java.util.ArrayList;

/**
 * ReadUserFile class extends IOOperations and implements ReadFile interface.
 * It is reponsible for reading contents from a file and populating an ArrayList of Admin objects.
 */

/**
 * Default constructor that initializes the file reader and buffered reader.
 *
 * @throws IOException if an I/O error occurs
 */
public class ReadUserFile extends IOOperations implements ReadFile {
    private FileReader fileReader;
    private BufferedReader bufferedReader;
    private ArrayList<Admin> admins;

    public ReadUserFile() throws IOException {
        this.file = new File(this.filePath);
        this.fileReader = new FileReader(this.file);
        this.bufferedReader = new BufferedReader(this.fileReader);
    }

    /**
     * Constructor that takes a file path as a parameter and initializes the file reader and buffered reader.
     *
     * @param filePath the path of the file to be read
     * @throws FileNotFoundException if the specified file does not exist
     */
    public ReadUserFile(String filePath) throws FileNotFoundException {
        this.filePath = filePath;
        this.file = new File(filePath);
        this.fileReader = new FileReader(this.file);
        this.bufferedReader = new BufferedReader(this.fileReader);
    }

    /**
     * Checks if the file has content.
     *
     * @return true if the file has content, false otherwise
     * @throws IOException if an I/O error occurs
     */
    public boolean isContentExist() throws IOException {
        return !(this.bufferedReader.readLine() == null);
    }

    /**
     * Reads contents from the file and populates an ArrayList of Admin objects.
     *
     * @return an ArrayList of Admin objects
     * @throws IOException if an I/O error occurs
     */
    public ArrayList<Admin> readContentsFromFile() throws IOException {
        admins = new ArrayList<>();
        this.fileReader = new FileReader(this.file);
        this.bufferedReader = new BufferedReader(this.fileReader);
        String content;
        while ((content = bufferedReader.readLine()) != null) {
            String[] data = content.split(",");
            int id = Integer.parseInt(data[0]);
            String name = data[1];
            String email = data[2];
            String phoneNumber = data[3];
            Admin admin = new Admin(id, name);
            admin.setEmail(email);
            admin.setPhoneNumber(phoneNumber);
            admins.add(admin);
        }
        bufferedReader.close();
        return admins;
    }


}
