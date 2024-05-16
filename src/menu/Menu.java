package menu;

import controller.RegexController;
import regex.RegexEmail;
import regex.RegexUserChoise;
import regex.RegexUserName;
import regex.RegexUserPhoneNumber;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static int numberOfObjects = 0;
    private static Menu menu;
    private RegexController regexController = RegexController.createController();
    private RegexEmail regexUserEmail = new RegexEmail();
    private RegexUserName regexUserName = new RegexUserName();
    private RegexUserPhoneNumber regexUserPhoneNumber = new RegexUserPhoneNumber();

    private Menu() throws IOException {
    }

    public static synchronized Menu getInstance() throws IOException {
        boolean isMenuObjectNotExist = numberOfObjects == 0;
        if (isMenuObjectNotExist) {
            numberOfObjects++;
            menu = new Menu();
            return menu;
        }
        return menu;
    }

    public void printWelcome() {
        System.out.println("\n-----------Chào Mừng Tới Thư Viện Số-----------\n");
        System.out.println("                <Menu chính>");
    }

    public String getUserNameAndPrintGuidelines() throws IOException {
        Scanner scanner = createNewScanner();
        System.out.println("Tên Đăng Nhập: ");
        regexUserName.printGuideLine();
        String userName = scanner.nextLine();
        regexController.navigateBackToMenuIfUserNameRegexCheckFail(userName);
        return userName;
    }

    public String getEmailAndPrintGuidelines() throws IOException {
        Scanner scanner = createNewScanner();
        System.out.println("Email Người Dùng: ");
        regexUserEmail.printGuideLine();
        String userEmail = scanner.nextLine();
        regexController.navigateBackToMenuIfUserEmailRegexCheckFail(userEmail);
        return userEmail;
    }

    public String getPhoneNumberAndPrintGuidelines() throws IOException {
        Scanner scanner = createNewScanner();
        System.out.println("Số điện thoại ");
        regexUserPhoneNumber.printGuideLine();
        String userPhoneNumber = scanner.nextLine();
        regexController.navigateBackToMenuIfRegexPhoneNumberCheckFail(userPhoneNumber);
        return userPhoneNumber;
    }

    public int getUserIdAndPrintGuidelines() {
        Scanner scanner = createNewScanner();
        System.out.println("Id người dùng[Dạng số  nguyên(VD. 1)]: ");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            printWrongInput();
            menu.run();
            throw e;
        }
    }

    private static void printWrongInput() {
        System.out.println("Bạn đã nhập sai, vui lòng nhập lại...");
    }

    public void printUserOptions() {
        System.out.println("1. Đăng " +
                "Nhập\n2. Tạo Tài Khoản " +
                "Mới\n");
    }

    public void printAdminsInformations() {
        printAccountSuccesfullyCreated();
        System.out.println("Danh Sách Tài " +
                "Khoản: ");
        printUsersListFormat();
        regexController.printAdminInformations();
    }

    public void printUsersListFormat() {
        System.out.println("id, tên đăng kí , email người dùng , số điện thoại , vai trò");
    }

    public void printAccountSuccesfullyCreated() {
        System.out.println("Tài Khoản đã được tạo thành công !");
    }

    public void printNewAdminOrNewNormalUser() {
        System.out.println("Bạn muốn tạo tài khoản gì ? ...");
        System.out.println("1. Admin \n2. Bình Thường: \n");
    }

    public void getUserInputAndNavigatingTheUserAccess() {
        printUserOptions();
        try {
            Scanner userInput = createNewScanner();
            RegexController regexController = RegexController.createController();
            regexController.navigatingTheUserAccess(userInput.nextInt());
        } catch (InputMismatchException e) {
            printWrongInput();
            menu.run();
            throw e;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void run() {
        printWelcome();
        getUserInputAndNavigatingTheUserAccess();
    }

    public Scanner createNewScanner() {
        return new Scanner(System.in);
    }

    public void printTheOperationNotAvailable() {
        System.out.println("Tính năng chưa cập nhật");
    }

    public void printNaviatingBackToMenu() {
        System.out.println("Điều hướng quay lại menu");
    }
}