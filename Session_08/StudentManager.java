package Session_08;

public class StudentManager {
    private Student[] list;
    private int count;

    public StudentManager(int size) {
        list = new Student[size];
        count = 0;
    }

    // kiểm tra trùng mã
    private boolean tonTaiMa(String ma) {
        for (int i = 0; i < count; i++) {
            if (list[i].getMaSV().equalsIgnoreCase(ma)) {
                return true;
            }
        }
        return false;
    }

    // thêm sinh viên
    public boolean them(Student s) {
        if (count == list.length || tonTaiMa(s.getMaSV())) {
            return false;
        }
        list[count++] = s;
        return true;
    }

    // hiển thị danh sách
    public void hienThi() {
        if (count == 0) {
            System.out.println("Danh sach rong");
            return;
        }
        System.out.printf("%-10s %-20s %-5s %-10s %-6s %-12s\n",
                "MaSV", "Ho Ten", "Tuoi", "GioiTinh", "DTB", "XepLoai");
        for (int i = 0; i < count; i++) {
            list[i].hienThi();
        }
    }

    // tìm theo mã
    public Student timTheoMa(String ma) {
        for (int i = 0; i < count; i++) {
            if (list[i].getMaSV().equalsIgnoreCase(ma)) {
                return list[i];
            }
        }
        return null;
    }

    // xóa sinh viên
    public boolean xoa(String ma) {
        for (int i = 0; i < count; i++) {
            if (list[i].getMaSV().equalsIgnoreCase(ma)) {
                for (int j = i; j < count - 1; j++) {
                    list[j] = list[j + 1];
                }
                list[--count] = null;
                return true;
            }
        }
        return false;
    }

    // sắp xếp theo điểm TB giảm dần (bubble sort)
    public void sapXepTheoDiem() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (list[j].getDiemTB() < list[j + 1].getDiemTB()) {
                    Student tmp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = tmp;
                }
            }
        }
    }

    // sắp xếp theo tên A-Z (selection sort)
    public void sapXepTheoTen() {
        for (int i = 0; i < count - 1; i++) {
            int min = i;
            for (int j = i + 1; j < count; j++) {
                if (list[j].getHoTen().compareToIgnoreCase(list[min].getHoTen()) < 0) {
                    min = j;
                }
            }
            Student tmp = list[i];
            list[i] = list[min];
            list[min] = tmp;
        }
    }

    // thống kê
    public void thongKe() {
        int gioi = 0, kha = 0, tb = 0, yeu = 0;
        for (int i = 0; i < count; i++) {
            switch (list[i].getXepLoai()) {
                case "Gioi": gioi++; break;
                case "Kha": kha++; break;
                case "Trung binh": tb++; break;
                default: yeu++;
            }
        }
        System.out.println("Gioi: " + gioi);
        System.out.println("Kha: " + kha);
        System.out.println("Trung binh: " + tb);
        System.out.println("Yeu: " + yeu);
    }
}