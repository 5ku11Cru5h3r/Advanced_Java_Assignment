package AssigtnmentSeven.ExceptionHandlingElectricityBill;

import java.util.Scanner;

public class ElectricityBill {
    private long consumerNumber;
    private String consumerName;
    private int unitsConsumed;

    public ElectricityBill() {
    }

    public ElectricityBill(long consumerNumber, String consumerName, int unitsConsumed) {
        this.consumerNumber = consumerNumber;
        this.consumerName = consumerName;
        this.unitsConsumed = unitsConsumed;
    }

    public void readDetails(Scanner sc) throws Exception {
        consumerName = sc.nextLine();
        consumerNumber = sc.nextLong();
        unitsConsumed = sc.nextInt();
        if (unitsConsumed < 0) {
            unitsConsumed = 0;
            throw new Exception("units can't be negative");
        }
    }

    public void calculateBill() {
        float bill = 0;
        if (unitsConsumed <= 100) {
            bill = unitsConsumed * 3;
        } else if (unitsConsumed <= 200) {
            bill = 300 + 5 * (unitsConsumed - 100);
        } else {
            bill = 1300 + 8 * (unitsConsumed - 200);
        }
        System.out.println("Bill = " + bill);
    }

    public void displayBill() {
        System.out.println("Consumer Name\t:\t" + consumerName);
        System.out.println("Consumer Number\t:\t" + consumerNumber);
        System.out.println("Units Consumed\t:\t" + unitsConsumed);
        calculateBill();
    }
}
