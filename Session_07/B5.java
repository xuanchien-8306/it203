package Session_07;

public class B5 {
    public static void main(String[] args) {

        double score = 8.5;

        if (score >= Config.MIN_SCORE && score <= Config.MAX_SCORE) {
            System.out.println("Điểm hợp lệ: " + score);
        } else {
            System.out.println("Điểm không hợp lệ");
        }

        // Config.MAX_SCORE = 9.0; // lỗi
    }
}
