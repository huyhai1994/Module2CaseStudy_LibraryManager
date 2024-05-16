package regex;

public class RegexUserChoise implements Regex {
    public RegexUserChoise() {

    }

    @Override
    public void printGuideLine() {
        System.out.println("Bạn cần nhập số 1 hoặc 2...");
    }

    @Override
    public boolean isMatch(String inputString) {
        String userChoisePattern = "^(1|2)$";
        return inputString.matches(userChoisePattern);
    }

    @Override
    public void printNotMatch() {
        System.out.println("Bạn đã nhập sai, vui lòng nhập lại...");
        printGuideLine();
    }

    @Override
    public boolean isNotMatch(String userChoise) {
        return !isMatch(userChoise);
    }
}
