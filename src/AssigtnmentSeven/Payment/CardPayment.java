package AssigtnmentSeven.Payment;

import java.math.BigInteger;

/**
 * CardPayment
 */
public class CardPayment implements Payment {

    private long transactionId;
    private BigInteger cardNumber;
    private double payment;

    public CardPayment(long transactionId, BigInteger cardNumber) {
        this.transactionId = transactionId;
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        this.payment = amount;
        System.out.println("Payment processed of    :   " + amount);
    }

    @Override
    public void displayPaymentDetails() {
        System.out.println("Display Payment Details :   \n"
                + "Transaction Id   :" + transactionId
                + "\nCard Number  :" + cardNumber
                + "\nPayment :" + payment);
    }

}
