package AssignmentSix;

import AssignmentSix.Bank.*;
import AssignmentSix.Paitent.*;

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

        // Create objects for both InPatient and OutPatient and display their respective
        // treatment costs.

        InPaitent aInPaitent = new InPaitent(10011003, "Kunal", 67, 90, 300);
        System.out.println("a InPaitent cost of admission :" + aInPaitent.calculateTreatmentCost());

        OutPaitent aOutPaitent = new OutPaitent(18189, "Joan", 7, 600, 1300);
        System.out.println("a OutPaitent cost of admission :" + aOutPaitent.calculateTreatmentCost());
    }
}
