package regex;

public class RegexPhoneNumber implements Regex {
    public RegexPhoneNumber() {
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
        return false;
    }

    @Override
    public void printMatch() {
        System.out.println("Ban da nhap dung...");
    }

    @Override
    public void printNotMatch() {
        System.out.println("Ban da nhap sai, vui long thu lai...");
        printGuideLine();
    }

}
