package Session_06;

public class B1 {

    static class Student {
        String maSinhVien;
        String hoTen;
        int namSinh;
        double diemTrungBinh;

        Student(String maSinhVien, String hoTen, int namSinh, double diemTrungBinh) {
            this.maSinhVien = maSinhVien;
            this.hoTen = hoTen;
            this.namSinh = namSinh;
            this.diemTrungBinh = diemTrungBinh;
        }

        void hienThiThongTin() {
            System.out.println("Mã SV: " + maSinhVien);
            System.out.println("Họ tên: " + hoTen);
            System.out.println("Năm sinh: " + namSinh);
            System.out.println("Điểm TB: " + diemTrungBinh);
            System.out.println("--------------------");
        }
    }

    public static void main(String[] args) {
        Student sv1 = new Student("SV001", "Nguyễn Văn A", 2004, 8.2);
        Student sv2 = new Student("SV002", "Trần Thị B", 2003, 7.8);

        sv1.hienThiThongTin();
        sv2.hienThiThongTin();
    }
}
