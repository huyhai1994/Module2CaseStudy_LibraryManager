package user.manageroperation;

import database.DataBase;
import user.type.User;

public class Read extends UserManagerOperation {
    public Read() {
        database = DataBase.getInstance();
    }

    public void displayUsers() {
        database = DataBase.getInstance();
        for (User user : database.getUsers()) {
            System.out.println(user);
        }
    }
}
