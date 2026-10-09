package AssignmentSix.Vehicle;

/**
 * Car
 * Subclass – Car <br>
 * Additional properties: <br>
 * - numberOfDays <br>
 * - insuranceCharge <br>
 * Override: <br>
 * - calculateRental() <br>
 * to calculate the rental amount based on the number of days and insurance <br>
 * charge. <br>
 * 
 * <pre>
 * Inheritance
                 Vehicle
                /       \
               /         \
             Car         Bike
              ↓            ↓
      calculateRental()  calculateRental()
          Override          Override
 * </pre>
 */
public class Car extends Vehicle {
    int numberOfDays;
    double insuranceCharge;

    public Car(long vehicleNo, String brand, double baseRate, int numberOfDays, double insuranceCharge) {
        super(vehicleNo, brand, baseRate);
        this.numberOfDays = numberOfDays;
        this.insuranceCharge = insuranceCharge;
    }
    
    public double calculateRental() {
        // TODO Auto-generated method stub
        return (super.calculateRental(900) + insuranceCharge) * numberOfDays;
    }
}
