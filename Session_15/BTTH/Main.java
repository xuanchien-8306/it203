package Session_15.BTTH;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HospitalManagement hm = new HospitalManagement();

        while (true) {
            System.out.println("\n===== HỆ THỐNG QUẢN LÝ KHÁM BỆNH =====");
            System.out.println("1. Đăng ký khám bệnh");
            System.out.println("2. Gọi bệnh nhân vào khám");
            System.out.println("3. Hiển thị danh sách chờ");
            System.out.println("4. Tìm kiếm bệnh nhân");
            System.out.println("5. Sắp xếp danh sách theo tuổi");
            System.out.println("6. Xem lịch sử điều trị");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Nhập mã bệnh nhân: ");
                    String id = sc.nextLine();

                    System.out.print("Nhập họ tên: ");
                    String name = sc.nextLine();

                    System.out.print("Nhập tuổi: ");
                    int age = Integer.parseInt(sc.nextLine());

                    System.out.print("Nhập tình trạng bệnh: ");
                    String condition = sc.nextLine();

                    System.out.print("Có phải bệnh nhân cấp cứu không? (y/n): ");
                    String type = sc.nextLine();

                    if (type.equalsIgnoreCase("y")) {
                        System.out.print("Nhập mức độ ưu tiên: ");
                        int pr = Integer.parseInt(sc.nextLine());
                        hm.add(new EmergencyPatient(id, name, age, condition, pr));
                    } else {
                        hm.add(new Patient(id, name, age, condition));
                    }
                    break;

                case 2:
                    Patient p = hm.callPatient();
                    if (p != null) {
                        System.out.print("Nhập kết quả chẩn đoán/thuốc: ");
                        String record = sc.nextLine();
                        p.addHistory(record);
                    }
                    break;

                case 3:
                    System.out.println("=== DANH SÁCH BỆNH NHÂN ĐANG CHỜ ===");
                    hm.display();
                    break;

                case 4:
                    System.out.print("Nhập mã hoặc tên bệnh nhân cần tìm: ");
                    String key = sc.nextLine();
                    Patient found = hm.search(key);
                    if (found != null) {
                        System.out.println("Tìm thấy bệnh nhân:");
                        found.showInfo();
                    } else {
                        System.out.println("Không tìm thấy bệnh nhân.");
                    }
                    break;

                case 5:
                    hm.sort();
                    System.out.println("Đã sắp xếp danh sách theo tuổi tăng dần.");
                    break;

                case 6:
                    System.out.print("Nhập mã bệnh nhân để xem lịch sử: ");
                    String pid = sc.nextLine();
                    Patient patient = hm.search(pid);
                    if (patient != null) {
                        System.out.println("=== LỊCH SỬ ĐIỀU TRỊ ===");
                        patient.showHistory();
                    } else {
                        System.out.println("Bệnh nhân không có trong hàng đợi.");
                    }
                    break;

                case 0:
                    System.out.println("Thoát chương trình.");
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}