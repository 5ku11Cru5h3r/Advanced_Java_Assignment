package AssigtnmentSeven.Vehicle;

public class Car extends Vehicle {
    int numberOfSeats;
    double insuranceCharge;

    public Car(long vehicleNo, String brand, double rentalRate, int numberOfSeats, double insuranceCharge) {
        super(vehicleNo, brand, rentalRate);
        this.numberOfSeats = numberOfSeats;
        this.insuranceCharge = insuranceCharge;
    }

    public double calculateRental(int days) {
        return rentalRate * days;
    }

}
