package controller;

import database.DataBase;
import menu.Menu;
import regex.RegexUserChoise;
import user.manageroperation.Create;
import user.manageroperation.UserManagerOperation;
import user.type.Admin;

import java.util.Scanner;

public class Controller {
    public static final int ONE = 1;
    public static final int TWO = 2;
    private RegexUserChoise regexUserChoise = new RegexUserChoise();
    private Menu menu = Menu.getInstance();
    private DataBase dataBase = DataBase.getInstance();

    private Controller() {
    }

    public static Controller createController() {
        return new Controller();
    }

    public void navigatingTheLogin(int userChoise) {
        navigateBackToMenuIfRegexCheckFail(userChoise);
        switch (userChoise) {
            case ONE:
                throw new UnsupportedOperationException("Tinh nang login chua cap nhat..");
            case TWO:
                newUser();
                break;
            default:
                menu.run();
        }
    }

    public boolean checkRegexNotMatch(int userChoise) {
        if (regexUserChoise.isNotMatch(userChoise + "")) {
            regexUserChoise.printNotMatch();
            return true;
        }
        return false;
    }

    private void newUser() {
        menu = Menu.getInstance();
        menu.printNewAdminOrNewNormalUser();
        Scanner scanner = menu.createNewScanner();
        int userChoiceIndex = scanner.nextInt();
        navigateBackToMenuIfRegexCheckFail(userChoiceIndex);
        switch (userChoiceIndex) {
            case ONE:
                createAdminAccount();
                break;
            case TWO:
                throw new UnsupportedOperationException("Tinh Nang Tao Tai Khoan Chua Cap Nhat...");
            default:
                menu.run();
        }
    }

    private void createAdminAccount() {
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
