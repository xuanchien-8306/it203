package Session_15.Bai_04;

import java.util.PriorityQueue;
import java.util.Comparator;

public class EmergencyQueue {
    private PriorityQueue<EmergencyPatient> queue;
    private long sequenceCounter = 0;

    public EmergencyQueue() {
        queue = new PriorityQueue<>(new Comparator<EmergencyPatient>() {
            @Override
            public int compare(EmergencyPatient p1, EmergencyPatient p2) {
                if (p1.getPriority() != p2.getPriority()) {
                    return Integer.compare(p1.getPriority(), p2.getPriority());
                }
                return Long.compare(p1.getSequence(), p2.getSequence());
            }
        });
    }

    public void addPatient(EmergencyPatient p) {
        p.setSequence(sequenceCounter++);
        queue.offer(p);
        System.out.println("Added: " + p);
        displayQueue();
    }

    public EmergencyPatient callNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("No patients waiting.");
            return null;
        }
        EmergencyPatient p = queue.poll();
        System.out.println("Calling: " + p);
        displayQueue();
        return p;
    }

    public void displayQueue() {
        System.out.println("Current Emergency Queue:");
        if (queue.isEmpty()) {
            System.out.println("Empty");
        } else {
            PriorityQueue<EmergencyPatient> temp =
                    new PriorityQueue<>(queue);
            while (!temp.isEmpty()) {
                System.out.println(temp.poll());
            }
        }
        System.out.println("---------------------------");
    }
}
