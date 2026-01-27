package Session_03;

import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] books = {"Chiến", "Thắng", "Đạt", "Thanh", "Hưng"};
        System.out.printf("Nhập tên sách cần tìm: ");
        String search = sc.next();
        searchBooks(books, search);
    }

    public static void searchBooks(String[] arr, String search){
        for (int i = 0; i < arr.length; i++){
            if (arr[i].equals(search)){
                System.out.printf("Tìm thấy sách '%s' tại vị trí: %d", search, i);
                return;
            }
        }
        System.out.printf("Sách không tồn tại trong thư viện");
    }
}
