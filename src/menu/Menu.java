package menu;

import regex.RegexUserChoise;

import java.util.Scanner;

public class Menu {
    public static final int ONE = 1;
    public static final int TWO = 2;
    private static int numberOfMenuObject = 0;
    private static Menu menu;
    private int options;
    private Scanner scanner;
    private RegexUserChoise regexUserChoise;

    private  Menu(){
    }
    public static synchronized Menu getInstance(){
        boolean isMenuObjectNotExist = numberOfMenuObject ==0;
       if (isMenuObjectNotExist){
           numberOfMenuObject++;
           menu = new Menu();
           return menu;
       }
    return  menu;
    }

    public static int getNumberOfMenuObject() {
        return numberOfMenuObject;
    }

  public void printWelcome(){
      System.out.println("\n--------Chao mung toi thu vien so---------\n");
  }


    public void printUserOptions(){
        System.out.println("1. Dang Nhap\n2. Tao tai khoan moi\n0. Thoat chuong trinh\n");
    }

    public int getOptions() {
        return options;
    }
    public int setOptions(int userChoice) {
        this.options = userChoice;
        return options;
    }

    public void run() {
        scanner = createNewScanner();
        int userChoice = scanner.nextInt();
        setOptions(userChoice);
        switch (getOptions())
        {
            case ONE:
                login();
                break;
            case TWO:
                newUser();
                break;
        }
    }
    public boolean isUserRegexMatch(){
        return false;
    }
    public Scanner createNewScanner(){
        return new Scanner(System.in);
    }
    private void newUser() {
        System.out.println("New user here...");
    }

    private void login() {
        System.out.println("New login here...");
    }
}
