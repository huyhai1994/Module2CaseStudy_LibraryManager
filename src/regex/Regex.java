package regex;

public interface Regex {
    void printGuideLine();

    boolean isMatch(String inputString);

    void printMatch();

    void printNotMatch();

}
