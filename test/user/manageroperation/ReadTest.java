package user.manageroperation;

import database.DataBase;
import org.junit.jupiter.api.Test;
import user.type.Admin;
import user.type.User;

import static org.junit.jupiter.api.Assertions.*;

class ReadTest {
    @Test
    void displayUsers() {
        Read read = new Read();
        read.displayUsers();
    }

    public static void main(String[] args) {
        DataBase dataBase = DataBase.getInstance();
        String username = "CodeGymHN";
        int userId = 1;
        User admin = new Admin(username, userId);
        User admin2 = new Admin("CodeGymDN", 2);
        UserManagerOperation[] manager = dataBase.getUsersManagerOperation();
        Create create = (Create) manager[0];
        create.addUser(admin);
        create.addUser(admin2);
        Read read = (Read) manager[1];
        read.displayUsers();
    }


}