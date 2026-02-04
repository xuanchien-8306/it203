package Session_09.BTTH;

import java.util.Scanner;

public class Employee {
    protected String id;
    protected String name;
    protected int age;
    protected double credit;
    protected static final double BASIC_SALARY = 1_300_000;
    protected double salary;

    public Employee() {}

    public Employee(String id, String name, int age, double credit) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.credit = credit;
    }

    // Getter / Setter
    public String getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    // Nhập thông tin nhân viên
    public void inputData(Scanner sc) {
        System.out.print("Nhập mã nhân viên (E***): ");
        id = sc.nextLine();

        System.out.print("Nhập tên nhân viên: ");
        name = sc.nextLine();

        System.out.print("Nhập tuổi: ");
        age = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập hệ số lương: ");
        credit = Double.parseDouble(sc.nextLine());
    }

    // Tính lương
    public double calcSalary() {
        salary = credit * BASIC_SALARY;
        return salary;
    }

    // Hiển thị
    public void displayData() {
        System.out.println("ID: " + id);
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Lương: " + salary);
    }
}
