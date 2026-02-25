package HN_K24_CNTT5_TaXuanChien_004;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    // câu 1
    // phần 2
    static void cau1Phan2(){
        System.out.println("Nhập chuỗi ký tự vào bàn phím: ");
        String str = sc.nextLine().trim().replaceAll("\\s+", " ");
        String[] firstNum = str.split(" ");
        String lastNum = firstNum[firstNum.length-1].toLowerCase();
        StringBuilder sb = new StringBuilder(lastNum);
        for (int i = 0; i < firstNum.length-1; i++) {
            sb.append(Character.toUpperCase(firstNum[i].charAt(0)));
        }
        System.out.println(sb.toString());
    }
    static void cau2Phan2(){
        System.out.println("Nhập vào số lượng phần tử: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", i+1);
            arr[i] = sc.nextInt();
        }

        //Tìm số lớn thứ nhì
        int max = arr[0];
        int max2 =  arr[0];
        for (int i = 0; i <= n - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] > max2 && arr[i] < max) {
                max2 = arr[i];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Second: " + max2);

    }
    public static void main(String[] args) {
        cau2Phan2();
    }
}
