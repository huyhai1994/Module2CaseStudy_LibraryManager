package user.relatedinfos;

import regex.RegexEmail;

public class Email implements UserRelatedInfos {

    private String data;
    private static final RegexEmail REGEX_EMAIL = new RegexEmail();

    public Email() {

    }

    public Email(String inputData) {
        this.data = inputData;
    }

    @Override
    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String getData() {
        return this.data;
    }

    public boolean isMatchRegex() {
        if (REGEX_EMAIL.isMatch(this.data))
            return true;
        return false;
    }
}
