package Session_09.Bai05;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = {
                new OfficeEmployee("An", 10_000_000),
                new ProductionEmployee("Bình", 500, 20_000),
                new OfficeEmployee("Chi", 12_000_000)
        };

        double totalSalary = 0;

        for (Employee e : employees) {
            totalSalary += e.calculateSalary();
        }

        System.out.println("Tổng lương: " + totalSalary);
    }
}



