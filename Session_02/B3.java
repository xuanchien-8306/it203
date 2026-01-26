package Session_02;

import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập số lượng sách trả muộn: ");
        int n = sc.nextInt();

        int total = 0;
        int m;
        for(int i = 1; i <= n; i++){
            System.out.printf("Nhập số ngày trễ của cuốn thứ %d: ", i);
            m = sc.nextInt();
            total = total + m * 5000;
        }

        System.out.printf("===> Tổng tiền phạt: %d VND\n", total);
    }
}
