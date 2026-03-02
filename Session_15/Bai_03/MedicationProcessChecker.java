package Session_15.Bai_03;

import java.util.Stack;

public class MedicationProcessChecker {
    private Stack<String> stack;

    public MedicationProcessChecker() {
        stack = new Stack<>();
    }

    public boolean checkProcess(String[] actions) {
        reset();

        for (int i = 0; i < actions.length; i++) {
            String action = actions[i];

            if (action.equalsIgnoreCase("PUSH")) {
                stack.push("Medication");
                System.out.println("Step " + (i + 1) + ": PUSH -> Phát thuốc");
            }
            else if (action.equalsIgnoreCase("POP")) {
                if (stack.isEmpty()) {
                    System.out.println("Step " + (i + 1) + ": POP -> LỖI: Không thể hoàn tất khi chưa phát thuốc.");
                    return false;
                }
                stack.pop();
                System.out.println("Step " + (i + 1) + ": POP -> Hoàn tất phát thuốc");
            }
            else {
                System.out.println("Step " + (i + 1) + ": LỖI: Thao tác không hợp lệ - " + action);
                return false;
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("LỖI: Kết thúc ca trực nhưng vẫn còn thuốc chưa hoàn tất.");
            return false;
        }

        System.out.println("Quy trình hợp lệ. Ca trực hoàn tất đúng quy định.");
        return true;
    }

    public void reset() {
        stack.clear();
    }
}