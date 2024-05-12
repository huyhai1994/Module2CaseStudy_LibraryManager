package menu;

import controller.Controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static int numberOfObjects = 0;
    private static Menu menu;
    private Controller controller = Controller.createController();

    private Menu() {
    }

    public static synchronized Menu getInstance() {
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

    public String getUserNameAndPrintGuidelines() {
        Scanner scanner = createNewScanner();
        System.out.println("Ten dang nhap: ");
        return scanner.nextLine();
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

    public void printUserInfo() {
        System.out.println("Danh sach tai khoan: ");
        controller.printUserInfo();
    }

    public void printNewAdminOrNewNormalUser() {
        System.out.println("Ban muon tao tai khoan gi? ...");
        System.out.println("1. Tai khoan Admin \n2. Tai khoan Binh thuong: \n");

    }

    public void getUserInputAndNavigatingTheLogin() {
        printUserOptions();
        try {
            Scanner userInput = createNewScanner();
            Controller controller = Controller.createController();
            controller.navigatingTheUserAccess(userInput.nextInt());
        } catch (InputMismatchException e) {
            System.out.println("Ban da nhap sai vui long nhap lai...");
            menu.run();
            throw e;
        }
    }

    public void run() {
        printWelcome();
        getUserInputAndNavigatingTheLogin();
    }

    public Scanner createNewScanner() {
        return new Scanner(System.in);
    }
}