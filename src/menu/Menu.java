package menu;

import controller.RegexController;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static int numberOfObjects = 0;
    private static Menu menu;
    private RegexController regexController = RegexController.createController();

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
        System.out.println("\n--------Chao mung toi thu vien so---------\n");
    }

    public String getUserNameAndPrintGuidelines() throws IOException {
        Scanner scanner = createNewScanner();
        System.out.println("Ten dang nhap: ");
        String userName = scanner.nextLine();
        regexController.navigateBackToMenuIfUserNameRegexCheckFail(userName);
        return userName;
    }

    public String getEmailAndPrintGuidelines() throws IOException {
        Scanner scanner = createNewScanner();
        System.out.println("Email Nguoi Dung: ");
        String userEmail = scanner.nextLine();
        regexController.navigateBackToMenuIfUserEmailRegexCheckFail(userEmail);
        return userEmail;
    }

    public String getPhoneNumberAndPrintGuidelines() throws IOException {
        Scanner scanner = createNewScanner();
        System.out.println("So Dien Thoai: ");
        String userPhoneNumber = scanner.nextLine();
        regexController.navigateBackToMenuIfRegexPhoneNumberCheckFail(userPhoneNumber);
        return userPhoneNumber;
    }

    public int getUserIdAndPrintGuidelines() {
        Scanner scanner = createNewScanner();
        System.out.println("Id nguoi dung[Nhap dang so nguyen (VD. 1)]: ");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Ban da nhap sai vui long nhap lai...");
            menu.run();
            throw e;
        }
    }

    public void printUserOptions() {
        System.out.println("1. Dang Nhap\n2. Tao tai khoan moi\n");
    }

    public void printAdminsInformations() {
        printAccountSuccesfullyCreated();
        System.out.println("Danh sach tai khoan: ");
        regexController.printAdminInformations();
    }

    public void printAccountSuccesfullyCreated() {
        System.out.println("Tai khoan da duoc tao thanh cong!");
    }

    public void printNewAdminOrNewNormalUser() {
        System.out.println("Ban muon tao tai khoan gi? ...");
        System.out.println("1. Tai khoan Admin \n2. Tai khoan Binh thuong: \n");
    }

    public void getUserInputAndNavigatingTheUserAccess() {
        printUserOptions();
        try {
            Scanner userInput = createNewScanner();
            RegexController regexController = RegexController.createController();
            regexController.navigatingTheUserAccess(userInput.nextInt());
        } catch (InputMismatchException e) {
            System.out.println("Ban da nhap sai vui long nhap lai...");
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

}