package Session_16.miniProject;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ProductRepository repository = new ProductRepository();

        repository.add(new ElectronicProduct("E01", "Tivi Samsung", 12000000, 24));
        repository.add(new ElectronicProduct("E02", "Laptop Dell", 20000000, 12));
        repository.add(new FoodProduct("F01", "Sữa Vinamilk", 30000, 10));
        repository.add(new FoodProduct("F02", "Bánh Oreo", 50000, 20));

        System.out.println("=== DANH SÁCH SẢN PHẨM ===");
        List<Product> products = repository.findAll();
        for (Product p : products) {
            if (p != null) {
                p.displayInfo();
                System.out.println("Thành tiền: " + p.calculateFinalPrice());
                System.out.println("--------------------");
            }
        }

        System.out.println("\n=== TÌM SẢN PHẨM THEO ID ===");
        Product found = repository.findById("E01");
        if (found != null) {
            found.displayInfo();
            System.out.println("Thành tiền: " + found.calculateFinalPrice());
        } else {
            System.out.println("Không tìm thấy sản phẩm.");
        }

        System.out.println("\n=== SẮP XẾP THEO GIÁ TĂNG DẦN ===");
        repository.sortByPriceAscending();
        for (Product p : repository.findAll()) {
            System.out.println(p.getName() + " - Giá: " + p.getPrice());
        }

        System.out.println("\n=== THỐNG KÊ THEO LOẠI ===");
        Map<String, Integer> stats = repository.countByType();
        for (Map.Entry<String, Integer> entry : stats.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}