package Session_04;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class B5 {
    public static void main(String[] args) {

        String[] danhSachLog = {
                "2024-05-20 | User: NguyenVanA | Action: BORROW | BookID: BK12345",
                "2024-05-21 | User: TranThiB | Action: RETURN | BookID: BK12345",
                "2024-05-22 | User: LeVanC | Action: BORROW | BookID: BK67890"
        };

        String bieuThucChinhQuy = "(\\d{4}-\\d{2}-\\d{2}) \\| User: (\\w+) \\| Action: (BORROW|RETURN) \\| BookID: (\\w+)";
        Pattern mau = Pattern.compile(bieuThucChinhQuy);

        int soLanMuon = 0;
        int soLanTra = 0;

        for (String log : danhSachLog) {
            Matcher boKhop = mau.matcher(log);

            if (boKhop.matches()) {
                String ngay = boKhop.group(1);
                String nguoiDung = boKhop.group(2);
                String hanhDong = boKhop.group(3);
                String maSach = boKhop.group(4);

                System.out.println("Ngày: " + ngay);
                System.out.println("Người dùng: " + nguoiDung);
                System.out.println("Hành động: " + hanhDong);
                System.out.println("Mã sách: " + maSach);
                System.out.println();

                if (hanhDong.equals("BORROW")) {
                    soLanMuon++;
                } else if (hanhDong.equals("RETURN")) {
                    soLanTra++;
                }
            }
        }

        System.out.println("Tổng BORROW: " + soLanMuon);
        System.out.println("Tổng RETURN: " + soLanTra);
    }
}
