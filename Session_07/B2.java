package Session_07;

class Students{
    String name;
}

public class B2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        b = 20;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        Students s1 = new Students();
        s1.name = "Tạ Xuân Chiến";

        Students s2 = s1;
        s2.name = "Đặng Văn Thắng";

        System.out.println("Name S1: " + s1.name);
        System.out.println("Name S2: " + s2.name);
    }
}
