package Session_06;

public class B3 {

    static class Product {
        private String maSanPham;
        private String tenSanPham;
        private double giaBan;

        Product(String maSanPham, String tenSanPham, double giaBan) {
            this.maSanPham = maSanPham;
            this.tenSanPham = tenSanPham;
            setGiaBan(giaBan);
        }

        public String getMaSanPham() {
            return maSanPham;
        }

        public String getTenSanPham() {
            return tenSanPham;
        }

        public double getGiaBan() {
            return giaBan;
        }

        public void setGiaBan(double giaBan) {
            if (giaBan > 0) {
                this.giaBan = giaBan;
            }
        }

        void hienThiThongTin() {
            System.out.println("Mã SP: " + maSanPham);
            System.out.println("Tên SP: " + tenSanPham);
            System.out.println("Giá bán: " + giaBan);
            System.out.println("--------------------");
        }
    }

    public static void main(String[] args) {
        Product p = new Product("SP01", "Bút bi", 5000);

        p.hienThiThongTin();
        p.setGiaBan(-1000);
        p.hienThiThongTin();
    }
}
