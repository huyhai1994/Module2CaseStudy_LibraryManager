package account;

import controller.RegexController;

import java.io.IOException;

public class NormalAccount extends AccountType {
    public NormalAccount() throws IOException {
        regexController = RegexController.createController();
    }

    @Override
    public void getUserChoiseAndCreateUserAccount() throws IOException {
        regexController.createNormalAccount();
    }
}
