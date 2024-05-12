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
        int result = Menu.numberOfObjects;
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
        int result = Menu.numberOfObjects;
        assertEquals(expected, result);
    }

    @Test
    void createTwoInstanceOfMenu() {
        int expected = 1;
        Menu.getInstance();
        Menu.getInstance();
        int result = Menu.numberOfObjects;
        assertEquals(expected, result);
    }

    public static void main(String[] args) {
        while (true) {
            menu = Menu.getInstance();
            menu.run();
        }
    }
}