package controller;

import database.DataBase;
import menu.Menu;
import regex.RegexUserChoise;

public class Controller {
    public static final int ZERO = 0;
    public static final int ONE = 1;
    public static final int TWO = 2;
    private final RegexUserChoise REGEX_USER_CHOISE = new RegexUserChoise();
    private Menu menu = Menu.getInstance();
    private DataBase dataBase = DataBase.getInstance();

    private Controller() {

    }

    public static Controller createController() {
        return new Controller();
    }

    public void navigatingTheLogin(int userChoise) {
        if (REGEX_USER_CHOISE.isNotMatch(userChoise + "")) {
            REGEX_USER_CHOISE.printNotMatch();
            menu.run();
        }
        switch (userChoise) {
            case ONE:
                login();
                break;
            case TWO:
                newUser();
                break;
            case ZERO:
                throw new RuntimeException("Da thoat chuong trinh...");
        }
    }

    private void login() {
        menu.run();
        throw new UnsupportedOperationException("Tinh Nang Dang Nhap Chua Cap Nhat...");
    }

    private void newUser() {
        dataBase = DataBase.getInstance();
        dataBase.getUsersManagerOperation();
        menu = Menu.getInstance();
        menu.printNewAdminOrNewNormalUser();
    }

}
