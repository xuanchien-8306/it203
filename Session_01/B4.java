package Session_01;

import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập giá sách ( USD ): ");
        double price = sc.nextDouble();
        System.out.print("Nhập tỉ giá: ");
        float tyGia = sc.nextFloat();
        double total = tyGia * price;

        long totalVND = (long)total;

        System.out.println("Giá chính xác: " + total);
        System.out.println("Giá làm tròn để thanh toán: " +totalVND);
    }
}
