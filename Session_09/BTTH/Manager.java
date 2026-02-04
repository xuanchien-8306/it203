package Session_09.BTTH;

import java.util.Scanner;

public class Manager extends Employee {
    private String position;
    private String department;

    public Manager() {}

    public Manager(String id, String name, int age, double credit,
                   String position, String department) {
        super(id, name, age, credit);
        this.position = position;
        this.department = department;
    }

    // Nhập thông tin quản lý
    public void inputManage(Scanner sc) {
        super.inputData(sc);

        System.out.print("Nhập vị trí: ");
        position = sc.nextLine();

        System.out.print("Nhập phòng ban: ");
        department = sc.nextLine();
    }

    // Tính lương quản lý
    @Override
    public double calcSalary() {
        salary = credit * BASIC_SALARY * 1.2;
        return salary;
    }

    // Hiển thị
    @Override
    public void displayData() {
        super.displayData();
        System.out.println("Vị trí: " + position);
        System.out.println("Phòng ban: " + department);
    }
}
