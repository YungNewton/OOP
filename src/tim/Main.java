package tim;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setCustomerAccountBalance(1000);
        bankAccount.deposit(200);
        bankAccount.withdraw(20000);
    }
}
