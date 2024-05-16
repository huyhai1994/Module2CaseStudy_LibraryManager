package regex;

public class RegexUserPhoneNumber implements Regex {
    public RegexUserPhoneNumber() {
        super();
    }

    @Override
    public void printGuideLine() {
        System.out.println("Hãy nhập số điện thoại theo dạng xx-xxxx-xxxx (Trong đó x là số nguyên)");
    }

    @Override
    public boolean isMatch(String inputString) {
        String phoneNumberPattern = "[0-9]{2}-[0-9]{4}-[0-9]{4}";
        return inputString.matches(phoneNumberPattern);
    }

    @Override
    public boolean isNotMatch(String inputString) {
        return !isMatch(inputString);
    }

    @Override
    public void printNotMatch() {
        System.out.println("Bạn đã nhập sai định dạng, vui lòng đăng kí lại...");
        printGuideLine();
    }

}
