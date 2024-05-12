package controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {
    private static Controller controller;

    @Test
    void checkRegexNotMatch_Pass() {
        controller = Controller.createController();
        assertTrue(controller.checkRegexNotMatch(-1));
    }

    @Test
    void checkRegexNotMatch_FailWithInput1() {
        controller = Controller.createController();
        assertFalse(controller.checkRegexNotMatch(1));
    }

    @Test
    void checkRegexNotMatch_FailWithInput2() {
        controller = Controller.createController();
        assertFalse(controller.checkRegexNotMatch(2));
    }

    public static void main(String[] args) {
        int userChoise = -1;
        controller = Controller.createController();
        controller.navigatingTheLogin(userChoise);
    }
}