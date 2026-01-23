package Session_01;

import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        String bookID;
        String bookName;
        int publishYear;
        double price;
        boolean isAvailable;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập mã sách: ");
        bookID = sc.nextLine();

        System.out.println("Nhập tên sách: ");
        bookName = sc.nextLine();

        System.out.println("Nhập năm xuất bản: ");
        publishYear = sc.nextInt();

        System.out.println("Nhập giá bìa: ");
        price = sc.nextDouble();

        System.out.println("Sách còn trong kho (true/false): ");
        isAvailable = sc.nextBoolean();

        System.out.println("--- PHIẾU THÔNG TIN SÁCH ---");
        System.out.println("Tên sách: " + bookName);
        System.out.println("Mã số: " + bookID + " | Tuổi thọ: " + publishYear + "năm");
        System.out.println("Giá bán: " + price + "VND");
        if (isAvailable) {
            System.out.println("Tình trạng: Còn sách");
        }else{
            System.out.println("Tình trạng: Hết sách");
        }
    }
}
