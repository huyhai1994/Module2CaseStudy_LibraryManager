package access;

import account.AccountType;
import account.AdminAccount;
import account.NormalAccount;
import controller.RegexController;
import menu.Menu;

import java.io.IOException;
import java.util.Scanner;

public class SignUp extends Access {
    private static Menu menu;
    private AccountType[] accountTypes;

    public SignUp() throws IOException {
        accountTypes = new AccountType[]{new AdminAccount(), new NormalAccount()};
    }

    public void operating() throws IOException {
        menu = Menu.getInstance();
        menu.printNewAdminOrNewNormalUser();
        Scanner scanner = menu.createNewScanner();
        int userChoiceIndex = scanner.nextInt();
        RegexController regexController = RegexController.createController();
        regexController.navigateBackToMenuIfRegexCheckFail(userChoiceIndex);
        createAccountDependOnUserChoice(userChoiceIndex);
    }

    public void createAccountDependOnUserChoice(int userChoiceIndex) throws IOException {
        accountTypes[userChoiceIndex - 1].getUserChoiseAndCreateUserAccount();
    }
}