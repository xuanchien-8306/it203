package Session_05.HN_KS24_CNTT5_TaXuanChien;

import java.util.Scanner;

public class miniProject {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            showMenu();
            System.out.print("Nhập lựa chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    twoSum();
                    break;
                case 2:
                    moveZeroes();
                    break;
                case 3:
                    validPalindrome();
                    break;
                case 4:
                    reverseWords();
                    break;
                case 5:
                    happyNumber();
                    break;
                case 0:
                    System.out.println("Đã thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 0);

        scanner.close();
    }

    static void showMenu() {
        System.out.println("\n===== MINI PROJECT SRS =====");
        System.out.println("1. Two Sum (Tìm cặp số có tổng bằng K)");
        System.out.println("2. Move Zeroes (Dồn số 0 về cuối)");
        System.out.println("3. Valid Palindrome (Chuỗi đối xứng)");
        System.out.println("4. Reverse Words (Đảo ngược từ)");
        System.out.println("5. Happy Number (Số hạnh phúc)");
        System.out.println("0. Thoát");
    }

    static void twoSum() {
        System.out.print("Nhập số phần tử mảng: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Mảng rỗng.");
            return;
        }

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("numbers[" + i + "] = ");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Nhập target: ");
        int target = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numbers[i] + numbers[j] == target) {
                    System.out.println("Tìm thấy: index " + i + " và " + j);
                    found = true;
                    return;
                }
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy cặp số phù hợp.");
        }
    }

    static void moveZeroes() {
        System.out.print("Nhập số phần tử mảng: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Mảng rỗng.");
            return;
        }

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("numbers[" + i + "] = ");
            numbers[i] = scanner.nextInt();
        }

        int insertIndex = 0;

        for (int i = 0; i < n; i++) {
            if (numbers[i] != 0) {
                numbers[insertIndex++] = numbers[i];
            }
        }

        while (insertIndex < n) {
            numbers[insertIndex++] = 0;
        }

        System.out.println("Mảng sau khi dồn 0:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    static void validPalindrome() {
        System.out.print("Nhập chuỗi cần kiểm tra: ");
        String input = scanner.nextLine();

        String cleaned = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                System.out.println("Chuỗi KHÔNG đối xứng.");
                return;
            }
            left++;
            right--;
        }

        System.out.println("Chuỗi là đối xứng.");
    }

    static void reverseWords() {
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        String trimmed = input.trim();

        if (trimmed.isEmpty()) {
            System.out.println("Chuỗi rỗng.");
            return;
        }

        String[] words = trimmed.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }

        System.out.println("Chuỗi sau khi đảo:");
        System.out.println(result.toString().trim());
    }

    static void happyNumber() {
        System.out.print("Nhập số nguyên dương: ");
        int number = scanner.nextInt();

        int slow = number;
        int fast = number;

        do {
            slow = sumOfSquares(slow);
            fast = sumOfSquares(sumOfSquares(fast));
        } while (slow != fast);

        if (slow == 1) {
            System.out.println(number + " là số hạnh phúc.");
        } else {
            System.out.println(number + " KHÔNG phải là số hạnh phúc.");
        }
    }

    static int sumOfSquares(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }
        return sum;
    }
}

