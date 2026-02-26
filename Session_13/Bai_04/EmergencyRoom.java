package Session_13.Bai_04;

import java.util.LinkedList;

public class EmergencyRoom {

    private LinkedList<String> queue = new LinkedList<>();

    public void patientCheckIn(String name) {
        queue.addLast(name);
        System.out.println(name + " đã check-in (thường).");
    }

    public void emergencyCheckIn(String name) {
        queue.addFirst(name);
        System.out.println(name + " vào cấp cứu khẩn cấp!");
    }

    public void treatPatient() {
        if (queue.isEmpty()) {
            System.out.println("Không còn bệnh nhân.");
            return;
        }

        String patient = queue.removeFirst();

        System.out.println("Đang khám: " + patient);
    }

    public static void main(String[] args) {

        EmergencyRoom er = new EmergencyRoom();

        er.patientCheckIn("A");
        er.patientCheckIn("B");
        er.emergencyCheckIn("C");

        System.out.println("\n--- Bác sĩ bắt đầu khám ---");

        String first = er.queue.removeFirst();
        System.out.println("Đang cấp cứu: " + first);

        System.out.println("Đang khám: " + er.queue.removeFirst());
        System.out.println("Đang khám: " + er.queue.removeFirst());
    }
}
