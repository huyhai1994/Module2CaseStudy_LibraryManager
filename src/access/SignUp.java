package access;

import controller.RegexController;
import menu.Menu;

import java.io.IOException;
import java.util.Scanner;

public class SignUp extends Access {
    private static Menu menu;
    private static final int ONE = 1;
    private static final int TWO = 2;

    public SignUp() {
    }

    public void operating() throws IOException {
        menu = Menu.getInstance();
        menu.printNewAdminOrNewNormalUser();
        Scanner scanner = menu.createNewScanner();
        int userChoiceIndex = scanner.nextInt();
        RegexController regexController = RegexController.createController();
        regexController.navigateBackToMenuIfRegexCheckFail(userChoiceIndex);
        createAccountDependOnUserChoise(userChoiceIndex, regexController);
    }

    private static void createAccountDependOnUserChoise(int userChoiceIndex, RegexController regexController) throws IOException {
        switch (userChoiceIndex) {
            case ONE:
                regexController.createAdminAccount();
                break;
            case TWO:
                throw new UnsupportedOperationException("Tinh Nang Tao Tai Khoan Chua Cap Nhat...");
            default:
                menu.run();
        }
    }
}
