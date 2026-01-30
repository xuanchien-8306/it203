package Session_06;

public class B6 {

    static class User {
        private int id;
        private String username;
        private String password;
        private String email;

        User(int id, String username, String password, String email) {
            this.id = id;
            this.username = username;
            setPassword(password);
            setEmail(email);
        }

        public int getId() {
            return id;
        }

        public String getUsername() {
            return username;
        }

        public String getEmail() {
            return email;
        }

        public void setPassword(String password) {
            if (password != null && !password.isEmpty()) {
                this.password = password;
            }
        }

        public void setEmail(String email) {
            if (email != null && email.contains("@")) {
                this.email = email;
            }
        }

        void hienThiThongTin() {
            System.out.println("ID: " + id);
            System.out.println("Username: " + username);
            System.out.println("Email: " + email);
            System.out.println("Password: ******");
            System.out.println("--------------------");
        }
    }

    public static void main(String[] args) {
        User u1 = new User(1, "kien01", "123456", "kien@gmail.com");
        User u2 = new User(2, "kien02", "", "kiengmail.com");

        u1.hienThiThongTin();
        u2.hienThiThongTin();

        u2.setPassword("abc123");
        u2.setEmail("kien02@gmail.com");

        u2.hienThiThongTin();
    }
}
