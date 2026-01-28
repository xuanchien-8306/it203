package Session_04;

import java.util.Scanner;
public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Nhập mô tả sách: ");
        String description = sc.nextLine();

        if (description.contains("Kệ:")) {
            int start = description.indexOf("Kệ:") + 4;
            int comma = description.indexOf(",", start);

            String position;
            if (comma != -1) {
                position = description.substring(start, comma).trim();
            } else {
                position = description.substring(start).trim();
            }

            String newDescription = description.replace("Kệ:", "Vị trí lưu trữ:");

            System.out.println("Mã vị trí: " + position);
            System.out.println(newDescription);
        } else {
            System.out.println("Không tìm thấy thông tin kệ sách");
        }
    }
}

