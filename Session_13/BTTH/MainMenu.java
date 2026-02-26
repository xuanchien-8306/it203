package Session_13.BTTH;

import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PatientManager manager = new PatientManager();
        int choice;

        do {
            System.out.println("\n===== QUẢN LÝ BỆNH NHÂN =====");
            System.out.println("1. Thêm bệnh nhân");
            System.out.println("2. Xóa bệnh nhân");
            System.out.println("3. Cập nhật bệnh nhân");
            System.out.println("4. Tìm kiếm bệnh nhân");
            System.out.println("5. Hiển thị danh sách");
            System.out.println("0. Kết thúc");
            System.out.print("Chọn: ");

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    int id = Integer.parseInt(scanner.nextLine());

                    System.out.print("Tên: ");
                    String name = scanner.nextLine();

                    System.out.print("Tuổi: ");
                    int age = Integer.parseInt(scanner.nextLine());

                    System.out.print("Giới tính: ");
                    String gender = scanner.nextLine();

                    System.out.print("Bệnh lý: ");
                    String disease = scanner.nextLine();

                    manager.addPatient(new Patient(id, name, age, gender, disease));
                    break;

                case 2:
                    System.out.print("Nhập ID cần xóa: ");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    manager.removePatient(deleteId);
                    break;

                case 3:
                    System.out.print("Nhập ID cần cập nhật: ");
                    int updateId = Integer.parseInt(scanner.nextLine());

                    System.out.print("Tên mới: ");
                    String newName = scanner.nextLine();

                    System.out.print("Tuổi mới: ");
                    int newAge = Integer.parseInt(scanner.nextLine());

                    System.out.print("Bệnh lý mới: ");
                    String newDisease = scanner.nextLine();

                    manager.updatePatient(updateId, newName, newAge, newDisease);
                    break;

                case 4:
                    System.out.print("Nhập tên cần tìm: ");
                    String searchName = scanner.nextLine();
                    manager.searchPatientByName(searchName);
                    break;

                case 5:
                    manager.displayPatients();
                    break;

                case 0:
                    System.out.println("Kết thúc chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 0);

        scanner.close();
    }
}
