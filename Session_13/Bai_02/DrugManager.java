package Session_13.Bai_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DrugManager {

    public static List<String> removeDuplicateAndSort(List<String> inputList) {

        List<String> uniqueList = new ArrayList<>();

        for (String drug : inputList) {
            if (!uniqueList.contains(drug)) {
                uniqueList.add(drug);
            }
        }

        Collections.sort(uniqueList);

        return uniqueList;
    }

    public static void main(String[] args) {

        List<String> input = Arrays.asList(
                "Paracetamol",
                "Ibuprofen",
                "Panadol",
                "Paracetamol",
                "Aspirin",
                "Ibuprofen"
        );

        System.out.println("Input: " + input);

        List<String> result = removeDuplicateAndSort(input);

        System.out.println("Output: " + result);
    }
}