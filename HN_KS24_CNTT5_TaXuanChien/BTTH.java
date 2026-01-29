package Session_05.HN_KS24_CNTT5_TaXuanChien;

import java.util.Scanner;
import java.util.regex.Pattern;

public class BTTH {
    static final int MAX = 100;
    static String[] studentIds = new String[MAX];
    static int count = 0;

    static final String REGEX_STUDENT_ID = "^B\\d{7}$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            showMenu();
            System.out.printf("Chọn chức năng: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    displayList();
                    break;
                case 2:
                    addStudent(sc);
                    break;
                case 3:
                    update(sc);
                    break;
                case 5:
                    searchStudentId(sc);
                    break;
                case 6:
                    System.out.println("Thoát");
                    break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ");

            }
        }while (choice != 6);
    }

    public static void showMenu() {
        System.out.println("\n========= Quản lý mã số sinh viên =========");
        System.out.println("1. Hiển thị danh sách MSSV");
        System.out.println("2. Thêm MSSV mới");
        System.out.println("3. Cập nhật MSSV theo index");
        System.out.println("4. Xoá MSSV");
        System.out.println("5. Tìm kiếm");
        System.out.println("6. Thoát");
    }

    public static void displayList(){
        if (count == 0){
            System.out.println("Danh sách MSSV rỗng");
            return;
        }

        System.out.println("Danh sách MSSV: ");
        for (int i = 0; i < count; i++) {
            System.out.printf("%d. %s\n", i+1, studentIds[i]);
        }
    }

    public static void addStudent(Scanner sc) {
        if (count >= MAX) {
            System.out.println("Mảng đầy, không th thêm");
            return;
        }

        String studentId;
        do {
            System.out.printf("Nhập MSSV mới: ");
            studentId = sc.nextLine().trim();

            if (!Pattern.matches(REGEX_STUDENT_ID, studentId)) {
                System.out.println("MSSV không hợp lệ ( B2101234 )");
            }
        }while (!Pattern.matches(REGEX_STUDENT_ID, studentId));

        studentIds[count] = studentId;
        count++;
        System.out.println("Thêm MSSV thành công");
    }

    public static void update(Scanner sc) {
        if (count == 0) {
            System.out.println("Danh sách rỗng");
            return;
        }

        System.out.printf("Nhapaj vị trí cần sửa (1 - %d)",  count);
        int index = sc.nextInt();
        sc.nextLine();

        if (index < 1 || index > count){
            System.out.println("Vị trí không hợp lệ");
            return;
        }

        String newStudentId;
        do {
            System.out.print("Nhập MSSV mới: ");
            newStudentId = sc.nextLine().trim();
            if (!Pattern.matches(REGEX_STUDENT_ID, newStudentId)) {
                System.out.println("MSSV không hợp lệ");
            }
        }while (!Pattern.matches(REGEX_STUDENT_ID, newStudentId));
        studentIds[index - 1] = newStudentId;
        System.out.println("Cập nhật thành công");
    }

    public static void searchStudentId(Scanner scanner){
        System.out.print("Nhập chuỗi cần tìm: ");
        String keyword = scanner.nextLine().toLowerCase();

        boolean found = false;
        System.out.println("Kết quả tìm kiếm:");
        for (int i = 0; i < count; i++) {
            if (studentIds[i].toLowerCase().contains(keyword)) {
                System.out.println((i + 1) + ". " + studentIds[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không có MSSV phù hợp");
        }
    }
}
