package AssignmentSix;

public class ElectricityBill {
    long consumerNo;
    String consumerName;
    int unitsConsumed;

    public ElectricityBill(String consumerName, int unitsConsumed) {
        this.consumerNo = ++AssignmentSixMain.consumer_number_global;
        this.consumerName = consumerName;
        this.unitsConsumed = unitsConsumed;
    }

    public double calculateBill() {
        return unitsConsumed*8;
    }

    public double calculateBill(double rate) {
        return unitsConsumed*rate;
    }
    
    public double calculateBill(double rate, int units) {
        return units*rate;
    }
}
