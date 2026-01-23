package Session_01;

import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String book1 = "Java Basic";
        String book2 = "Python Intro";
        System.out.printf("Trước khi hoán đổi: \nBook1 = %s \nBook2 = %s", book1, book2);
        // Stack:
        // book1 ──► tham chiếu đến "Java Basic"
        // book2 ──► tham chiếu đến "Python Intro"
        // temp  ──► chưa có giá trị

        // Heap:
        // "Java Basic"
        // "Python Intro"
        String temp;
        temp = book1;
        // temp = book1;
        // Stack:
        // temp  ──► "Java Basic"
        // (Heap KHÔNG tạo chuỗi mới, chỉ thêm 1 tham chiếu)
        book1 = book2;
        // book1 = book2;
        // Stack:
        // book1 ──► "Python Intro"
        // book2 ──► "Python Intro"
        // temp  ──► "Java Basic"
        book2 = temp;
        // book2 = temp;
        // Stack:
        // book2 ──► "Java Basic"
        //
        // Heap:
        // Vẫn chỉ có 2 chuỗi ban đầu
        // Không có chuỗi nào bị thay đổi nội dung (String là immutable)
        System.out.printf("\nSau khi hoán đổi: \nBook1 = %s \nBook2 = %s", book1, book2);
    }
}
