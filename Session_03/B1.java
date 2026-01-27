package Session_03;

import java.security.PublicKey;
import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Nhập vào số lượng sách cần quản lý: ");
        int n = sc.nextInt();
        int[] library = addBookToLibraries(n);
        displayLibraries(library);
    };

    public static int[] addBookToLibraries(int n){
        Scanner sc = new Scanner(System.in);
        int[] book =  new int[n];
        System.out.printf("Nhập mã số cho %d cuốn sách:\n", n);
        for (int i = 0; i < n; i++) {
            System.out.printf("Sách thứ %d: ", i + 1);
            book[i] = sc.nextInt();
        }
        return book;
    }

    public static void displayLibraries(int[] book){
        System.out.println("--- Kết quả ---");
        for (int i = 0; i < book.length; i++) {
            System.out.printf("%d", book[i]);
            if (i != book.length - 1) {
                System.out.print(",\t");
            }
        }
    }
}
