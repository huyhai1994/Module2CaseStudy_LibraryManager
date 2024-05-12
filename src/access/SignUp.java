package access;

import controller.Controller;
import menu.Menu;

import java.util.Scanner;

public class SignUp extends Access {
    private static Menu menu;
    private static final int ONE = 1;
    private static final int TWO = 2;

    public SignUp() {
    }

    public void operating() {
        menu = Menu.getInstance();
        menu.printNewAdminOrNewNormalUser();
        Scanner scanner = menu.createNewScanner();
        int userChoiceIndex = scanner.nextInt();
        navigateBackToMenuIfRegexCheckFail(userChoiceIndex);
        switch (userChoiceIndex) {
            case ONE:
                Controller controller = Controller.createController();
                controller.createAdminAccount();
                break;
            case TWO:
                throw new UnsupportedOperationException("Tinh Nang Tao Tai Khoan Chua Cap Nhat...");
            default:
                menu.run();
        }

    }

    private void navigateBackToMenuIfRegexCheckFail(int userChoiceIndex) {
        Controller controller = Controller.createController();
        if (controller.checkRegexNotMatch(userChoiceIndex)) {
            menu.run();
        }
    }

}
