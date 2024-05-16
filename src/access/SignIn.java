package access;

import menu.Menu;

import java.io.IOException;

public class SignIn extends Access {
    public SignIn() {
    }

    @Override
    public void operating() throws IOException {
        Menu menu = Menu.getInstance();
        menu.printTheOperationNotAvailable();
        menu.printNaviatingBackToMenu();
        menu.run();
    }
}
