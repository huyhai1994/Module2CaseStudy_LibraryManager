package regex;

public class RegexUserChoise implements Regex {
    public RegexUserChoise() {

    }

    @Override
    public void printGuideLine() {
        System.out.println("");
    }

    @Override
    public void pattern() {

    }

    @Override
    public boolean isMatch(String inputString) {
        String userChoisePattern = "[0-2]";
        return inputString.matches(userChoisePattern);
    }

    @Override
    public void printMatch() {

    }

    @Override
    public void printNotMatch() {

    }
}
