package controller;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import user.type.Admin;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {
    private static Controller controller;

    @Test
    void checkRegexNotMatch_FalseWithInput1() {
        controller = Controller.createController();
        assertFalse(controller.checkRegexNotMatch(1));
    }

    @Test
    void checkRegexNotMatch_FalseWithInput2() {
        controller = Controller.createController();
        assertFalse(controller.checkRegexNotMatch(2));
    }

    @Test
    void checkRegexNotMatch_TrueWithInput3() {
        controller = Controller.createController();
        assertTrue(controller.checkRegexNotMatch(3));
    }

    @Test
    void checkRegexNotMatch_TrueWithInput4() {
        controller = Controller.createController();
        assertTrue(controller.checkRegexNotMatch(4));
    }

    @Test
    void checkRegexNotMatch_TrueWithInputMinus() {
        controller = Controller.createController();
        assertTrue(controller.checkRegexNotMatch(-1));
        assertTrue(controller.checkRegexNotMatch(-2));
        assertTrue(controller.checkRegexNotMatch(-3));
    }

    @Test
    void checkRegexNotMatch_TrueWithInputZero() {
        controller = Controller.createController();
        assertTrue(controller.checkRegexNotMatch(0));
    }

    @Test
    void getAdmin() {
        Admin admin = new Admin();
        controller = Controller.createController();
        admin.setName("test");
        admin.setId(123);
        assertEquals("test", admin.getName());
    }

    public static void main(String[] args) {
        int userChoose = 2;
        controller = Controller.createController();
        controller.navigatingTheUserAccess(userChoose);
    }
}