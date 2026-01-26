package Session_02;

import java.util.Scanner;
public class B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int diemUyTin = 100;
        int soNgayTre;

        System.out.println("--- HE THONG DANH GIA DOC GIA ---");
        System.out.println("(Nhap so ngay tre. Nhap 999 de ket thuc)");

        while (true) {
            System.out.print("So ngay tre cua lan nay: ");
            soNgayTre = sc.nextInt();

            if (soNgayTre == 999) {
                break;
            }

            if (soNgayTre > 0) {
                int diemTru = soNgayTre * 2;
                diemUyTin -= diemTru;
                System.out.println("-> Tra tre " + soNgayTre + " ngay: -" + diemTru + " diem.");
            } else {
                diemUyTin += 5;
                System.out.println("-> Tra dung han: +5 diem.");
            }

            System.out.println();
        }

        System.out.println("Tong diem uy tin: " + diemUyTin);

        if (diemUyTin > 120) {
            System.out.println("Xep loai: DOC GIA THAN THIET");
        } else if (diemUyTin >= 80) {
            System.out.println("Xep loai: DOC GIA TIEU CHUAN");
        } else {
            System.out.println("Xep loai: DOC GIA CAN LUU Y");
        }

        sc.close();
    }
}

