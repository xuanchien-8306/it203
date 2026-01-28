package Session_04;

import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên sách: ");
        String bookName = sc.nextLine();

        System.out.print("Nhập tên tác giả: ");
        String author = sc.nextLine();

        System.out.print("Nhập thể loại: ");
        String category = sc.nextLine();

        bookName = bookName.trim().replaceAll("\\s+", " ");
        author = author.trim().replaceAll("\\s+", " ");
        category = category.trim().replaceAll("\\s+", " ");

        bookName = bookName.toUpperCase();

        author = author.toLowerCase();
        String[] words = author.split(" ");
        String formattedAuthor = "";

        for (String w : words) {
            formattedAuthor += w.substring(0, 1).toUpperCase()
                    + w.substring(1) + " ";
        }

        formattedAuthor = formattedAuthor.trim();

        String result = bookName + " - Tác giả: " + formattedAuthor;

        System.out.println("\nKẾT QUẢ:");
        System.out.println(result);
    }
}

