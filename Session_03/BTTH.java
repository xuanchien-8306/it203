package Session_03;
import java.util.Scanner;

public class BTTH {

    static final int MAX = 100;

    static int[] ids = new int[MAX];
    static String[] titles = new String[MAX];
    static int[] quantities = new int[MAX];
    static int n = 0; // kích thước logic

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            showMenu();
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> showList();
                case 2 -> addBook();
                case 3 -> updateQuantity();
                case 4 -> deleteBook();
                case 5 -> searchBook();
                case 6 -> sortByQuantityDesc();
                case 0 -> System.out.println("Thoát chương trình.");
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);
    }

    static void showMenu() {
        System.out.println("\n===== MENU =====");
        System.out.println("1. Xem danh sách");
        System.out.println("2. Thêm sách mới");
        System.out.println("3. Cập nhật số lượng");
        System.out.println("4. Xóa sách");
        System.out.println("5. Tìm kiếm theo tên");
        System.out.println("6. Sắp xếp theo số lượng (giảm dần)");
        System.out.println("0. Thoát");
        System.out.print("Chọn: ");
    }

    static void showList() {
        if (n == 0) {
            System.out.println("Danh sách rỗng.");
            return;
        }
        System.out.printf("%-10s | %-25s | %-10s%n", "Mã", "Tên sách", "Số lượng");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d | %-25s | %-10d%n",
                    ids[i], titles[i], quantities[i]);
        }
    }

    static void addBook() {
        if (n == MAX) {
            System.out.println("Mảng đã đầy, không thể thêm.");
            return;
        }

        System.out.print("Nhập mã sách: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (findIndexById(id) != -1) {
            System.out.println("Mã sách đã tồn tại!");
            return;
        }

        System.out.print("Nhập tên sách: ");
        String title = sc.nextLine();

        System.out.print("Nhập số lượng: ");
        int qty = sc.nextInt();

        ids[n] = id;
        titles[n] = title;
        quantities[n] = qty;
        n++;

        System.out.println("Thêm sách thành công.");
    }

    static void updateQuantity() {
        System.out.print("Nhập mã sách cần cập nhật: ");
        int id = sc.nextInt();

        int idx = findIndexById(id);
        if (idx == -1) {
            System.out.println("Không tìm thấy sách.");
            return;
        }

        System.out.print("Nhập số lượng mới: ");
        quantities[idx] = sc.nextInt();
        System.out.println("Cập nhật thành công.");
    }

    static void deleteBook() {
        System.out.print("Nhập mã sách cần xóa: ");
        int id = sc.nextInt();

        int idx = findIndexById(id);
        if (idx == -1) {
            System.out.println("Không tìm thấy sách.");
            return;
        }

        for (int i = idx; i < n - 1; i++) {
            ids[i] = ids[i + 1];
            titles[i] = titles[i + 1];
            quantities[i] = quantities[i + 1];
        }
        n--;
        System.out.println("Đã xóa sách mã " + id);
    }

    static void searchBook() {
        System.out.print("Nhập từ khóa: ");
        String keyword = sc.nextLine().toLowerCase();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (titles[i].toLowerCase().contains(keyword)) {
                if (!found) {
                    System.out.printf("%-10s | %-25s | %-10s%n",
                            "Mã", "Tên sách", "Số lượng");
                }
                found = true;
                System.out.printf("%-10d | %-25s | %-10d%n",
                        ids[i], titles[i], quantities[i]);
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sách phù hợp.");
        }
    }

    static void sortByQuantityDesc() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (quantities[i] < quantities[j]) {
                    swap(i, j);
                }
            }
        }
        System.out.println("Đã sắp xếp theo số lượng giảm dần.");
    }

    static int findIndexById(int id) {
        for (int i = 0; i < n; i++) {
            if (ids[i] == id) return i;
        }
        return -1;
    }

    static void swap(int i, int j) {
        int tempId = ids[i];
        ids[i] = ids[j];
        ids[j] = tempId;

        String tempTitle = titles[i];
        titles[i] = titles[j];
        titles[j] = tempTitle;

        int tempQty = quantities[i];
        quantities[i] = quantities[j];
        quantities[j] = tempQty;
    }
}
