package Session_15.Bai_01;

import java.util.Stack;

public class MedicalRecordHistory {
    private Stack<EditAction> history;

    public MedicalRecordHistory() {
        history = new Stack<>();
    }

    public void addEdit(EditAction action) {
        history.push(action);
        System.out.println("Added: " + action);
        displayHistory();
    }

    public EditAction undoEdit() {
        if (history.isEmpty()) {
            System.out.println("No edits to undo.");
            return null;
        }
        EditAction removed = history.pop();
        System.out.println("Undo: " + removed);
        displayHistory();
        return removed;
    }

    public EditAction getLatestEdit() {
        if (history.isEmpty()) {
            System.out.println("No edits available.");
            return null;
        }
        EditAction latest = history.peek();
        System.out.println("Latest edit: " + latest);
        return latest;
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }

    public void displayHistory() {
        System.out.println("Current History (Top -> Bottom):");
        for (int i = history.size() - 1; i >= 0; i--) {
            System.out.println(history.get(i));
        }
        System.out.println("---------------------------");
    }
}