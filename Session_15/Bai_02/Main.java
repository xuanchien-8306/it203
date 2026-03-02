package Session_15.Bai_02;

public class Main {
    public static void main(String[] args) {
        PatientQueue queue = new PatientQueue();

        queue.addPatient(new Patient("P01", "Nguyen Van A", 30));
        queue.addPatient(new Patient("P02", "Tran Thi B", 25));
        queue.addPatient(new Patient("P03", "Le Van C", 40));

        queue.peekNextPatient();

        queue.callNextPatient();
        queue.callNextPatient();
        queue.callNextPatient();
        queue.callNextPatient();
    }
}
