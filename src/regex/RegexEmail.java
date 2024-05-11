package regex;

public class RegexEmail implements Regex {
    @Override
    public void printGuideLine() {

    }

    @Override
    public void pattern() {

    }

    @Override
    public boolean isMatch(String inputString) {
        String emailPattern = "^[a-zA-Z0-9]{6,32}$";
        return inputString.matches(emailPattern);
    }

    @Override
    public void printMatch() {

    }

    @Override
    public void printNotMatch() {

    }
}
