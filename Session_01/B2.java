package Session_01;

import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số ngày trễ: ");
        int n = sc.nextInt();          // ngày trễ
        System.out.print("Nhập số ngày muộn: ");
        int m = sc.nextInt();          // Ngày mượn
        double total = (n * m * 5000);

        double totalAdjusted = total;
        if(n > 7 && m >= 3 ){
            totalAdjusted = total * 1.2;
        }
        System.out.println("Tiền phạt gốc: " + total + "VND");
        System.out.println("Tiền phạt sau điều chỉnh: " + totalAdjusted + "VND");
        boolean yeucaukhoathe;
        if(totalAdjusted > 50000){
            yeucaukhoathe = true;
        }else{
            yeucaukhoathe = false;
        }
        System.out.println("Yeu cầu khoá thẻ: "+yeucaukhoathe);
    }
}
