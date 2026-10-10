package AssigtnmentSeven.Vehicle;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(40000756, "KiaSport", 650, 4, 68);
        System.out.println("_".repeat(60));
        System.out.println("Car Rental  :" + car.calculateRental(6));
        System.out.println("_".repeat(60));
        car.displayVehicleDetails();
    }
}
