package Session_01;

import java.util.Scanner;

public class B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã sách (4 chữ số): ");
        int number = sc.nextInt();

        int thousands = number / 1000;
        int hundreds  = (number / 100) % 10;
        int dozens    = (number / 10) % 10;
        int units     = number % 10;

        int expectedCheckDigit = (thousands + hundreds + dozens) % 10;

        System.out.println("Chữ số kiểm tra kỳ vọng: " + expectedCheckDigit);

        if (expectedCheckDigit == units) {
            System.out.println("Kết quả kiểm tra mã sách: HỢP LỆ");
        } else {
            System.out.println("Kết quả kiểm tra mã sách: SAI MÃ");
        }
    }
}
