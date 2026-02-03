package HN_KS24_TaXuanChien_ss8;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Student[] students;
    static int n = 0;

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("===== QUẢN LÝ ĐIỂM SINH VIÊN =====");
            System.out.println("1. Nhập danh sách sinh viên ");
            System.out.println("2. Hiển thị danh sách sinh viên ");
            System.out.println("3. Tìm kiếm sinh viên theo Học lực ");
            System.out.println("4. Sắp xếp theo học lực giảm dần");
            System.out.println("5. Thoát");
            System.out.println("=================================");
            System.out.print("Chọn chức năng: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    nhapDanhSach();
                    break;
                case 2:
                    hienThiDanhSach();
                    break;
                case 3:
                    timTheoHocLuc();
                    break;
                case 4:
                    sapXepGiamDan();
                    System.out.println("Đã sắp xếp xong");
                    break;
                case 5:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        } while (choice != 5);
    }

    static void nhapDanhSach() {
        System.out.print("Nhập số lượng sinh viên: ");
        n = sc.nextInt();
        sc.nextLine();

        students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập sinh viên thứ " + (i + 1));

            String id;
            while (true) {
                System.out.print("Mã sinh viên (VD: SV001): ");
                id = sc.nextLine();
                if (id.matches("SV\\d{3}")) {
                    break;
                }
                System.out.println("Mã sinh viên không hợp lệ");
            }

            System.out.print("Tên: ");
            String name = sc.nextLine();

            System.out.print("Điểm trung bình: ");
            double score = sc.nextDouble();
            sc.nextLine();

            students[i] = new Student(id, name, score);
        }
    }

    static void hienThiDanhSach() {
        if (students == null || n == 0) {
            System.out.println("Danh sách rỗng");
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(students[i]);
        }
    }


    static void timTheoHocLuc() {
        if (students == null) {
            System.out.println("Chưa có dữ liệu");
            return;
        }

        System.out.print("Nhập học lực cần tìm (Giỏi / Khá / Trung Bình): ");
        String rank = sc.nextLine();

        boolean found = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getRank().equalsIgnoreCase(rank)) {
                System.out.println(students[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sinh viên nào");
        }
    }


    static void sapXepGiamDan() {
        if (students == null) return;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (students[i].getScore() < students[j].getScore()) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
    }
}

