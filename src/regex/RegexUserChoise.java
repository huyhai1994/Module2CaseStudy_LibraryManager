package regex;

public class RegexUserChoise implements Regex {
    public RegexUserChoise() {

    }

    @Override
    public void printGuideLine() {
        System.out.println("Ban can nhap so 0,1 va 2...");
    }

    @Override
    public boolean isMatch(String inputString) {
        String userChoisePattern = "[0-2]";
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

    public boolean isNotMatch(String userChoise) {
        return !isMatch(userChoise);
    }
}
