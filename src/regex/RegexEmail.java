package regex;

public class RegexEmail implements Regex {
    @Override
    public void printGuideLine() {
        System.out.println("Email nhap can phai nhap co theo dang 6->32 ki tu");
        System.out.println("Co the co ki tu dac biet [@,.,~ hay !] \n Noi tiep la @");
        System.out.println("Ket thuc bang ten domain Vd: gmail.com hay edu.vn");
    }

    @Override
    public boolean isMatch(String inputString) {
        String emailPattern = "^[A-Za-z0-9\\.~!]{6,32}+@+[a-zA-Z]{1,6}+(.)+[a-z]{2,3}$";
        return inputString.matches(emailPattern);
    }

    @Override
    public void printMatch() {
        System.out.println("ban da nhap dung...");
    }

    @Override
    public void printNotMatch() {
        System.out.println("Ban da nhap sai, vui long thu lai...");
        printGuideLine();
    }
}
