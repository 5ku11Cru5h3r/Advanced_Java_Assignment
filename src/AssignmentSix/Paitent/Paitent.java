/**
4. Hospital Management – Treatment Cost
Problem Statement
Create a Java program to demonstrate Method Overriding using hierarchical inheritance.
Create a superclass Patient.





*/

package AssignmentSix.Paitent;

/**
 * Superclass – Patient<br>
 * <hr>
 * Properties:<br>
 * patientId<br>
 * patientName<br>
 * age<br>
 * <hr>
 * Create a constructor to initialize these properties.<br>
 * Create the method:<br>
 * calculateTreatmentCost()<br>
 * The superclass should provide a general treatment cost calculation.<br>
 * Create objects for both InPatient and OutPatient and display their respective
 * treatment costs.<br>
 * <div style="text-align: center; font-family: monospace;">
 * 
 * <pre style="display: inline-block; text-align: center; margin: 0;
 * line-height: 1.4;">
          Inheritance
            Patient
           /       \
          /         \
    InPatient      OutPatient
        ↓              ↓
calculateTreatmentCost()  calculateTreatmentCost()
    Override        Override
 * </pre>
 * 
 * </div>
 * 
 */
public class Paitent {
    long paitentId;
    String patientName;
    int age;

    public Paitent(long paitentId, String patientName, int age) {
        this.paitentId = paitentId;
        this.patientName = patientName;
        this.age = age;
    }

    public double calculateTreatmentCost() {
        return 1000;
    }
}