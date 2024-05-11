package menu;

import controller.Controller;
import regex.RegexUserChoise;

import java.util.Scanner;

public class Menu {
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int ZERO = 0;
    public static int numberOfMenuObject = 0;
    private static Menu menu;

    private Menu() {
    }

    public static synchronized Menu getInstance() {
        boolean isMenuObjectNotExist = numberOfMenuObject == 0;
        if (isMenuObjectNotExist) {
            numberOfMenuObject++;
            menu = new Menu();
            return menu;
        }
        return menu;
    }

    public void printWelcome() {
        System.out.println("\n--------Chao mung toi thu vien so---------\n");
    }


    public void printUserOptions() {
        System.out.println("1. Dang Nhap\n2. Tao tai khoan moi\n0. Thoat chuong trinh\n");
    }

    public void getUserInputAndNavigatingTheLogin() {
        printWelcome();
        printUserOptions();
        Scanner scanner = createNewScanner();
        Controller controller = Controller.createController();
        controller.navigatingTheLogin(scanner.nextInt());
    }

    public void run() {
        getUserInputAndNavigatingTheLogin();
    }

    public Scanner createNewScanner() {
        return new Scanner(System.in);
    }
}