package Session_02;

import java.util.Scanner;
public class BTTH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n===== MENU HE THONG THU THU =====");
            System.out.println("1. Tinh tien phat tra sach");
            System.out.println("2. Dang ky the muon sach VIP");
            System.out.println("3. Thong ke sach nhap kho");
            System.out.println("0. Thoat chuong trinh");
            System.out.print("Chon chuc nang: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:     // Tính tiền phạt
                    int n;
                    int tongTienPhat = 0;

                    System.out.print("Nhap so luong sach tra: ");
                    n = sc.nextInt();

                    for (int i = 1; i <= n; i++) {
                        System.out.print("Nhap so ngay qua han cua sach thu " + i + ": ");
                        int ngayTre = sc.nextInt();

                        if (ngayTre <= 0) continue;

                        if (ngayTre <= 5) {
                            tongTienPhat += ngayTre * 2000;
                        } else {
                            tongTienPhat += 5 * 2000 + (ngayTre - 5) * 5000;
                        }
                    }

                    System.out.println("Tong tien phat: " + tongTienPhat + " VND");
                    break;

                case 2:     // Đăng ký thẻ vip
                    System.out.print("Nhap tuoi: ");
                    int tuoi = sc.nextInt();

                    System.out.print("Nhap so sach da muon trong thang: ");
                    int soSach = sc.nextInt();

                    System.out.print("Co the uu tien sinh vien? (1: Co, 0: Khong): ");
                    int uuTien = sc.nextInt();

                    boolean duDieuKien = (tuoi >= 18 && soSach >= 10) || uuTien == 1;

                    if (duDieuKien) {
                        System.out.println("Du tieu chuan nang cap VIP");
                    } else {
                        System.out.println("Chua du tieu chuan");
                    }
                    break;

                case 3:     // Thống kê

                    int maSach;
                    int dem = 0;

                    System.out.println("Nhap ma sach moi (Nhap 0 de ket thuc):");

                    do {
                        System.out.print("Ma sach: ");
                        maSach = sc.nextInt();

                        if (maSach < 0) {
                            System.out.println("Ma sach khong hop le. Nhap lai!");
                            continue;
                        }

                        if (maSach == 0) {
                            break;
                        }

                        dem++;

                    } while (true);

                    System.out.println("Tong so sach hop le da nhap: " + dem);
                    break;

                case 0:
                    System.out.println("Da thoat chuong trinh.");
                    sc.close();
                    return;

                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai!");
            }
        }
    }
}

