package AssigtnmentSeven.Vehicle;

public abstract class Vehicle {
    long vehicleNo;
    String brand;
    double rentalRate;

    public Vehicle(long vehicleNo, String brand, double rentalRate) {
        this.vehicleNo = vehicleNo;
        this.brand = brand;
        this.rentalRate = rentalRate;
    }

    public void displayVehicleDetails() {
        System.out.println("Vehicle No   :" + vehicleNo);
        System.out.println("Brand   :" + brand);
        System.out.println("Rental Rate :" + rentalRate);
    }

    abstract public double calculateRental(int days);
}
