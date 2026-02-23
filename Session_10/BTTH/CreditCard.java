package Session_10.BTTH;

class CreditCard extends PaymentMethod implements Payable {

    private String cardNumber;
    private String cvv;
    private double creditLimit;

    public CreditCard(String accountName, String paymentId,
                      String cardNumber, String cvv, double creditLimit) {
        super(accountName, paymentId);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.creditLimit = creditLimit;
    }

    @Override
    public void validate() {
        if (cardNumber == null || !cardNumber.matches("\\d{16}")) {
            throw new IllegalArgumentException("Số thẻ không hợp lệ");
        }
    }

    @Override
    public void pay(double amount) {
        validate();
        if (amount > creditLimit) {
            System.out.println("Vượt quá hạn mức tín dụng");
        } else {
            creditLimit -= amount;
            System.out.println("Thanh toán bằng thẻ thành công: " + amount);
            System.out.println("Hạn mức còn lại: " + creditLimit);
        }
    }
}