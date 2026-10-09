package AssignmentSix.Bank;

public class BankAccount {
    long account_number;
    String accountHolderName;
    double balance;

    public BankAccount(long account_number, String accountHolderName, double balance) {
        this.account_number = account_number;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public double calculateInterest() {
        return balance * 0.009;
    }
}