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
        String emailPattern = "^[A-Za-z0-9\\.~!]{6,32}+@+[a-zA-Z]{1,6}+(.)+[a-z]{2,3}$";
        return inputString.matches(emailPattern);
    }

    @Override
    public void printMatch() {

    }

    @Override
    public void printNotMatch() {

    }
}
