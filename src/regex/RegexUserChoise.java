package regex;

public class RegexUserChoise implements Regex {
    public RegexUserChoise() {

    }

    @Override
    public void printGuideLine() {
        System.out.println("Ban can nhap so 1 hoac 2...");
    }

    @Override
    public boolean isMatch(String inputString) {
        String userChoisePattern = "^(1|2)$";
        return inputString.matches(userChoisePattern);
    }

    @Override
    public void printMatch() {
        System.out.println("Ban da nhap dung...");
    }

    @Override
    public void printNotMatch() {
        System.out.println("Ban da nhap sai, vui long nhap lai...");
        printGuideLine();
    }

    @Override
    public boolean isNotMatch(String userChoise) {
        return !isMatch(userChoise);
    }
}
