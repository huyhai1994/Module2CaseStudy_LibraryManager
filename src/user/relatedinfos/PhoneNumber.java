package user.relatedinfos;

import regex.RegexPhoneNumber;

public class PhoneNumber implements UserRelatedInfos {
    private String data;
    public static final RegexPhoneNumber REGEX_PHONE_NUMBER = new RegexPhoneNumber();

    public PhoneNumber() {
    }

    public PhoneNumber(String inputData) {
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

    @Override
    public boolean isMatchRegex() {
        if (REGEX_PHONE_NUMBER.isMatch(this.data)) {
            return true;
        }
        return false;
    }
}
