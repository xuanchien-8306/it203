package Session_15.BTTH;

import java.util.Stack;

public class Patient extends Person {
    protected String medicalCondition;
    protected Stack<String> history;

    public Patient(String id, String fullName, int age, String medicalCondition) {
        super(id, fullName, age);
        this.medicalCondition = medicalCondition;
        this.history = new Stack<>();
    }

    public void addHistory(String record) {
        history.push(record);
    }

    public void showHistory() {
        if (history.isEmpty()) {
            System.out.println("No treatment history.");
            return;
        }
        Stack<String> temp = (Stack<String>) history.clone();
        while (!temp.isEmpty()) {
            System.out.println(temp.pop());
        }
    }

    @Override
    public void showInfo() {
        System.out.println("ID: " + id +
                " | Name: " + fullName +
                " | Age: " + age +
                " | Condition: " + medicalCondition);
    }
}