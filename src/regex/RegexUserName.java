package regex;

/*Kiem tra xem Ten nguoi dung nhap vao co tu 6 -> 20 ki tu
 * Va loai bo truong hop nhap ki tu dac biet
 * Ten nguoi dung co the duoc nhap chu thuong hoac in hoa*/

public class RegexUserName implements Regex {
    @Override
    public void printGuideLine() {
        System.out.println("> Ban can nhap chu cai tu 6 den 20 ki tu");
        System.out.println("> Co the nhap chu cai in thuong hoac in hoa");
        System.out.println("> Co the nhap so ");
        System.out.println("> Khong duoc nhap ki tu dac biet");
    }

    @Override
    public boolean isMatch(String inputString) {
        String userNamePattern = "^[A-Za-z0-9]{6,20}$";
        return inputString.matches(userNamePattern);
    }

    @Override
    public boolean isNotMatch(String inputString) {
        return !isMatch(inputString);
    }

    @Override
    public void printMatch() {
        System.out.println("Ban da nhap dung ten...");
    }

    @Override
    public void printNotMatch() {
        System.out.println("Ban da nhap sai ten, vui long nhap lai...");
        printGuideLine();
    }
}
