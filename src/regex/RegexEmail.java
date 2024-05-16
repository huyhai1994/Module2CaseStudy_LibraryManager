package regex;

public class RegexEmail implements Regex {
    @Override
    public void printGuideLine() {
        System.out.println("> Email nhập cần phải có số kí tự từ 6 -> 32.");
        System.out.println("> Có thể có kĩ tự đặc biệt như [@,.,~ ] Nối tiếp là @");
        System.out.println("> Kết thúc bằng tên " +
                "domain Vd: gmail.com hay edu.vn");
    }

    @Override
    public boolean isMatch(String inputString) {
        String emailPattern = "^[A-Za-z0-9\\.~!]{6,32}+@+[a-zA-Z]{1,6}+(.)+[a-z]{2,3}$";
        return inputString.matches(emailPattern);
    }

    @Override
    public boolean isNotMatch(String inputString) {
        return !isMatch(inputString);
    }

    @Override
    public void printNotMatch() {
        System.out.println("Bạn đã nhập sai định dạng Email, Vui lòng đăng kí lại...");
        printGuideLine();
    }
}
