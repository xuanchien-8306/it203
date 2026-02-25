package HN_K24_CNTT5_TaXuanChien_004;

import java.util.Scanner;

public class Main {

    // =========================
    // ===== CÂU 1 - CHUỖI =====
    // =========================

    // Kiểm tra nguyên âm
    public static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }

    // 1. Đếm nguyên âm & phụ âm
    public static void countVowelAndConsonant(String input) {
        int vowel = 0;
        int consonant = 0;

        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            // Chỉ xét bảng chữ cái a-z
            if (c >= 'a' && c <= 'z') {
                if (isVowel(c)) {
                    vowel++;
                } else {
                    consonant++;
                }
            }
        }

        if (vowel > consonant) {
            System.out.println("Nguyên âm nhiều hơn (Nguyên âm: "
                    + vowel + ", Phụ âm: " + consonant + ")");
        } else if (consonant > vowel) {
            System.out.println("Phụ âm nhiều hơn (Nguyên âm: "
                    + vowel + ", Phụ âm: " + consonant + ")");
        } else {
            System.out.println("Bằng nhau");
        }
    }

    // 2. Chuẩn hóa tên & tạo username
    public static void normalizeNameAndUsername(String fullName) {

        // Bỏ khoảng trắng dư
        fullName = fullName.trim().replaceAll("\\s+", " ").toLowerCase();

        String[] words = fullName.split(" ");

        // Title Case
        StringBuilder normalized = new StringBuilder();
        for (String word : words) {
            normalized.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1))
                    .append(" ");
        }

        System.out.println("Tên chuẩn: " + normalized.toString().trim());

        // Username = Tên chính + chữ cái đầu của họ & tên đệm
        String lastName = words[words.length - 1];
        StringBuilder username = new StringBuilder();
        username.append(Character.toUpperCase(lastName.charAt(0)))
                .append(lastName.substring(1));

        for (int i = 0; i < words.length - 1; i++) {
            username.append(Character.toUpperCase(words[i].charAt(0)));
        }

        System.out.println("Username: " + username);
    }

    // =========================
    // ===== CÂU 2 - MẢNG ======
    // =========================

    // 1. Insert & Shift Right giữ nguyên kích thước
    public static void insertAndShift(int[] arr, int index, int x) {

        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        arr[index] = x;

        System.out.print("Mảng sau khi chèn: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 2. Tìm số lớn thứ nhì (1 vòng lặp)
    public static void findSecondLargest(int[] arr) {

        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > max) {
                second = max;
                max = num;
            } else if (num > second && num != max) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("Không tồn tại số lớn thứ nhì");
        } else {
            System.out.println("Max: " + max + ", Second: " + second);
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===== CÂU 1 =====
        System.out.println("Nhập chuỗi để đếm nguyên âm & phụ âm:");
        String str = sc.nextLine();
        countVowelAndConsonant(str);

        System.out.println("\nNhập họ tên:");
        String fullName = sc.nextLine();
        normalizeNameAndUsername(fullName);

        // ===== CÂU 2 =====
        System.out.println("\nNhập số phần tử mảng:");
        int n = sc.nextInt();

        if (n <= 2) {
            System.out.println("Mảng phải có hơn 2 phần tử.");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Insert & Shift
        System.out.println("Nhập index:");
        int index = sc.nextInt();

        System.out.println("Nhập giá trị X:");
        int x = sc.nextInt();

        insertAndShift(arr, index, x);

        // Second Largest
        findSecondLargest(arr);

        sc.close();
    }
}
