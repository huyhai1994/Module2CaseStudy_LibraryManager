package regex;

public class RegexUserPhoneNumber implements Regex {
    public RegexUserPhoneNumber() {
        super();
    }

    @Override
    public void printGuideLine() {
        System.out.println("Hay nhap so dien thoai theo dang xx-xxxx-xxxx...");
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
    public void printMatch() {
        System.out.println("Ban da nhap dung...");
    }

    @Override
    public void printNotMatch() {
        System.out.println("Ban da nhap sai so dien thoai, vui long thu lai...");
        printGuideLine();
    }

}
