package Session_06;

public class BTTH {

    private String accountNumber;
    private String ownerName;
    private double balance;

    public BTTH(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double money){
        if (money <= 0){
            System.out.printf("Số tiền nạp vào không hợp lệ");
        }else{
            balance += money;
        }
    }

    public void withdraw(double money){
        if (money > 0 && (balance - money >= 0)){
            balance -= money;
        }else{
            System.out.println("Số dư không đủ");
        }
    }

    public void display(){
        System.out.println("--------------------------------");
        System.out.println("Số TK: "+accountNumber);
        System.out.println("Name: "+ownerName);
        System.out.println("Balance: "+balance);
        System.out.println("--------------------------------");
    }
}
