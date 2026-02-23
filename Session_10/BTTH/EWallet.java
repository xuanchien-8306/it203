package Session_10.BTTH;

class EWallet extends PaymentMethod implements Payable {

    private String phoneNumber;
    private double balance;

    public EWallet(String accountName, String paymentId,
                   String phoneNumber, double balance) {
        super(accountName, paymentId);
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }

    @Override
    public void validate() {
        if (phoneNumber == null || phoneNumber.isEmpty()) {
            throw new IllegalArgumentException("Số điện thoại không hợp lệ");
        }
    }

    @Override
    public void pay(double amount) {
        validate();
        if (amount > balance) {
            System.out.println("Số dư không đủ");
        } else {
            balance -= amount;
            System.out.println("Thanh toán bằng ví điện tử thành công: " + amount);
            System.out.println("Số dư còn lại: " + balance);
        }
    }
}