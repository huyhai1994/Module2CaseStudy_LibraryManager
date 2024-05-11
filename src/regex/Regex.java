package regex;

public interface Regex {
    void printGuideLine();

    boolean isMatch(String inputString);

    boolean isNotMatch(String inputString);

    void printMatch();

    void printNotMatch();

}
