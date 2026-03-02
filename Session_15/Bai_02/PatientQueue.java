package Session_15.Bai_02;
import java.util.LinkedList;
import java.util.Queue;

public class PatientQueue {
    private Queue<Patient> queue;

    public PatientQueue() {
        queue = new LinkedList<>();
    }

    public void addPatient(Patient p) {
        queue.offer(p);
        System.out.println("Added: " + p);
        displayQueue();
    }

    public Patient callNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("No patients in queue.");
            return null;
        }
        Patient p = queue.poll();
        System.out.println("Calling: " + p);
        displayQueue();
        return p;
    }

    public Patient peekNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("No patients in queue.");
            return null;
        }
        Patient p = queue.peek();
        System.out.println("Next patient: " + p);
        return p;
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void displayQueue() {
        System.out.println("Current Waiting List (Front -> Rear):");
        if (queue.isEmpty()) {
            System.out.println("Empty");
        } else {
            for (Patient p : queue) {
                System.out.println(p);
            }
        }
        System.out.println("---------------------------");
    }
}
