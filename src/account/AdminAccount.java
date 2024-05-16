package account;

import controller.RegexController;

import java.io.IOException;

public class AdminAccount extends AccountType {
    public AdminAccount() throws IOException {
        this.regexController = RegexController.createController();
    }

    @Override
    public void getUserChoiseAndCreateUserAccount() throws IOException {
        regexController.createAdminAccount();
    }
}
