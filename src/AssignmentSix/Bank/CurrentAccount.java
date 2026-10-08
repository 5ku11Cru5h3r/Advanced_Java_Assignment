package AssignmentSix.Bank;

/**
 * CurrentAccount
 */
public class CurrentAccount extends BankAccount {
    double interestRate;

    public CurrentAccount(long account_number, String accountHolderName, double balance, double interestRate) {
        super(account_number, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

}
