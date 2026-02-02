package Session_07;

public class B4 {
    private String studentName;
    static double classFund = 0;

    public B4(String studentName) {
        this.studentName = studentName;
    }

    public void payFund(double amount) {
        classFund += amount;
        System.out.println(studentName + " đã đóng: " + amount);
    }

    public static void showClassFund() {
        System.out.println("Tổng quỹ lớp: " + classFund);
    }

    public static void main(String[] args) {
        B4 s1 = new B4("Nguyễn Văn A");
        B4 s2 = new B4("Trần Thị B");
        B4 s3 = new B4("Lê Văn C");

        s1.payFund(100000);
        s2.payFund(150000);
        s3.payFund(200000);

        B4.showClassFund();
    }
}
