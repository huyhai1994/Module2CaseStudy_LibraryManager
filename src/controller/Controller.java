package controller;

import menu.Menu;
import regex.RegexUserChoise;

import static menu.Menu.ONE;
import static menu.Menu.TWO;

public class Controller {
    public static final int ZERO = 0;
    private RegexUserChoise regexUserChoise = new RegexUserChoise();
    private Menu menu = Menu.getInstance();

    private Controller() {

    }

    public static Controller createController() {
        return new Controller();
    }

    public void navigatingTheLogin(int userChoise) {
        if (regexUserChoise.isNotMatch(userChoise + "")) {
            regexUserChoise.printNotMatch();
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
       
    }

    private void newUser() {
    }
}
