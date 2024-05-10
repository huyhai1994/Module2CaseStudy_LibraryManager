package menu;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class MenuTest {
    private static Menu menu;
    @Test
    public void getNumberOfMenuObjectNotCreateMenu() {
        int expected = 1;
        int result = Menu.getNumberOfMenuObject();
        assertEquals(expected, result);
    }
    @Test
    public void createNewScanner(){
        menu = Menu.getInstance();
        Scanner result = menu.createNewScanner();
        assertNotNull(result);
    }
    @Test
    public void createAnMenuInstance() {
        int expected = 1;
        Menu.getInstance();
        int result = Menu.getNumberOfMenuObject();
        assertEquals(expected, result);
    }

    @Test
    public void createTwoInstanceOfMenu() {
        int expected = 1;
        Menu.getInstance();
        Menu.getInstance();
        int result = Menu.getNumberOfMenuObject();
        assertEquals(expected, result);
    }

    @Test
    public void getOptions() {
        int expected = 0;
        menu = Menu.getInstance();
        menu.setOptions(0);
        int result = menu.getOptions();
        assertEquals(expected, result);
    }
    @Test
    public void setOptions() {
        int expected = 0;
        menu = Menu.getInstance();
        int result = menu.setOptions(0);
        assertEquals(expected, result);
    }
    @Test
    public void isUserRegexMatch(){
        boolean expected = true;
        menu = Menu.getInstance();
        boolean result = menu.isUserRegexMatch();
        assertEquals(expected,result);
    }
    public static void main(String[] args) {
        menu = Menu.getInstance();
        menu.run();
    }
    //Xin chao tie
}