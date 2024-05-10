package regex;

public interface Regex {
    void printGuideLine();
    void pattern();
    boolean isMatch(String inputString);
    void printMatch();
    void printNotMatch();

}
