package user.manageroperation;

import database.DataBase;
import iooperations.WriteUserFile;
import user.type.Admin;
import user.type.User;

import java.io.IOException;

public class Create extends UserManagerOperation {
    private String filePath = "data/admins.csv";
    private WriteUserFile writeUserFile = new WriteUserFile(filePath);

    public Create() throws IOException {
        database = DataBase.getInstance();
    }

    public void addAdmin(Admin admin) throws IOException {
        database = DataBase.getInstance();
        database.getAdmins().add(admin);
        writeUserFile.writeContentsToFile(database.getAdmins());
    }

}
