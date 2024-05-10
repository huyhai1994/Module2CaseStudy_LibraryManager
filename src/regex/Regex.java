package regex;

public abstract class  Regex {
    protected Regex(){
    }
    public abstract void printIntro();
    public abstract void pattern();
    public abstract boolean isMatch(String inputString);
    public abstract void printMatch();
    public abstract void printNotMatch();

}
