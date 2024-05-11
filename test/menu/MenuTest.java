package menu;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class MenuTest {
    private static Menu menu;

    @Test
    void getNumberOfMenuObjectNotCreateMenu() {
        int expected = 1;
        int result = Menu.getNumberOfMenuObject();
        assertEquals(expected, result);
    }

    @Test
    void createNewScanner() {
        menu = Menu.getInstance();
        Scanner result = menu.createNewScanner();
        assertNotNull(result);
    }

    @Test
    void createAnMenuInstance() {
        int expected = 1;
        Menu.getInstance();
        int result = Menu.getNumberOfMenuObject();
        assertEquals(expected, result);
    }

    @Test
    void createTwoInstanceOfMenu() {
        int expected = 1;
        Menu.getInstance();
        Menu.getInstance();
        int result = Menu.getNumberOfMenuObject();
        assertEquals(expected, result);
    }

    @Test
    void getOptions() {
        int expected = 0;
        menu = Menu.getInstance();
        menu.setOptions(0);
        int result = menu.getOptions();
        assertEquals(expected, result);
    }

    @Test
    void setOptions() {
        int expected = 0;
        menu = Menu.getInstance();
        int result = menu.setOptions(0);
        assertEquals(expected, result);
    }

    @Test
    void isUserRegexNotMatch() {
        menu = Menu.getInstance();
        assertTrue(menu.isUserRegexNotMatch(-1));
    }


    public static void main(String[] args) {
        while (true) {
            menu = Menu.getInstance();
            menu.run();
        }
    }
}