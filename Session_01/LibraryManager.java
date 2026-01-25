package Session_01;

public class LibraryManager {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        int bookID;
        String title;
        double price;
        int quantity;
        boolean isAvailable;

        System.out.print("Nhập mã sách: ");
        bookID = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhập tên sách: ");
        title = sc.nextLine();

        System.out.print("Nhập giá nhập: ");
        price = sc.nextDouble();

        System.out.print("Nhập số lượng: ");
        quantity = sc.nextInt();

        System.out.print("Sách còn trong kho? (true/false): ");
        isAvailable = sc.nextBoolean();

        double totalValue = price * quantity;
        boolean isLargeStock = quantity > 100;
        boolean canBorrow = isAvailable && quantity > 0;

        System.out.println("\n===== BÁO CÁO TÌNH TRẠNG SÁCH =====");
        System.out.println("Mã sách: " + bookID);
        System.out.println("Tên sách: " + title);
        System.out.printf("Giá nhập: %.2f%n", price);
        System.out.println("Số lượng: " + quantity);
        System.out.printf("Tổng giá trị kho: %.2f%n", totalValue);
        System.out.println("Kho lớn (>100 sách): " + isLargeStock);
        System.out.println("Trạng thái: " + (isAvailable ? "Còn hàng" : "Hết hàng"));
        System.out.println("Có thể mượn: " + canBorrow);

        sc.close();
    }
}

