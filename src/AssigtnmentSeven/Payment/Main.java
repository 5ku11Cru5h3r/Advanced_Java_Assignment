package AssigtnmentSeven.Payment;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("choose UPI(1) or Card(2)");
        System.out.println("Enter Choice:");
        int choice = 0;
        try (Scanner sc = new Scanner(System.in)) {
            choice = sc.nextInt();
            String identification;
            long transactionId;
            Payment p = null;
            switch (choice) {
                case 1:
                    transactionId = sc.nextLong();
                    identification = sc.nextLine();
                    p = new UPI(transactionId, identification);
                    break;
                case 2:
                    transactionId = sc.nextLong();
                    identification = sc.nextLine();
                    p = new CardPayment(transactionId, new BigInteger(identification));
                    break;
                default:
                    System.out.println("choose UPI(1) or Card(2)");
                    break;
            }
            p.displayPaymentDetails();
        }

    }
}
