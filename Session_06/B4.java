package Session_06;

public class B4 {

    static class Employee {
        String maNhanVien;
        String tenNhanVien;
        double luong;

        Employee() {
            this.maNhanVien = "Chưa có";
            this.tenNhanVien = "Chưa có";
            this.luong = 0;
        }

        Employee(String maNhanVien, String tenNhanVien) {
            this.maNhanVien = maNhanVien;
            this.tenNhanVien = tenNhanVien;
            this.luong = 0;
        }

        Employee(String maNhanVien, String tenNhanVien, double luong) {
            this.maNhanVien = maNhanVien;
            this.tenNhanVien = tenNhanVien;
            this.luong = luong;
        }

        void hienThiThongTin() {
            System.out.println("Mã NV: " + maNhanVien);
            System.out.println("Tên NV: " + tenNhanVien);
            System.out.println("Lương: " + luong);
            System.out.println("--------------------");
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("NV01", "Nguyễn Văn A");
        Employee e3 = new Employee("NV02", "Trần Thị B", 15000000);

        e1.hienThiThongTin();
        e2.hienThiThongTin();
        e3.hienThiThongTin();
    }
}
