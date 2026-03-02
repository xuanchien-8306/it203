package Session_15.BTTH;

import java.util.*;

public class HospitalManagement implements IManagement<Patient> {
    private Queue<Patient> queue;

    public HospitalManagement() {
        queue = new LinkedList<>();
    }

    @Override
    public void add(Patient p) {
        if (p instanceof EmergencyPatient) {
            LinkedList<Patient> temp = (LinkedList<Patient>) queue;
            temp.addFirst(p);
        } else {
            queue.offer(p);
        }
        System.out.println("Added successfully.");
    }

    public Patient callPatient() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
            return null;
        }
        Patient p = queue.poll();
        System.out.println("Calling patient:");
        p.showInfo();
        return p;
    }

    @Override
    public void display() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        for (Patient p : queue) {
            p.showInfo();
        }
    }

    @Override
    public Patient search(String keyword) {
        for (Patient p : queue) {
            if (p.getId().equalsIgnoreCase(keyword) ||
                    p.getFullName().toLowerCase().contains(keyword.toLowerCase())) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void sort() {
        List<Patient> list = new ArrayList<>(queue);
        list.sort(Comparator.comparingInt(Patient::getAge));
        queue.clear();
        queue.addAll(list);
        System.out.println("Sorted by age.");
    }
}