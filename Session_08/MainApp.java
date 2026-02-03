package Session_08;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager(100);
        int choice;

        do {
            System.out.println("===== QUAN LY SINH VIEN =====");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Hien thi danh sach");
            System.out.println("3. Tim sinh vien theo ma");
            System.out.println("4. Xoa sinh vien");
            System.out.println("5. Sap xep theo diem");
            System.out.println("6. Sap xep theo ten");
            System.out.println("7. Thong ke");
            System.out.println("8. Thoat");
            System.out.print("Chon: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Ma SV: ");
                    String ma = sc.nextLine();
                    System.out.print("Ho ten: ");
                    String ten = sc.nextLine();
                    System.out.print("Tuoi: ");
                    int tuoi = Integer.parseInt(sc.nextLine());
                    System.out.print("Gioi tinh: ");
                    String gt = sc.nextLine();
                    System.out.print("Diem toan: ");
                    double toan = Double.parseDouble(sc.nextLine());
                    System.out.print("Diem ly: ");
                    double ly = Double.parseDouble(sc.nextLine());
                    System.out.print("Diem hoa: ");
                    double hoa = Double.parseDouble(sc.nextLine());

                    Student s = new Student(ma, ten, tuoi, gt, toan, ly, hoa);
                    if (manager.them(s)) {
                        System.out.println("Them thanh cong");
                    } else {
                        System.out.println("Them that bai");
                    }
                    break;

                case 2:
                    manager.hienThi();
                    break;

                case 3:
                    System.out.print("Nhap ma: ");
                    Student f = manager.timTheoMa(sc.nextLine());
                    if (f != null) f.hienThi();
                    else System.out.println("Khong tim thay");
                    break;

                case 4:
                    System.out.print("Nhap ma can xoa: ");
                    if (manager.xoa(sc.nextLine()))
                        System.out.println("Da xoa");
                    else
                        System.out.println("Khong tim thay");
                    break;

                case 5:
                    manager.sapXepTheoDiem();
                    System.out.println("Da sap xep");
                    break;

                case 6:
                    manager.sapXepTheoTen();
                    System.out.println("Da sap xep");
                    break;

                case 7:
                    manager.thongKe();
                    break;

                case 8:
                    System.out.println("Thoat chuong trinh");
                    break;
            }
        } while (choice != 8);
    }
}