package AssignmentSix;

import AssignmentSix.Bank.*;

public class AssignmentSixMain {
    static long consumer_number_global = 1_000_000_000;

    public static void main(String[] args) {

        /**
         * Part A
         */
        ElectricityBill e = new ElectricityBill("Rajesh", 107);
        System.out.println(e.calculateBill());
        System.out.println(e.calculateBill(3));
        System.out.println(e.calculateBill(4, 50));

        SavingsAccount s = new SavingsAccount(10001, "Prateek", 100_000, 5);
        s.calculateInterest();

        
    }
}
