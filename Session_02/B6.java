package Session_02;

import java.util.Scanner;

public class B6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int min = 0;
        int tong = 0;
        int dem = 0;

        boolean first = true;
        String thu;

        for (int i = 2; i <= 8; i++) {
            if (i == 8) {
                thu = "Chu Nhat";
            } else {
                thu = "Thu " + i;
            }

            System.out.print("Nhap luot muon ngay " + thu + ": ");
            int luotMuon = sc.nextInt();

            // Bỏ qua ngày không có lượt mượn
            if (luotMuon == 0) {
                continue;
            }

            // Ngày hợp lệ đầu tiên
            if (first) {
                max = luotMuon;
                min = luotMuon;
                first = false;
            } else {
                if (luotMuon > max) {
                    max = luotMuon;
                }
                if (luotMuon < min) {
                    min = luotMuon;
                }
            }

            tong += luotMuon;
            dem++;
        }

        System.out.println("\n--- KET QUA THONG KE ---");

        if (dem > 0) {
            System.out.println("Luot muon cao nhat: " + max);
            System.out.println("Luot muon thap nhat: " + min);
            System.out.println("Trung binh luot muon/ngay: " + (double) tong / dem);
        } else {
            System.out.println("Khong co ngay nao phat sinh luot muon.");
        }

        sc.close();
    }
}
