package regex;

public class RegexUserChoise extends Regex{
    private final String UserChoisePattern = "[0-2]";
    public RegexUserChoise(){

    }
    @Override
    public void printIntro() {
        System.out.println("");
    }

    @Override
    public void pattern() {

    }
    @Override
    public boolean isMatch(String inputString) {
        return inputString.matches(UserChoisePattern);
    }

    @Override
    public void printMatch() {

    }

    @Override
    public void printNotMatch() {

    }
}
