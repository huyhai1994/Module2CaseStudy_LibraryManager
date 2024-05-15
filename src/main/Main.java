package main;

import menu.Menu;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Menu.getInstance().run();
    }
}