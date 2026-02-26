package Session_13.Bai_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonPatientFinder {

    public static <T> List<T> findCommonPatients(List<T> listA, List<T> listB) {

        List<T> commonList = new ArrayList<>();

        for (T item : listA) {
            if (listB.contains(item) && !commonList.contains(item)) {
                commonList.add(item);
            }
        }

        return commonList;
    }

    public static void main(String[] args) {

        List<Integer> listA1 = Arrays.asList(101, 102, 105);
        List<Integer> listB1 = Arrays.asList(102, 105, 108);

        List<Integer> result1 = findCommonPatients(listA1, listB1);
        System.out.println("Test Case 1 Output: " + result1);

        List<String> listA2 = Arrays.asList("DN01", "DN02", "DN03");
        List<String> listB2 = Arrays.asList("DN02", "DN04");

        List<String> result2 = findCommonPatients(listA2, listB2);
        System.out.println("Test Case 2 Output: " + result2);
    }
}