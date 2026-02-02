package Session_07;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Tạ Xuân Chiến");
        Student s2 = new Student(2, "Đặng Văn Thắng");

        s1.displayInfo();
        s2.displayInfo();

        Student.showTotalStudent();
    }

}
