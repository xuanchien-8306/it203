package Session_10.BTTH;

abstract class PaymentMethod {
    protected String accountName;
    protected String paymentId;

    public PaymentMethod(String accountName, String paymentId) {
        this.accountName = accountName;
        this.paymentId = paymentId;
    }

    public abstract void validate();
}