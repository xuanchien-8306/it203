package Session14.Btth;

import java.util.*;

abstract class Person {
    protected String id;
    protected String name;
    protected int age;

    public Person(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }

    public abstract void displayInfo();
}

class Patient extends Person implements Comparable<Patient> {
    private String phone;

    public Patient(String id, String name, int age, String phone) {
        super(id, name, age);
        this.phone = phone;
    }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public int compareTo(Patient o) {
        return this.name.compareToIgnoreCase(o.name);
    }

    public void displayInfo() {
        System.out.println(id + " - " + name + " - " + age + " - " + phone);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient)) return false;
        Patient p = (Patient) o;
        return id.equals(p.id);
    }

    public int hashCode() {
        return id.hashCode();
    }
}

class MedicalRecord {
    private String recordId;
    private String diagnosis;
    private String date;

    public MedicalRecord(String recordId, String diagnosis, String date) {
        this.recordId = recordId;
        this.diagnosis = diagnosis;
        this.date = date;
    }

    public String getRecordId() { return recordId; }
    public String getDiagnosis() { return diagnosis; }
    public String getDate() { return date; }

    public void display() {
        System.out.println("RecordID: " + recordId + " | Diagnosis: " + diagnosis + " | Date: " + date);
    }
}

interface Manageable<T> {
    void add(T t);
    void update(String id);
    void delete(String id);
    void displayAll();
}

class PatientService implements Manageable<Patient> {

    private Set<Patient> patients = new HashSet<>();
    private Map<String, List<MedicalRecord>> recordMap = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    public void add(Patient p) {
        if (patients.contains(p)) {
            System.out.println("ID da ton tai");
        } else {
            patients.add(p);
            System.out.println("Them thanh cong");
        }
    }

    public void update(String id) {
        for (Patient p : patients) {
            if (p.getId().equals(id)) {
                System.out.print("Nhap ten moi: ");
                p.setName(sc.nextLine());
                System.out.print("Nhap tuoi moi: ");
                p.setAge(Integer.parseInt(sc.nextLine()));
                System.out.print("Nhap sdt moi: ");
                p.setPhone(sc.nextLine());
                System.out.println("Cap nhat thanh cong");
                return;
            }
        }
        System.out.println("Khong tim thay");
    }

    public void delete(String id) {
        Patient remove = null;
        for (Patient p : patients) {
            if (p.getId().equals(id)) {
                remove = p;
                break;
            }
        }
        if (remove != null) {
            patients.remove(remove);
            recordMap.remove(id);
            System.out.println("Xoa thanh cong");
        } else {
            System.out.println("Khong tim thay");
        }
    }

    public void displayAll() {
        for (Patient p : patients) {
            p.displayInfo();
        }
    }

    public void addRecord() {
        System.out.print("Nhap patient id: ");
        String id = sc.nextLine();
        if (!exists(id)) {
            System.out.println("Khong tim thay benh nhan");
            return;
        }
        System.out.print("Nhap record id: ");
        String rid = sc.nextLine();
        System.out.print("Nhap chan doan: ");
        String diag = sc.nextLine();
        System.out.print("Nhap ngay: ");
        String date = sc.nextLine();

        MedicalRecord record = new MedicalRecord(rid, diag, date);
        recordMap.computeIfAbsent(id, k -> new ArrayList<>()).add(record);
        System.out.println("Them ho so thanh cong");
    }

    public void viewRecords() {
        System.out.print("Nhap patient id: ");
        String id = sc.nextLine();
        List<MedicalRecord> list = recordMap.get(id);
        if (list == null || list.isEmpty()) {
            System.out.println("Khong co ho so");
            return;
        }
        for (MedicalRecord r : list) {
            r.display();
        }
    }

    public void deleteRecord() {
        System.out.print("Nhap patient id: ");
        String id = sc.nextLine();
        List<MedicalRecord> list = recordMap.get(id);
        if (list == null) {
            System.out.println("Khong tim thay");
            return;
        }
        System.out.print("Nhap record id: ");
        String rid = sc.nextLine();
        list.removeIf(r -> r.getRecordId().equals(rid));
        System.out.println("Xoa thanh cong");
    }

    public void searchPatient() {
        System.out.println("1. Tim theo id");
        System.out.println("2. Tim theo ten");
        String choice = sc.nextLine();
        if (choice.equals("1")) {
            System.out.print("Nhap id: ");
            String id = sc.nextLine();
            for (Patient p : patients)
                if (p.getId().equals(id))
                    p.displayInfo();
        } else {
            System.out.print("Nhap ten: ");
            String name = sc.nextLine().toLowerCase();
            for (Patient p : patients)
                if (p.getName().toLowerCase().contains(name))
                    p.displayInfo();
        }
    }

    public void sortPatients() {
        List<Patient> list = new ArrayList<>(patients);
        System.out.println("1. Theo ten");
        System.out.println("2. Theo tuoi");
        System.out.println("3. Theo id");
        String choice = sc.nextLine();

        if (choice.equals("1")) Collections.sort(list);
        else if (choice.equals("2"))
            list.sort((a, b) -> Integer.compare(a.getAge(), b.getAge()));
        else if (choice.equals("3"))
            list.sort((a, b) -> a.getId().compareTo(b.getId()));

        for (Patient p : list) p.displayInfo();
    }

    private boolean exists(String id) {
        for (Patient p : patients)
            if (p.getId().equals(id)) return true;
        return false;
    }
}

public class Btth_ss14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PatientService service = new PatientService();
        while (true) {
            System.out.println("========= QUAN LY PHONG KHAM =========");
            System.out.println("1. Them benh nhan");
            System.out.println("2. Cap nhat benh nhan");
            System.out.println("3. Xoa benh nhan");
            System.out.println("4. Hien thi danh sach");
            System.out.println("5. Them ho so");
            System.out.println("6. Xem ho so");
            System.out.println("7. Xoa ho so");
            System.out.println("8. Tim benh nhan");
            System.out.println("9. Sap xep benh nhan");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Nhap id: ");
                    String id = sc.nextLine();
                    System.out.print("Nhap ten: ");
                    String name = sc.nextLine();
                    System.out.print("Nhap tuoi: ");
                    int age = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhap sdt: ");
                    String phone = sc.nextLine();
                    service.add(new Patient(id, name, age, phone));
                    break;
                case "2":
                    System.out.print("Nhap id: ");
                    service.update(sc.nextLine());
                    break;
                case "3":
                    System.out.print("Nhap id: ");
                    service.delete(sc.nextLine());
                    break;
                case "4":
                    service.displayAll();
                    break;
                case "5":
                    service.addRecord();
                    break;
                case "6":
                    service.viewRecords();
                    break;
                case "7":
                    service.deleteRecord();
                    break;
                case "8":
                    service.searchPatient();
                    break;
                case "9":
                    service.sortPatients();
                    break;
                case "0":
                    return;
            }
        }
    }
}