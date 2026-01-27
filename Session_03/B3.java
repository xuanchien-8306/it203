package Session_03;

import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Java", "Python", "C++", "SQL", "HTML"};
        int[] quantities = {10, 5, 10, 3, 3};

        maxQuantityOfBooks(names, quantities);
        minQuantityOfBooks(names, quantities);
    }

    public static void maxQuantityOfBooks(String[] names, int[] quantities) {
        int max = quantities[0];
        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] > max) {
                max = quantities[i];
            }
        }

        System.out.printf("Sách có số lượng nhiều nhất (%d): \n", max);
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == max) {
                System.out.printf("- %s\n", names[i]);
            }
        }
    }
    public static void minQuantityOfBooks(String[] names, int[] quantities) {
        int min = quantities[0];
        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] < min) {
                min = quantities[i];
            }
        }

        System.out.printf("Sách có số lượng nhiều nhất (%d): \n", min);
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == min) {
                System.out.printf("- %s\n", names[i]);
            }
        }
    }

}
