package Session_06;

public class Main {
    public static void main(String[] args) {
        BTTH acc1 = new BTTH("5983475342", "Thắng", 10);
        BTTH acc2 = new BTTH("0564170988", "Chiến", 20);
        acc1.deposit(10);
        acc1.withdraw(5);
        acc1.display();

        acc2.deposit(2);
        acc2.withdraw(5);
        acc2.display();
    }
}
