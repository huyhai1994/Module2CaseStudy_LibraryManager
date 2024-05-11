package controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {
    private static Controller controller;

    public static void main(String[] args) {
        int userChoise = -1;
        controller = Controller.createController();
        controller.navigatingTheLogin(userChoise);

    }


}