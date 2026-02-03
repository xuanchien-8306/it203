package Session_08;

public class Student {
    private String maSV;
    private String hoTen;
    private int tuoi;
    private String gioiTinh;
    private double diemToan;
    private double diemLy;
    private double diemHoa;
    private double diemTB;
    private String xepLoai;

    // constructor có tham số
    public Student(String maSV, String hoTen, int tuoi, String gioiTinh,
                   double diemToan, double diemLy, double diemHoa) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
        tinhDiemTB();
        xepLoai();
    }

    // tính điểm trung bình
    public void tinhDiemTB() {
        diemTB = (diemToan + diemLy + diemHoa) / 3;
    }

    // xếp loại học lực
    public void xepLoai() {
        if (diemTB >= 8 && diemToan >= 6.5 && diemLy >= 6.5 && diemHoa >= 6.5) {
            xepLoai = "Gioi";
        } else if (diemTB >= 6.5 && diemToan >= 5 && diemLy >= 5 && diemHoa >= 5) {
            xepLoai = "Kha";
        } else if (diemTB >= 5 && diemToan >= 3.5 && diemLy >= 3.5 && diemHoa >= 3.5) {
            xepLoai = "Trung binh";
        } else {
            xepLoai = "Yeu";
        }
    }

    // getter & setter
    public String getMaSV() { return maSV; }
    public String getHoTen() { return hoTen; }
    public int getTuoi() { return tuoi; }
    public String getGioiTinh() { return gioiTinh; }
    public double getDiemTB() { return diemTB; }
    public String getXepLoai() { return xepLoai; }

    public void setHoTen(String hoTen) { this.hoTen = hoTen; }
    public void setTuoi(int tuoi) { this.tuoi = tuoi; }

    public void setDiem(double toan, double ly, double hoa) {
        this.diemToan = toan;
        this.diemLy = ly;
        this.diemHoa = hoa;
        tinhDiemTB();
        xepLoai();
    }

    // hiển thị 1 sinh viên
    public void hienThi() {
        System.out.printf("%-10s %-20s %-5d %-10s %-6.2f %-12s\n",
                maSV, hoTen, tuoi, gioiTinh, diemTB, xepLoai);
    }
}
