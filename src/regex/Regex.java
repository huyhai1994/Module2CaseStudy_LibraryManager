package regex;

public interface   Regex {
    void printIntro();
    void pattern();
    boolean isMatch(String inputString);
    void printMatch();
    void printNotMatch();

}
