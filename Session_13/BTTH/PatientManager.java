package Session_13.BTTH;
import java.util.ArrayList;
import java.util.List;

public class PatientManager {

    private List<Patient> patientList = new ArrayList<>();

    public void addPatient(Patient patient) {
        patientList.add(patient);
        System.out.println("Thêm bệnh nhân thành công!");
    }

    public void removePatient(int id) {
        boolean removed = patientList.removeIf(p -> p.getId() == id);

        if (removed) {
            System.out.println("Xóa bệnh nhân thành công!");
        } else {
            System.out.println("Không tìm thấy bệnh nhân!");
        }
    }

    public void updatePatient(int id, String newName, int newAge, String newDisease) {
        for (Patient p : patientList) {
            if (p.getId() == id) {
                p.setName(newName);
                p.setAge(newAge);
                p.setDisease(newDisease);
                System.out.println("Cập nhật thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy bệnh nhân!");
    }

    public void searchPatientByName(String name) {
        boolean found = false;

        for (Patient p : patientList) {
            if (p.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(p);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy bệnh nhân!");
        }
    }

    public void displayPatients() {
        if (patientList.isEmpty()) {
            System.out.println("Danh sách bệnh nhân rỗng!");
            return;
        }

        for (Patient p : patientList) {
            System.out.println(p);
        }
    }
}
