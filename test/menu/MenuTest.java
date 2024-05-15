package menu;

import org.junit.jupiter.api.Test;

import java.io.IOException;
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
    void createNewScanner() throws IOException {
        menu = Menu.getInstance();
        Scanner result = menu.createNewScanner();
        assertNotNull(result);
    }

    @Test
    void createAnMenuInstance() throws IOException {
        int expected = 1;
        Menu.getInstance();
        int result = Menu.numberOfObjects;
        assertEquals(expected, result);
    }

    @Test
    void createTwoInstanceOfMenu() throws IOException {
        int expected = 1;
        Menu.getInstance();
        Menu.getInstance();
        int result = Menu.numberOfObjects;
        assertEquals(expected, result);
    }

    public static void main(String[] args) throws IOException {
        while (true) {
            menu = Menu.getInstance();
            menu.run();
        }
    }
}