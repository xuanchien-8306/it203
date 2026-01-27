package Session_03;

import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] books = {105, 102, 109, 101, 103};

        System.out.printf("Mảng trước khi sắp xếp: [");
        for (int i = 0; i < books.length; i++) {
            System.out.printf("%d", books[i]);
            if (i != books.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.printf("]");
        sortBooks(books);
        displayBooks(books);
    }

    public static void sortBooks(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void  displayBooks(int[] arr){
        System.out.printf("\nMảng sau khi sắp xếp: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d", arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.printf("]");
    }
}
