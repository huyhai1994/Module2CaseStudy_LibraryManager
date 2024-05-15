package user.manageroperation;

import database.DataBase;
import user.type.User;

import java.io.IOException;

public class Read extends UserManagerOperation {
    public Read() throws IOException {
        database = DataBase.getInstance();
    }

    public void displayUsers() throws IOException {
        database = DataBase.getInstance();
        for (User user : database.getUsers()) {
            System.out.println(user);
        }
    }
}
