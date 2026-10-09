/**
 * Java Assignment 5– Inheritance
 * ________________________________________

3. Hierarchical Inheritance – Bank Account <br>
Problem Statement <br>
Create a Java program to demonstrate Hierarchical Inheritance using BankAccount as the superclass and SavingsAccount and CurrentAccount as subclasses. <br>
Superclass – BankAccount <br>
Properties: <br>
•	accountNo <br>
•	accountHolderName <br>
•	balance <br>
Constructor: <br>
Initialize all BankAccount properties. <br>
Methods: <br>
•	deposit() <br>
•	withdraw() <br>
•	displayAccountDetails() <br>
Subclass – SavingsAccount <br>
Additional Property: <br>
•	interestRate <br>
Constructor: <br>
Initialize BankAccount properties using super() and the interest rate. <br>
Methods: <br>
•	calculateInterest() <br>
•	displaySavingsDetails() <br>
Subclass – CurrentAccount <br>
Additional Property: <br>
•	overdraftLimit <br>
Constructor: <br>
Initialize BankAccount properties using super() and the overdraft limit. <br>
Methods: <br>
•	checkOverdraftLimit() <br>
•	displayCurrentAccountDetails() <br>
Create objects for both SavingsAccount and CurrentAccount and display their respective details. <br>
Inheritance <br>
             BankAccount <br>
             /         \ <br>
            /           \ <br>
SavingsAccount      CurrentAccount <br>
________________________________________ <br>
4. Hierarchical Inheritance – Product and Specialized Products <br>
Problem Statement <br>
Create a Java program to demonstrate Hierarchical Inheritance using Product as the superclass and Electronics and Clothing as subclasses. <br>
Superclass – Product <br>
Properties: <br>
•	productId <br>
•	productName <br>
•	price <br>
Constructor: <br>
Initialize all Product properties. <br>
Methods: <br>
•	calculateDiscount() <br>
•	displayProductDetails() <br>
Subclass – Electronics <br>
Additional Properties: <br>
•	brand <br>
•	warranty <br>
Constructor: <br>
Initialize Product properties using super() and Electronics properties. <br>
Methods: <br>
•	calculateFinalPrice() <br>
•	displayElectronicsDetails() <br>
Subclass – Clothing <br>
Additional Properties: <br>
•	size <br>
•	material <br>
Constructor: <br>
Initialize Product properties using super() and Clothing properties. <br>
Methods: <br>
•	calculateFinalPrice() <br>
•	displayClothingDetails() <br>
Create objects for both Electronics and Clothing and display their complete details. <br>
Inheritance <br>
              Product <br>
              /     \ <br>
             /       \ <br>
    Electronics     Clothing <br>
________________________________________ <br>
5. Hierarchical Inheritance – Hospital Management <br>
Problem Statement <br>
Create a Java program to demonstrate Hierarchical Inheritance using Person as the superclass and Doctor and Patient as subclasses. <br>
Superclass – Person <br>
Properties: <br>
•	personId <br>
•	personName <br>
•	age <br>
Constructor: <br>
Initialize all Person properties. <br>
Methods: <br>
•	displayPersonDetails() <br>
•	checkAge() <br>
Subclass – Doctor <br>
Additional Properties: <br>
•	specialization <br>
•	consultationFee <br>
Constructor: <br>
Initialize Person properties using super() and Doctor-specific properties. <br>
Methods: <br>
•	calculateConsultationAmount() <br>
•	displayDoctorDetails() <br>
Subclass – Patient <br>
Additional Properties: <br>
•	disease <br>
•	roomNumber <br>
Constructor: <br>
Initialize Person properties using super() and Patient-specific properties. <br>
Methods: <br>
•	calculateRoomCharge() <br>
•	displayPatientDetails() <br>
Create objects for both Doctor and Patient and display their complete details. <br>
Inheritance <br>
              Person <br>
              /    \ <br>
             /      \ <br>
        Doctor      Patient <br>
________________________________________ <br>

 * 
 */
package AssignmentFive;

public class AssignmentFiveMain {

    private long global_employeeId = 1_000_000_000;

    /**
     * 
     * Employee
     * 1. Simple Inheritance – Employee and Manager <br>
     * Problem Statement <br>
     * Create a Java program to demonstrate Simple Inheritance using Employee and <br>
     * Manager classes. <br>
     * Superclass – Employee <br>
     * Properties: <br>
     * • employeeId <br>
     * • employeeName <br>
     * • basicSalary <br>
     * Constructor: <br>
     * Initialize all the Employee properties. <br>
     * Methods: <br>
     * • calculateSalary() <br>
     * • displayEmployeeDetails() <br>
     */
    public class Employee {
        long employeeId;
        String employeeName;
        float basicSalary;

        Employee(String employeeName, float basicSalary) {
            this.employeeId = ++global_employeeId;
            this.employeeName = employeeName;
            this.basicSalary = basicSalary;
        }

        public float calculateSalary(int months) {
            return basicSalary * months;
        }

