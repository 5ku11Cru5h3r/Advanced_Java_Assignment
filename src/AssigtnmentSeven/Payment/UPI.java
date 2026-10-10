package AssigtnmentSeven.Payment;

public class UPI implements Payment{

    private double payment;
    private long transactionId;
    private String upiID;

    public UPI(long transactionId, String upiID) {
        this.transactionId = transactionId;
        this.upiID = upiID;
    }

    @Override
    public void processPayment(double amount) {
        this.payment = amount;
        System.out.println("Payment processed of    :   "+ amount);
    }

    @Override
    public void displayPaymentDetails() {
        System.out.println("Display Payment Details :   \n"
            + "Transaction Id   :"+transactionId
            +"\nUpi ID  :"+ upiID
            +"\nPayment :"+ payment
        );
    }

}
