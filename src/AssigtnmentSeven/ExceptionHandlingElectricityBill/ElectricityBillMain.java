package AssigtnmentSeven.ExceptionHandlingElectricityBill;

import java.util.Scanner;

public class ElectricityBillMain {
    public static void main(String[] args) {
        ElectricityBill E = new ElectricityBill();
        try (Scanner sc = new Scanner(System.in)) {
            E.readDetails(sc);
            E.calculateBill();
            E.displayBill();
        }
        catch (Exception e) {
        System.out.println("Thrown Error :"+e.toString());
        }
        finally {
            System.out.println("Electricity Bill Processed");
        }
    }
}
