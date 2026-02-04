package Session_09.Bai05;

public class OfficeEmployee extends Employee {
    private double baseSalary;

    public OfficeEmployee(String name, double baseSalary) {
        super(name);
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }
}


