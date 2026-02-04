package Session_09.Bai03;

public class Manager extends Employee {
    private String department;

    public Manager(String name, double baseSalary, String department) {
        super(name, baseSalary);
        this.department = department;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Phòng ban: " + department);
    }
}
