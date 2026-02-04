package Session_09.Bai04;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Dog();

        animal.sound();

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.guardHouse();
        }
    }
}
