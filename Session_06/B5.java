package Session_06;

public class B5 {

    static class Book {
        String maSach;
        String tenSach;
        int namXuatBan;

        Book(String maSach, String tenSach, int namXuatBan) {
            this.maSach = maSach;
            this.tenSach = tenSach;
            this.namXuatBan = namXuatBan;
        }

        void hienThiThongTin() {
            System.out.println("Mã sách: " + maSach);
            System.out.println("Tên sách: " + tenSach);
            System.out.println("Năm xuất bản: " + namXuatBan);
            System.out.println("--------------------");
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("B01", "Lập trình Java", 2023);
        Book b2 = new Book("B02", "Cấu trúc dữ liệu", 2022);

        b1.hienThiThongTin();
        b2.hienThiThongTin();
    }
}
