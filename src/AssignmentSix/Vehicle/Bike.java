package AssignmentSix.Vehicle;

/**
 * Bike
 * Subclass – Bike<br>
 * 1. Additional properties:<br>
 * - numberOfDays<br>
 * - helmetCharge<br>
 * 2. Override:<br>
 * - calculateRental()<br>
 * to calculate the rental amount based on the number of days and helmet
 * charge.<br>
 * Create objects for both Car and Bike and display their rental charges.<br>
 * 
 * <pre>
Inheritance
                 Vehicle
                /       \
               /         \
             Car         Bike
              ↓            ↓
      calculateRental()  calculateRental()
          Override          Override
 * </pre>
 */
public class Bike extends Vehicle {
    int numberOfDays;
    double helmetCharge;

    public Bike(long vehicleNo, String brand, double baseRate, int numberOfDays, double helmetCharge) {
        super(vehicleNo, brand, baseRate);
        this.numberOfDays = numberOfDays;
        this.helmetCharge = helmetCharge;
    }

    public double calculateRental() {
        // TODO Auto-generated method stub
        return (super.calculateRental(200) + helmetCharge) * numberOfDays;
    }
}
