package user.manageroperation;

import database.DataBase;
import user.type.User;

public class Create extends UserManagerOperation {
    public Create() {
        database = DataBase.getInstance();
    }

    public void addUser(User user) {
        database = DataBase.getInstance();
        database.getUsers().add(user);
    }

}
