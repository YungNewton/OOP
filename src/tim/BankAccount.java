package tim;

public class BankAccount {
    private String customerName;
    private float customerAccountBalance;
    private String customerEmail;
    private String customerAccountNumber;
    private String customerPhoneNumber;

    public BankAccount() {

    }

    public BankAccount(String customerName, float customerAccountBalance, String customerEmail,
                       String customerAccountNumber, String customerPhoneNumber) {
        this.customerName = customerName;
        this.customerAccountBalance = customerAccountBalance;
        this.customerEmail = customerEmail;
        this.customerAccountNumber = customerAccountNumber;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public float getCustomerAccountBalance() {
        return customerAccountBalance;
    }

    public void setCustomerAccountBalance(float customerAccountBalance) {
        this.customerAccountBalance = customerAccountBalance;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerAccountNumber() {
        return customerAccountNumber;
    }

    public void setCustomerAccountNumber(String customerAccountNumber) {
        this.customerAccountNumber = customerAccountNumber;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
    public void deposit(float amount){
        this.customerAccountBalance = this.customerAccountBalance+amount;
        System.out.println("You have successfully deposited "+ amount);
        System.out.println("your new account balance is "+ this.customerAccountBalance);
    }
    public void withdraw(float amount){
        if(amount>this.customerAccountBalance){
            System.out.println("Insufficient funds");
        }else {
            this.customerAccountBalance = this.customerAccountBalance - amount;
            System.out.println("you have successfully withdrawn "+ amount);
            System.out.println("your new available balance is "+ this.customerAccountBalance);
        }
    }
}
