package Session_02;

import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ID;
        do {
            System.out.print("Nhập mã ID sách mới (phải > 0): ");
            ID = sc.nextInt();

            if (ID <= 0){
                System.out.printf("Lỗi ID phải là số dương. Mời nhập lại\n");
            }
        }while (ID <= 0);

        System.out.printf("Xác Nhận: Mã sách %d được ghi nhận", ID);

    }
}
