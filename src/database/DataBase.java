package database;

import user.manageroperation.*;
import user.type.Admin;
import user.type.User;

import java.io.IOException;
import java.util.ArrayList;

import controller.RegexController;


public class DataBase {
    public static int numberOfObjects = 0;
    private static DataBase dataBase;
    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<Admin> admins = new ArrayList<>();
    private RegexController regexController = RegexController.createController();
    private UserManagerOperation[] usersManagerOperations;

    private DataBase() throws IOException {
        usersManagerOperations = new UserManagerOperation[]{
                new Create(),
                new Read(),
                new Update(),
                new Delete()};
    }

    public static synchronized DataBase getInstance() throws IOException {
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

    public ArrayList<Admin> getAdmins() {
        return this.admins;
    }

    public ArrayList<User> getUsers() {
        return this.users;
    }
}
