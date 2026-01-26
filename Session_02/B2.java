package Session_02;

import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char code;
        System.out.printf("Nhập mã khu vực (A, B, C, D): ");
        code = sc.next().charAt(0);

        switch (code) {
            case 'A':
                System.out.printf("Tầng 1: Sách Văn học\n");
                break;
            case 'B':
                System.out.printf("Tầng 2: Sách Khoa học\n");
                break;
            case 'C':
                System.out.printf("Tầng 3: Sách Ngoại ngữ\n");
                break;
            case 'D':
                System.out.printf("Tầng 4: Sách Tin học\n");
                break;
                default:
                    System.out.printf("lỗi: Mã khu vực không hợp lệ");
        }
    }
}
