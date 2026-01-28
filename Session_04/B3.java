package Session_04;

public class B3 {
    public static void main(String[] args) {

        String[] transactions = {
                "BK001-20/01",
                "BK005-21/01",
                "BK099-22/01"
        };

        String today = "24/01/2026";

        long startBuilder = System.currentTimeMillis();

        StringBuilder reportBuilder = new StringBuilder();
        reportBuilder.append("--- BÁO CÁO MƯỢN SÁCH ---\n");
        reportBuilder.append("Ngày tạo: ").append(today).append("\n");

        for (String t : transactions) {
            reportBuilder.append("Giao dịch: ").append(t).append("\n");
        }

        long endBuilder = System.currentTimeMillis();

        long startString = System.currentTimeMillis();

        String reportString = "--- BÁO CÁO MƯỢN SÁCH ---\n";
        reportString += "Ngày tạo: " + today + "\n";

        for (String t : transactions) {
            reportString += "Giao dịch: " + t + "\n";
        }

        long endString = System.currentTimeMillis();

        System.out.println(reportBuilder.toString());
        System.out.println("Số thời gian thực thi đối với StringBuilder: " + (endBuilder - startBuilder));
        System.out.println("Số thời gian thực thi đối với String: " + (endString - startString));
    }
}


