package AssignmentSix.Paitent;

/**
 * OutPaitent
 * Subclass – OutPatient<br>
 * Additional properties:<br>
 * consultationFee<br>
 * medicineCost<br>
 * Override:<br>
 * calculateTreatmentCost()<br>
 * to calculate the treatment cost including consultation and medicine
 * charges.\<br>
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
public class OutPaitent extends Paitent {
    double consultationFee;
    double medicineCost;

    public OutPaitent(long paitentId, String patientName, int age, double consultationFee, double medicineCost) {
        super(paitentId, patientName, age);
        this.consultationFee = consultationFee;
        this.medicineCost = medicineCost;
    }
    @Override
    public double calculateTreatmentCost() {
        return consultationFee + medicineCost;
    }
}