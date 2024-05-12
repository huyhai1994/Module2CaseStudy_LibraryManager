package database;

import user.manageroperation.*;
import user.type.User;

import java.util.ArrayList;
import java.util.Collection;

import controller.Controller;


public class DataBase {
    public static int numberOfObjects = 0;
    private static DataBase dataBase;
    private ArrayList<User> users = new ArrayList<>();
    private Controller controller = Controller.createController();
    private UserManagerOperation[] usersManagerOperations;


    private DataBase() {
        usersManagerOperations = new UserManagerOperation[]{
                new Create(),
                new Read(),
                new Update(),
                new Delete()};
    }

    public static synchronized DataBase getInstance() {
        boolean isDataBaseObjectNotExist = numberOfObjects == 0;
        if (isDataBaseObjectNotExist) {
            numberOfObjects++;
            dataBase = new DataBase();
            return dataBase;
        }
        return dataBase;
    }

    public UserManagerOperation[] getUsersManagerOperation() {
        return this.usersManagerOperations;
    }

    public ArrayList<User> getUsers() {
        return this.users;
    }
}
