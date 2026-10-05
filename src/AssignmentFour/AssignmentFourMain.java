package AssignmentFour;
import AssignmentFour.AssignmentFourClasses.Employee;

public class AssignmentFourMain {
    public static void main(String[] args) {
        AssignmentFourClasses Company = new AssignmentFourClasses();
        Employee em_1= Company.new Employee();
        em_1.read("Raghav", 1000.98, 10, 80);
        em_1.calculateSalary();
        em_1.display();
    }
}
