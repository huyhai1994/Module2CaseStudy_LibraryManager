package controller;

import access.Access;
import access.SignIn;
import access.SignUp;
import database.DataBase;
import menu.Menu;
import regex.RegexEmail;
import regex.RegexUserPhoneNumber;
import regex.RegexUserChoise;
import regex.RegexUserName;
import user.manageroperation.Create;
import user.manageroperation.UserManagerOperation;
import user.type.Admin;

import java.io.IOException;

public class RegexController {
    private RegexUserChoise regexUserChoise = new RegexUserChoise();
    private RegexUserName regexUserName = new RegexUserName();
    private RegexUserPhoneNumber regexUserPhoneNumber = new RegexUserPhoneNumber();
    private RegexEmail regexUserEmail = new RegexEmail();
    private Menu menu = Menu.getInstance();
    private DataBase dataBase = DataBase.getInstance();

    private RegexController() throws IOException {
    }

    public static RegexController createController() throws IOException {
        return new RegexController();
    }

    public void navigatingTheUserAccess(int accessChoise) throws IOException {
        navigateBackToMenuIfRegexCheckFail(accessChoise);
        Access[] access = {new SignIn(), new SignUp()};
        access[accessChoise - 1].operating();
    }

    public void createAdminAccount() throws IOException {
        Admin admin = getAnAdminInformationsFromMenu();
        dataBase = DataBase.getInstance();
        dataBase.getUsersManagerOperation();
        UserManagerOperation[] usersManagerOperation = dataBase.getUsersManagerOperation();
        createAndWriteAdminDataToFile(usersManagerOperation, admin);
    }

    private void createAndWriteAdminDataToFile(UserManagerOperation[] usersManagerOperation, Admin admin) throws IOException {
        Create create;
        create = (Create) usersManagerOperation[0];
        create.addAdmin(admin);
        menu.printAdminsInformations();
    }

    private Admin getAnAdminInformationsFromMenu() throws IOException {
        Admin admin = new Admin();
        menu = Menu.getInstance();
        admin.setId(menu.getUserIdAndPrintGuidelines());
        admin.setName(menu.getUserNameAndPrintGuidelines());
        admin.setEmail(menu.getEmailAndPrintGuidelines());
        admin.setPhoneNumber(menu.getPhoneNumberAndPrintGuidelines());
        return admin;
    }

    public void navigateBackToMenuIfRegexCheckFail(int userChoiceIndex) {
        if (checkRegexUserChoiseNotMatch(userChoiceIndex)) {
            menu.run();
        }
    }

    public boolean checkRegexUserChoiseNotMatch(int userChoise) {
        if (regexUserChoise.isNotMatch(userChoise + "")) {
            regexUserChoise.printNotMatch();
            return true;
        }
        return false;
    }

    public void navigateBackToMenuIfUserNameRegexCheckFail(String inputUserName) throws IOException {
        if (checkRegexUserNameNotMatch(inputUserName)) {
            menu = Menu.getInstance();
            //menu.run();
            //createAdminAccount();
            getAnAdminInformationsFromMenu();
        }
    }


    public boolean checkRegexUserNameNotMatch(String inputUserName) {
        if (regexUserName.isNotMatch(inputUserName)) {
            regexUserName.printNotMatch();
            return true;
        }
        return false;
    }

    public boolean checkUserPhoneNumberNotMatch(String inputPhoneNumber) {
        if (regexUserPhoneNumber.isNotMatch(inputPhoneNumber)) {
            regexUserPhoneNumber.printNotMatch();
            return true;
        }
        return false;
    }

    public void navigateBackToMenuIfUserEmailRegexCheckFail(String userEmailNeedtoCheckRegex) throws IOException {
        if (checkUserEmailNotMatch(userEmailNeedtoCheckRegex)) {
            menu = Menu.getInstance();
            menu.run();
        }
    }

    public boolean checkUserEmailNotMatch(String inputEmail) {
        if (regexUserEmail.isNotMatch(inputEmail)) {
            regexUserEmail.printNotMatch();
            return true;
        }
        return false;
    }

    public void printAdminInformations() {
        for (Admin admin : dataBase.getAdmins()) {
            System.out.println(admin);
        }
    }


    public void navigateBackToMenuIfRegexPhoneNumberCheckFail(String userPhoneNumber) throws IOException {
        if (checkUserPhoneNumberNotMatch(userPhoneNumber)) {
            menu = Menu.getInstance();
            menu.run();
        }
    }
}
