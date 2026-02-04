package Session_09.BTTH;

import java.util.Scanner;

public class EmployeeManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee[] employees = new Employee[100];
        int current = 0;

        int choice;
        do {
            System.out.println("********************** MENU **********************");
            System.out.println("1. Nhập thông tin nhân viên");
            System.out.println("2. Nhập thông tin quản lý");
            System.out.println("3. Tính lương nhân viên và quản lý");
            System.out.println("4. Hiển thị thông tin các nhân viên và quản lý");
            System.out.println("5. Sắp xếp các nhân sự theo lương giảm dần");
            System.out.println("6. Tính số lượng nhân viên và quản lý");
            System.out.println("7. Tìm kiếm nhân sự theo tên");
            System.out.println("8. Thoát");
            System.out.print("Chọn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1: {
                    System.out.print("Nhập số lượng nhân viên cần thêm: ");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n && current < employees.length; i++) {
                        Employee e = new Employee();
                        e.inputData(sc);
                        employees[current++] = e;
                    }
                    break;
                }

                case 2: {
                    System.out.print("Nhập số lượng quản lý cần thêm: ");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n && current < employees.length; i++) {
                        Manager m = new Manager();
                        m.inputManage(sc);
                        employees[current++] = m;
                    }
                    break;
                }

                case 3: {
                    for (int i = 0; i < current; i++) {
                        employees[i].calcSalary();
                    }
                    System.out.println("Đã tính lương cho tất cả nhân sự.");
                    break;
                }

                case 4: {
                    for (int i = 0; i < current; i++) {
                        employees[i].displayData();
                        System.out.println("--------------------------------");
                    }
                    break;
                }

                case 5: {
                    for (int i = 0; i < current - 1; i++) {
                        for (int j = i + 1; j < current; j++) {
                            if (employees[i].calcSalary() < employees[j].calcSalary()) {
                                Employee temp = employees[i];
                                employees[i] = employees[j];
                                employees[j] = temp;
                            }
                        }
                    }
                    System.out.println("Đã sắp xếp theo lương giảm dần.");
                    break;
                }

                case 6: {
                    int empCount = 0;
                    int managerCount = 0;

                    for (int i = 0; i < current; i++) {
                        if (employees[i] instanceof Manager) {
                            managerCount++;
                        } else {
                            empCount++;
                        }
                    }

                    System.out.println("Số nhân viên: " + empCount);
                    System.out.println("Số quản lý: " + managerCount);
                    break;
                }

                case 7: {
                    System.out.print("Nhập tên cần tìm: ");
                    String name = sc.nextLine().toLowerCase();
                    boolean found = false;

                    for (int i = 0; i < current; i++) {
                        if (employees[i].getName().toLowerCase().contains(name)) {
                            employees[i].displayData();
                            System.out.println("--------------------------------");
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Không tìm thấy nhân sự phù hợp.");
                    }
                    break;
                }

                case 8:
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 8);
    }
}
