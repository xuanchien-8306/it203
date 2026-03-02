package Session_15.BTTH;

public interface IManagement<T> {
    void add(T t);
    void display();
    T search(String keyword);
    void sort();
}