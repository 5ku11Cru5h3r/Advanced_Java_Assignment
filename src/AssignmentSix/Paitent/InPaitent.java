package AssignmentSix.Paitent;

/**
 * InPaitent
 * <div style="text-align: center; font-family: monospace;">
 * <pre style="display: inline-block; text-align: center; margin: 0;line-height: 1.4;">
 * Subclass – InPatient
 * Additional properties:
 * numberOfDays
 * roomCharge
 * Override:
 * calculateTreatmentCost()
 * to calculate the treatment cost including room charges based on the number of
 * days.
 * 
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
public class InPaitent extends Paitent {
    int numberOfDays;
    double roomCharge;

    public InPaitent(long paitentId, String patientName, int age, int numberOfDays, double roomCharge) {
        super(paitentId, patientName, age);
        this.numberOfDays = numberOfDays;
        this.roomCharge = roomCharge;
    }

    @Override
    public double calculateTreatmentCost() {
        return numberOfDays * roomCharge;
    }
}