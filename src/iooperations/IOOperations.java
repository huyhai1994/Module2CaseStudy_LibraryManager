package iooperations;

import java.io.File;

/**
 * Abstract class for IO operations.
 */
public abstract class IOOperations {

    /**
     * The default file path for operations.
     */
    public String filePath = "data/default.csv";

    /**
     * The File object representing the file for operations.
     */
    public File file;

    /**
     * Constructor for IOOperations.
     * <p>
     * Initializes the File object with the default file path.
     */
    public IOOperations() {
        this.file = new File(filePath);
    }

    /**
     * Getter for the file path.
     *
     * @return The file path.
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * Setter for the file path.
     *
     * @param filePath The new file path.
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
        this.file = new File(filePath);
    }
}