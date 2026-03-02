package Session_15.Bai_04;

public class Main {
    public static void main(String[] args) {
        EmergencyQueue queue = new EmergencyQueue();

        queue.addPatient(new EmergencyPatient("E01", "Nguyen Van A", 2));
        queue.addPatient(new EmergencyPatient("E02", "Tran Thi B", 1));
        queue.addPatient(new EmergencyPatient("E03", "Le Van C", 2));
        queue.addPatient(new EmergencyPatient("E04", "Pham Thi D", 1));

        queue.callNextPatient();
        queue.callNextPatient();
        queue.callNextPatient();
        queue.callNextPatient();
    }
}