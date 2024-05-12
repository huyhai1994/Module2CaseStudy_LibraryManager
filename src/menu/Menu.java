package menu;

import controller.Controller;

import java.util.Scanner;

public class Menu {
    public static int numberOfObjects = 0;
    private static Menu menu;

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

    public void printUserOptions() {
        System.out.println("1. Dang Nhap\n2. Tao tai khoan moi\n0. Thoat chuong trinh\n");
    }

    public void getUserInputAndNavigatingTheLogin() {
        printUserOptions();
        Scanner userInput = createNewScanner();
        Controller controller = Controller.createController();
        controller.navigatingTheLogin(userInput.nextInt());
    }

    public void run() {
        printWelcome();
        getUserInputAndNavigatingTheLogin();
    }

    public Scanner createNewScanner() {
        return new Scanner(System.in);
    }
}