package Session_02;

import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tuôi: ");
        int age = sc.nextInt();
        System.out.print("Nhập số sách: ");
        int bookNumber = sc.nextInt();

        if (age >= 18 &&  bookNumber <= 3) {
            System.out.println("Kết quả: Bạn Đủ Điều Kện mượn sách quý hiếm");
        }else if (age >= 18 && bookNumber >= 3) {
            System.out.println("kết quả: Khong đủ điều kiện.");
            System.out.println( "   - Lý do: bạn đã mượn tối đa 3 cuôn");
        }else{
            System.out.println("Kêết quả: Không đủ điều kiện");
            System.out.println("    - Lý do: Bạn phải từ 18 tuổi trở lên");
        }
    }
}
