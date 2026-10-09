package AssignmentFive;

import java.util.Scanner;
public class AssignmentFiveMain {

    private long global_employeeId = 1_000_000_000;

    /**
     * 
     * Employee
     * 1. Simple Inheritance – Employee and Manager <br>
     * Problem Statement <br>
     * Create a Java program to demonstrate Simple Inheritance using Employee and
     * <br>
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
     * Create a Java program to demonstrate Multilevel Inheritance using Vehicle,
     * <br>
     * Car, and ElectricCar. <br>
     * Superclass – Vehicle <br>
     * PROPERTIES: <br>
     * • vehicleNo <br>
     * • brand <br>
     * • price <br>
     * CONSTRUCTOR: <br>
     * Initialize all Vehicle properties. <br>
     * METHODS: <br>
     * • displayVehicleDetails() <br>
     * • calculateTax() <br>
     * Create an ElectricCar object and display all vehicle, car, and electric-car
     * <br>
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

    /**
     * 3. Hierarchical Inheritance – Bank Account
     * Problem Statement
     * Create a Java program to demonstrate Hierarchical Inheritance using
     * BankAccount as the superclass and SavingsAccount and CurrentAccount as
     * subclasses.
     * Superclass – BankAccount
     * Properties:
     * • accountNo
     * • accountHolderName
     * • balance
     * Constructor:
     * Initialize all BankAccount properties.
     * Methods:
     * • deposit()
     * • withdraw()
     * • displayAccountDetails()
     * Subclass – SavingsAccount
     * Additional Property:
     * • interestRate
     * Constructor:
     * Initialize BankAccount properties using super() and the interest rate.
     * Methods:
     * • calculateInterest()
     * • displaySavingsDetails()
     * Subclass – CurrentAccount
     * Additional Property:
     * • overdraftLimit
     * Constructor:
     * Initialize BankAccount properties using super() and the overdraft limit.
     * Methods:
     * • checkOverdraftLimit()
     * • displayCurrentAccountDetails()
     * Create objects for both SavingsAccount and CurrentAccount and display their
     * respective details.
     * Inheritance
     * BankAccount
     * / \
     * / \
     * SavingsAccount CurrentAccount
     */
    public class BankAccount {
        long accountNo;
        String accountHolderName;
        double balance;

        public BankAccount(long accountNo, String accountHolderName, double balance) {
            this.accountNo = accountNo;
            this.accountHolderName = accountHolderName;
            this.balance = balance;
        }

        public void deposit(Scanner sc) {
            double amount = sc.nextDouble();
            this.balance += amount;
        }

        public void withdraw(Scanner sc) {
            double amount = sc.nextDouble();
            this.balance -= amount;
        }

        public void displayAccountDetails() {
            System.out.println("Account Number   :" + accountNo);
            System.out.println("Account Holder Name :" + accountHolderName);
            System.out.println("Account Balance :" + balance);
        }
    }

    /**
     * SavingsAccount
     */
    public class SavingsAccount extends BankAccount {
        float interestRate;

        public SavingsAccount(long accountNo, String accountHolderName, double balance, float interestRate) {
            super(accountNo, accountHolderName, balance);
            this.interestRate = interestRate;
        }

        public void calculateInterest() {
            System.out.println(this.interestRate * 0.01 * balance);
        }

        public void displaySavingsDetails() {
            super.displayAccountDetails();
            System.out.println("interestRate    :" + interestRate);
        }

    }

    /**
     * CurrentAccount
     */
    public class CurrentAccount extends BankAccount {
        double overdraftLimit;

        public CurrentAccount(long accountNo, String accountHolderName, double balance, double overdraftLimit) {
            super(accountNo, accountHolderName, balance);
            this.overdraftLimit = overdraftLimit;
        }

        public void checkOverdraftLimit() {
            // Balance will be negative so remaining overdraft
            System.out.println("Account balance Overdraft" + (balance + overdraftLimit));
            System.out.println("Account Overdraft Limit" + (overdraftLimit));
        }

        public void displaySavingsDetails() {
            super.displayAccountDetails();
            System.out.println("interestRate    :" + overdraftLimit);
        }
    }

    /**
     * * 4. Hierarchical Inheritance – Product and Specialized Products
     * Problem Statement
     * Create a Java program to demonstrate Hierarchical Inheritance using Product
     * as the superclass and Electronics and Clothing as subclasses.
     * Superclass – Product
     * Properties:
     * • productId
     * • productName
     * • price
     * Constructor:
     * Initialize all Product properties.
     * Methods:
     * • calculateDiscount()
     * • displayProductDetails()
     * Subclass – Electronics
     * Additional Properties:
     * • brand
     * • warranty
     * Constructor:
     * Initialize Product properties using super() and Electronics properties.
     * Methods:
     * • calculateFinalPrice()
     * • displayElectronicsDetails()
     * Subclass – Clothing
     * Additional Properties:
     * • size
     * • material
     * Constructor:
     * Initialize Product properties using super() and Clothing properties.
     * Methods:
     * • calculateFinalPrice()
     * • displayClothingDetails()
     * Create objects for both Electronics and Clothing and display their complete
     * details.
     * Inheritance
     * Product
     * / \
     * / \
     * Electronics Clothing
     */
    /**
     * Product
     */
    public class Product {
        long productId;
        String productName;
        double price;

