package AssignmentSix.Vehicle;

/**
 * 5. Vehicle – Rental Charge Calculation
 * 
 * Problem Statement<br>
 * Create a Java program to demonstrate Method Overriding using hierarchical<br>
 * inheritance.<br>
 * Create a superclass Vehicle.<br>
 * Superclass – Vehicle<br>
 * Properties:<br>
 * vehicleNo<br>
 * brand<br>
 * baseRate<br>
 * Create a constructor to initialize these properties.<br>
 * Create the method:<br>
 * calculateRental()<br>
 * Inheritance
 * 
 * <pre>
                 Vehicle
                /       \
               /         \
             Car         Bike
              ↓            ↓
      calculateRental()  calculateRental()
          Override          Override
 * </pre>
 */
public class Vehicle {
    long vehicleNo;
    String brand;
    double baseRate;

    public Vehicle(long vehicleNo, String brand, double baseRate) {
        this.vehicleNo = vehicleNo;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    public double calculateRental(double VehicleRate) {
        return VehicleRate;
    }
}
