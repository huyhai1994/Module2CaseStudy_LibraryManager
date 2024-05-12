package user.manageroperation;

import database.DataBase;
import org.junit.jupiter.api.Test;
import user.type.Admin;

import static org.junit.jupiter.api.Assertions.*;

class CreateTest {
    @Test
    void addAdmin() {
        Admin admin = new Admin();
        DataBase dataBase = DataBase.getInstance();
    }

}