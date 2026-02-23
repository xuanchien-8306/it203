package Session_10.Bai_05;

public class Main {
    public static void main(String[] args) {

        Employee staff = new OfficeStaff("An", 8000000);
        Employee manager = new Manager("Binh", 15000000, 5000000);

        System.out.println("Nhân viên: " + staff.getName());
        System.out.println("Lương: " + staff.calculateSalary());

        System.out.println();

        System.out.println("Nhân viên: " + manager.getName());
        System.out.println("Lương: " + manager.calculateSalary());
    }
}