package AssignmentFour;

import AssignmentFour.AssignmentFourClasses.*;

public class AssignmentFourMain {
    public static void main(String[] args) {

        AssignmentFourClasses AllClasses = new AssignmentFourClasses();
        Employee em_1 = AllClasses.new Employee();
        em_1.read("Raghav", 1000.98, 10, 80);
        em_1.display();
        em_1.calculateSalary();
        ElectricityBill p1 = AllClasses.new ElectricityBill("Dheeraj Kumar", 700);
        p1.display();
        p1.calculateBill();
        ElectricityBill p2 = AllClasses.new ElectricityBill("Neeraj Kumar", 900);
        p2.display();
        p2.calculateBill();
    }
}
