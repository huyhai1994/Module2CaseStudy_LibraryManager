package account;

import controller.RegexController;

import java.io.IOException;

public abstract class AccountType {
    protected RegexController regexController;

    public AccountType() {

    }

    public abstract void getUserChoiseAndCreateUserAccount() throws IOException;
}
