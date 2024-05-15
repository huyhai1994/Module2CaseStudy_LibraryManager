package user.manageroperation;

import database.DataBase;
import org.junit.jupiter.api.Test;
import user.type.Admin;
import user.type.User;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ReadTest {
    @Test
    void displayUsers() throws IOException {
        Read read = new Read();
        read.displayUsers();
    }

    @Test
    void addOneUser() throws IOException {
        DataBase dataBase = DataBase.getInstance();
        Admin admin = new Admin();
        UserManagerOperation[] usersManager = dataBase.getUsersManagerOperation();
        Create create;
        create = (Create) usersManager[0];
        create.addAdmin(admin);
        int expected = 1;
        int result = dataBase.getUsers().size();
        assertEquals(expected, result);
    }


    public static void main(String[] args) throws IOException {
        /*
        DataBase dataBase = DataBase.getInstance();
        User admin = new Admin(1, "CodeGymHN");
        User admin2 = new Admin(2, "CodeGymDN");
        User admin3 = new Admin(3, "CodeGymHCM");
        UserManagerOperation[] manager = dataBase.getUsersManagerOperation();
        Create create = (Create) manager[0];
        create.addAdmin(admin);
        create.addAdmin(admin2);
        create.addAdmin(admin3);
        Read read = (Read) manager[1];
        read.displayUsers();
        System.out.println("So nguoi dung dang co ..." + dataBase.getUsers().size());
    */
    }


}