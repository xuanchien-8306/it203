package Session_10.Bai_02;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota");
        Vehicle bicycle = new Bicycle("Giant");

        car.move();
        bicycle.move();
    }
}
