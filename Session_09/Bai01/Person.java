package Session_09.Bai01;

public class Person {
    protected String fullName;
    protected int age;

    public Person() {}

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Họ tên: " + fullName);
        System.out.println("Tuổi: " + age);
    }
}
