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

        BankAccount Acc = AllClasses.new BankAccount();
        Acc.read("Anuj Patel");
        Acc.deposit(1990);
        Acc.display();

        BankAccount[] corpBankAccount = new BankAccount[] {
                AllClasses.new BankAccount(),
                AllClasses.new BankAccount(),
                AllClasses.new BankAccount(),
                AllClasses.new BankAccount(),
                AllClasses.new BankAccount()
        };

        corpBankAccount[0].read("Yash Saxena");
        corpBankAccount[1].read("Yash Jha");
        corpBankAccount[2].read("Yash Chauhan");
        corpBankAccount[3].read("Yash Pandey");
        corpBankAccount[4].read("Yashika Chaubey");

        // First day of month
        corpBankAccount[0].deposit(1_000_000_0);
        corpBankAccount[1].deposit(1_000_000_0);
        corpBankAccount[2].deposit(1_00000);
        corpBankAccount[3].deposit(1_00000);
        corpBankAccount[4].deposit(1_00000);

        corpBankAccount[0].display();
        corpBankAccount[1].display();
        corpBankAccount[2].display();
        corpBankAccount[3].display();
        corpBankAccount[4].display();

    }
}
