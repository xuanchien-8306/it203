package Session_04;
import java.time.Year;
import java.util.regex.Pattern;

public class BTTH {
    public static void main(String[] args) {

        String maSach = "LIB-2024-S";
        String maIsbn = "0123456789";
        String namXuatBan = "2023";
        String tenSachTho = " lập trình jaVa căn bản ";
        String tenTacGiaTho = " nguyễn   văn   a ";

        boolean hopLeMaSach = Pattern.matches("LIB-\\d{4}-S", maSach);
        boolean hopLeIsbn = Pattern.matches("\\d{10}", maIsbn);
        boolean hopLeNamXuatBan = Pattern.matches("\\d{4}", namXuatBan)
                && Integer.parseInt(namXuatBan) <= Year.now().getValue();

        if (!hopLeMaSach || !hopLeIsbn || !hopLeNamXuatBan) {
            System.out.println("Dữ liệu không hợp lệ");
            return;
        }

        String tenSach = chuanHoaChuoi(tenSachTho);
        String tenTacGia = chuanHoaChuoi(tenTacGiaTho);

        StringBuilder trichDan = new StringBuilder();
        trichDan.append("[")
                .append(maSach)
                .append("] - ")
                .append(tenSach)
                .append(" - ")
                .append(tenTacGia)
                .append(" (")
                .append(namXuatBan)
                .append(")");

        System.out.println("----- KẾT QUẢ BIÊN MỤC -----");
        System.out.println("Mã sách chuẩn: " + maSach);
        System.out.println("ISBN-10: " + maIsbn);
        System.out.println("Tên sách: " + tenSach);
        System.out.println("Tác giả: " + tenTacGia);
        System.out.println("Năm XB: " + namXuatBan);
        System.out.println("Trích dẫn: " + trichDan.toString());
    }

    static String chuanHoaChuoi(String chuoi) {
        String[] tu = chuoi.trim().split("\\s+");
        StringBuilder ketQua = new StringBuilder();

        for (String t : tu) {
            ketQua.append(
                    t.substring(0, 1).toUpperCase()
                            + t.substring(1).toLowerCase()
            ).append(" ");
        }

        return ketQua.toString().trim();
    }
}
