package Session_06;

public class B2 {

    static class Account {
        String username;
        String password;
        String email;

        Account(String username, String password, String email) {
            this.username = username;
            this.password = password;
            this.email = email;
        }

        void doiMatKhau(String matKhauMoi) {
            this.password = matKhauMoi;
        }

        void hienThiThongTin() {
            System.out.println("Username: " + username);
            System.out.println("Email: " + email);
            System.out.println("Password: ******");
            System.out.println("--------------------");
        }
    }

    public static void main(String[] args) {
        Account acc = new Account("kien123", "123456", "kien@gmail.com");

        acc.hienThiThongTin();
        acc.doiMatKhau("abc789");
        acc.hienThiThongTin();
    }
}
