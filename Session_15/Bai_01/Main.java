package Session_15.Bai_01;

public class Main {
    public static void main(String[] args) {
        MedicalRecordHistory history = new MedicalRecordHistory();

        history.addEdit(new EditAction("Update patient name", "10:00"));
        history.addEdit(new EditAction("Add diagnosis", "10:05"));
        history.addEdit(new EditAction("Update prescription", "10:10"));

        history.getLatestEdit();

        history.undoEdit();
        history.undoEdit();
        history.undoEdit();
        history.undoEdit();
    }
}