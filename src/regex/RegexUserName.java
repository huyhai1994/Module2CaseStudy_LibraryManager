package regex;

/*Kiem tra xem Ten nguoi dung nhap vao co tu 6 -> 20 ki tu
 * Va loai bo truong hop nhap ki tu dac biet
 * Ten nguoi dung co the duoc nhap chu thuong hoac in hoa*/

public class RegexUserName implements Regex {
    @Override
    public void printGuideLine() {
        System.out.println("> Bạn cần nhập tổng số chữ từ 6 đến 20 kí tự ");
        System.out.println("> Có thể có chữ cái in thường, hoặc in hoa");
        System.out.println("> Có thể chứa số nguyên từ 0->9 ");
        System.out.println("> Không được nhập kí tự đặc biệt.");
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
    public void printNotMatch() {
        System.out.println("Bạn đã nhập sai định dạng " +
                "tên vui lòng nhập lại...");
        printGuideLine();
    }
}
