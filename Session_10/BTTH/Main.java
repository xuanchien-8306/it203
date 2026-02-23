package Session_10.BTTH;

public class Main {
    public static void main(String[] args) {

        Payable creditCard = new CreditCard(
                "Nguyen Van A",
                "CC001",
                "1234567812345678",
                "123",
                10000000
        );

        Payable eWallet = new EWallet(
                "Tran Thi B",
                "EW001",
                "0987654321",
                5000000
        );

        creditCard.pay(2000000);
        System.out.println();
        eWallet.pay(1000000);
        System.out.println();

        Payable rewardPoints = new Payable() {
            @Override
            public void pay(double amount) {
                double points = amount / 1000;
                System.out.println("Thanh toán bằng điểm thưởng: " + amount);
                System.out.println("Số điểm đã sử dụng: " + points);
            }
        };

        rewardPoints.pay(300000);
    }
}