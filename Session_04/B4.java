package Session_04;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class B4 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.printf("Nhập mã: ");
        String maThe = nhap.nextLine();

        Pattern mauDayDu = Pattern.compile("^TV\\d{4}\\d{5}$");
        Matcher boKhopDayDu = mauDayDu.matcher(maThe);

        if (boKhopDayDu.matches()) {
            System.out.println("Mã thẻ hợp lệ");
            return;
        }

        if (!maThe.startsWith("TV")) {
            System.out.println("Thiếu tiền tố TV");
            return;
        }

        Pattern mauNam = Pattern.compile("^TV(\\d{4}).*");
        Matcher boKhopNam = mauNam.matcher(maThe);

        if (!boKhopNam.matches()) {
            System.out.println("Năm không hợp lệ");
            return;
        }

        Pattern mauSoCuoi = Pattern.compile("^TV\\d{4}\\d{5}$");
        Matcher boKhopSoCuoi = mauSoCuoi.matcher(maThe);

        if (!boKhopSoCuoi.matches()) {
            System.out.println("Phần số cuối phải gồm đúng 5 chữ số");
            return;
        }

        System.out.println("Mã thẻ không hợp lệ");
    }
}