        public void displayEmployeeDetails() {
            System.out.println("Employee Id" + this.employeeId);
            System.out.println("Employee Name" + this.employeeName);
            System.out.println("Basic Salary" + this.basicSalary);
        }
    }

    /**
     * Manager
     * * Subclass – Manager
     * Additional Properties:
     * • department
     * • bonus
     * Constructor:
     * Initialize the Employee properties using super() and Manager-specific
     * properties.
     * Methods:
     * • calculateTotalSalary()
     * • displayManagerDetails()
     * The program should display the employee ID, name, basic salary, department,
     * bonus, and total salary.
     */

    public class Manager extends Employee {
        String department;
        double bonus;

        Manager(String employeeName, float basicSalary, String department, double bonus) {
            super(employeeName, basicSalary);
            this.department = department;
            this.bonus = bonus;
        }

        public double calculateTotalSalary() {
            return bonus + super.basicSalary;
        }

        public void displayEmployeeDetails() {
            System.out.println("Employee Id" + this.employeeId);
            System.out.println("Employee Name" + this.employeeName);
            System.out.println("Basic Salary" + this.basicSalary);
        }
    }

    /**
     * 
     * Vehicle
     * 2. Multilevel Inheritance – Vehicle, Car and ElectricCar <br>
     * Problem Statement <br>
     * Create a Java program to demonstrate Multilevel Inheritance using Vehicle, <br>
     * Car, and ElectricCar. <br>
     * Superclass – Vehicle <br>
     * PROPERTIES:  <br>
     * • vehicleNo <br>
     * • brand <br>
     * • price <br>
     * CONSTRUCTOR: <br>
     * Initialize all Vehicle properties. <br>
     * METHODS: <br>
     * • displayVehicleDetails() <br>
     * • calculateTax() <br>
     * Create an ElectricCar object and display all vehicle, car, and electric-car <br>
     * details. <br>
     * 
     */
    public class Vehicle {
        long vehicleNo;
        String brand;
        float price;

        public Vehicle(long vehicleNo, String brand, float price) {
            this.vehicleNo = vehicleNo;
            this.brand = brand;
            this.price = price;
        }

        public void displayVehicleDetails() {
            System.out.println("Vehicle No : " + vehicleNo);
            System.out.println("Vehicle Brand : " + brand);
            System.out.println("Vehicle Price : " + price);
        }

        public float calculateTax(float taxRate) {
            return price * taxRate;
        }
    }

    /**
     * Subclass – Car <br>
     * Inherit from Vehicle. <br>
     * Additional Properties: <br>
     * • model <br>
     * • fuelType <br>
     * CONSTRUCTOR: <br>
     * Initialize Vehicle properties using super() and Car properties. <br>
     * METHODS: <br>
     * • displayCarDetails() <br>
     * • calculateInsurance() <br>
     */
    public class Car extends Vehicle {
        String model;
        String fuelType;

        public Car(long vehicleNo, String brand, float price, String model, String fuelType) {
            super(vehicleNo, brand, price);
            this.model = model;
            this.fuelType = fuelType;
        }

        public void displayCarDetails() {
            System.out.println("Car Vehicle No : " + vehicleNo);
            System.out.println("Car Vehicle Brand : " + brand);
            System.out.println("Car Vehicle Price : " + price);
            System.out.println("Car Model : " + model);
            System.out.println("Car Fuel Type : " + fuelType);
        }

        public float calculateInsurance(float insuranceRate) {
            return price * insuranceRate;
        }
    }

    /**
     * * Subclass – ElectricCar <br>
     * Inherit from Car. <br>
     * Additional Properties: <br>
     * • batteryCapacity <br>
     * • chargingTime <br>
     * CONSTRUCTOR: <br>
     * Initialize all inherited and ElectricCar-specific properties. <br>
     * METHODS: <br>
     * • calculateRange() <br>
     * • displayElectricCarDetails() <br>
     */
    public class ElectricCar extends Car {
        int batteryCapacity;
        float chargingTime;

        public ElectricCar(long vehicleNo, String brand, float price, String model, String fuelType,
                int batteryCapacity, float chargingTime) {
            super(vehicleNo, brand, price, model, fuelType);
            this.batteryCapacity = batteryCapacity;
            this.chargingTime = chargingTime;
        }

        public double calculateRange() {
            return batteryCapacity * 3.5;
        }

        public void displayElectricCarDetails() {
            System.out.println("Car Vehicle No : " + vehicleNo);
            System.out.println("Car Vehicle Brand : " + brand);
            System.out.println("Car Vehicle Price : " + price);
            System.out.println("Car Model : " + model);
            System.out.println("Car Fuel Type : " + fuelType);
            System.out.println("Electric Car battery Capacity: " + batteryCapacity);
            System.out.println("Electric Car charging Time: " + chargingTime);
        }
    }

    public static void main(String[] args) {
        AssignmentFiveMain all = new AssignmentFiveMain();
        Manager m = all.new Manager("Manoj", 10000, "HR", 500);
        m.displayEmployeeDetails();
        System.out.println(m.calculateTotalSalary());
    }
}
