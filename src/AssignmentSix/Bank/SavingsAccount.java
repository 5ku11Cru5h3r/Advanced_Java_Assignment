package AssignmentSix.Bank;

/**
 * SavingsAccount
 */
public class SavingsAccount extends BankAccount {

    double interestRate;

    public SavingsAccount(long account_number, String accountHolderName, double balance, double interestRate) {
        super(account_number, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return balance*interestRate / 100;
    }
}