        public Product(long productId, String productName, double price) {
            this.productId = productId;
            this.productName = productName;
            this.price = price;
        }

        public double calculateDiscount(Scanner sc) {
            System.out.println("Enter the discount %:");
            float discount = sc.nextFloat();
            return price * discount;
        }

        public void displayProductDetails() {
            System.out.println("productId\t:" + productId);
            System.out.println("productName\t:" + productName);
            System.out.println("price\t:" + price);
        }
    }

    /**
     * Electronics
     */
    public class Electronics extends Product {

        String brand;
        int warranty;

        public Electronics(long productId, String productName, double price, String brand, int warranty) {
            super(productId, productName, price);
            this.brand = brand;
            this.warranty = warranty;
        }

        public void displayElectronicsDetails() {
            super.displayProductDetails();
            System.out.println("Brand   :" + brand);
            System.out.println("Warranty   :" + warranty);
        }

        public double calculateFinalPrice(Scanner sc) {
            return price - super.calculateDiscount(sc);
        }
    }

    /**
     * Clothing
     */
    public class Clothing extends Product {
        int size;
        String material;

        public Clothing(long productId, String productName, double price, int size, String material) {
            super(productId, productName, price);
            this.size = size;
            this.material = material;
        }

        public double calculateFinalPrice(Scanner sc) {
            return price - super.calculateDiscount(sc);
        }

        public void displayClothingDetails() {
            super.displayProductDetails();
            System.out.println("Size   :" + size);
            System.out.println("Material   :" + material);
        }
    }

    /**
     * ________________________________________
     * 5. Hierarchical Inheritance – Hospital Management
     * Problem Statement
     * Create a Java program to demonstrate Hierarchical Inheritance using Person as
     * the superclass and Doctor and Patient as subclasses.
     * Superclass – Person
     * Properties:
     * • personId
     * • personName
     * • age
     * Constructor:
     * Initialize all Person properties.
     * Methods:
     * • displayPersonDetails()
     * • checkAge()
     * Subclass – Doctor
     * Additional Properties:
     * • specialization
     * • consultationFee
     * Constructor:
     * Initialize Person properties using super() and Doctor-specific properties.
     * Methods:
     * • calculateConsultationAmount()
     * • displayDoctorDetails()
     * Subclass – Patient
     * Additional Properties:
     * • disease
     * • roomNumber
     * Constructor:
     * Initialize Person properties using super() and Patient-specific properties.
     * Methods:
     * • calculateRoomCharge()
     * • displayPatientDetails()
     * Create objects for both Doctor and Patient and display their complete
     * details.
     * Inheritance
     * Person
     * / \
     * / \
     * Doctor Patient
     * 
     */

    /**
     * Person
     */
    public class Person {
        long personId;
        String personName;
        int age;

        public Person(long personId, String personName, int age) {
            this.personId = personId;
            this.personName = personName;
            this.age = age;
        }

        public void displayPersonDetails() {
            System.out.println("PersonId   :" + personId);
            System.out.println("PersonName   :" + personName);
            System.out.println("Age   :" + age);
        }

        public String checkAge() {
            if (age > 17)
                return "Adult";
            return "Child";
        }
    }

    /**
     * Doctor
     */
    public class Doctor extends Person {
        String specialization;
        double consultationFee;

        public Doctor(long personId, String personName, int age, String specialization, double consultationFee) {
            super(personId, personName, age);
            this.specialization = specialization;
            this.consultationFee = consultationFee;
        }

        public double calculateConsultationAmount() {
            return consultationFee - 0.10 * consultationFee;
        }

        public void displayDoctorDetails() {
            super.displayPersonDetails();
            System.out.println("Specialization   :" + specialization);
            System.out.println("Consultation Fee   :" + consultationFee);
        }
    }

    public class Patient extends Person {
        String disease;
        double roomNumber;

        public Patient(long personId, String personName, int age, String specialization, double roomNumber) {
            super(personId, personName, age);
            this.disease = specialization;
            this.roomNumber = roomNumber;
        }

        public double calculateRoomCharge(int timeInDays) {
            return 400 * timeInDays ;
        }

        public void displayPatientDetails() {
            super.displayPersonDetails();
            System.out.println("Disease   :" + disease);
            System.out.println("Room Number   :" + roomNumber);
        }
    }

    public static void main(String[] args) {
        AssignmentFiveMain all = new AssignmentFiveMain();
        Manager m = all.new Manager("Manoj", 10000, "HR", 500);
        m.displayEmployeeDetails();
        System.out.println(m.calculateTotalSalary());
    }
}
