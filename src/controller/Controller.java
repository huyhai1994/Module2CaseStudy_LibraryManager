package controller;

import access.Access;
import access.SignIn;
import access.SignUp;
import database.DataBase;
import menu.Menu;
import regex.RegexUserChoise;
import user.manageroperation.Create;
import user.manageroperation.UserManagerOperation;
import user.type.Admin;

public class Controller {
    public static final int SIGN_IN = 1;
    public static final int SIGN_UP = 2;
    private RegexUserChoise regexUserChoise = new RegexUserChoise();
    private Menu menu = Menu.getInstance();
    private DataBase dataBase = DataBase.getInstance();

    private Controller() {
    }

    public static Controller createController() {
        return new Controller();
    }

    public void navigatingTheUserAccess(int accessChoise) {
        navigateBackToMenuIfRegexCheckFail(accessChoise);
        Access[] access = {new SignIn(), new SignUp()};
        if (accessChoise == SIGN_IN)
            access[0].operating();
        else if (accessChoise == SIGN_UP)
            access[1].operating();
    }

    public boolean checkRegexNotMatch(int userChoise) {
        if (regexUserChoise.isNotMatch(userChoise + "")) {
            regexUserChoise.printNotMatch();
            return true;
        }
        return false;
    }

    public void createAdminAccount() {
        Admin admin = getAdmin();
        dataBase = DataBase.getInstance();
        dataBase.getUsersManagerOperation();
        UserManagerOperation[] usersManagerOperation = dataBase.getUsersManagerOperation();
        Create create;
        create = (Create) usersManagerOperation[0];
        create.addUser(admin);
        System.out.println("Tai khoan Admin tao thanh cong....");
        menu.printUserInfo();
    }

    private Admin getAdmin() {
        Admin admin = new Admin();
        menu = Menu.getInstance();
        admin.setName(menu.getUserNameAndPrintGuidelines());
        admin.setId(menu.getUserIdAndPrintGuidelines());
        return admin;
    }

    public void printUserInfo() {
        System.out.println(dataBase.getUsers());
    }

    private void navigateBackToMenuIfRegexCheckFail(int userChoiceIndex) {
        if (checkRegexNotMatch(userChoiceIndex)) {
            menu.run();
        }
    }
}
