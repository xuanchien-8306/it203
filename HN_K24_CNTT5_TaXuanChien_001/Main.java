package HN_K24_CNTT5_TaXuanChien_001;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Cau1();
        Cau2();
        Cau3();
    }

    // ============================================
    // ================== Câu 1 ===================
    //=============================================
    public static void Cau1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số ngày chi tiêu: ");
        int n = sc.nextInt();

        ArrayList<Double> list = new ArrayList<>();
        System.out.println("Nhập chi tiêu của từng ngày: ");
//       Ngày 1: 150.0 Ngày 2: 50.0 Ngày 3: 320.5 Ngày 4: 100.0 Ngày 5: 50.0 Ngày 6: 450.0 Ngày 7: 20.5
        for (int i = 1; i <= n; i++) {
            System.out.print("Ngày " + i +": ");
            list.add(sc.nextDouble());
        }

        // Tổng chi tiêu
        double sum = list.stream().mapToDouble(Double::doubleValue).sum();
        System.out.println("Tổng chi tiêu: " + sum);


        //Chi tiêu nhiều & ít nhất
        double max = list.stream().mapToInt(Double::intValue).max().getAsInt();
        double min = list.stream().mapToInt(Double::intValue).min().getAsInt();
        System.out.println("Chi tiêu nhiều nhất: " + max);
        System.out.println("Chi tiêu ít nhất: " + min);

        // Mức chi tiêu trung bình
        double avg = list.stream().mapToInt(Double::intValue).sum() / n;
        System.out.println("Trung bình / ngày: " + avg);

        // số ngày vượt trung bình
        int averageDays = 0;
//        for (int i = 1; i <= list.size(); i++) {
//            if (list.get(i) >= avg) {
//                averageDays++;
//            }
//        }

        System.out.println("Số ngày vượt trung bình: " + averageDays);
    }

    // ============================================
    // ================== Câu 2 ===================
    //=============================================
    // Thống kê số lượng phần tử:
    public static void Cau2(){
        Scanner input = new Scanner(System.in);
        // Nhập số lượng phần tử và từng phân tử
        System.out.print("Nhập số phần tử (0 - 100): ");
        int n = input.nextInt();
        input.nextLine();
        // kiểm tra
        if (n < 0 || n > 100) {
            System.out.println("Lỗi: Số lượng phần tử không hợp lệ");
            return;
        }
        // Nhập vào phần tử
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ "+(i+1)+": ");
            list.add(input.nextInt());
        }

        // HashMap lưu <số, số lần xuất hiện>
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer i : list) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // in kết quả
        for (Integer key : map.keySet()) {
            System.out.println("Số "+ key +" xuất hiện: " + map.get(key) + " Lần");
        }
    }

    // ============================================
    // ================== Câu 3 ===================
    //=============================================
    // Chuyển đổi cơ số Thập phân (10) sang Nhị phân (2)
    public static void Cau3(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Nhập vào 1 số nguyên dương: ");
        int n = input.nextInt();
        input.nextLine();

        Stack<Character> stack = new Stack<>();
    }
}
