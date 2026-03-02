package Session_15.Bai_03;

public class Main {
    public static void main(String[] args) {
        MedicationProcessChecker checker = new MedicationProcessChecker();

        String[] process1 = {"PUSH", "PUSH", "POP", "POP"};
        String[] process2 = {"PUSH", "POP", "POP"};
        String[] process3 = {"PUSH", "PUSH", "POP"};

        System.out.println("=== Process 1 ===");
        checker.checkProcess(process1);

        System.out.println("\n=== Process 2 ===");
        checker.checkProcess(process2);

        System.out.println("\n=== Process 3 ===");
        checker.checkProcess(process3);
    }
}