package AssignmentFour;

public class AssignmentFourClasses {
    /**
     * Employee Class
     * Name
     * Basic
     * Salary
     * HRA
     * DA
     */
    private static int emp_ID_global = 1000;

    public class Employee {
        Employee() {
            emp_ID_global++;
        }

        int emp_id;
        String emp_name = null;
        double salary = 0;
        double hra = 0;
        double da = 0;

        public void read(String nm, double salary, double hra, double da) {
            this.emp_id = emp_ID_global;
            this.emp_name = nm;
            this.salary = salary;
            this.hra = hra;
            this.da = da;
        }

        public void calculateSalary() {
            System.out.println(
                    "Calculated Salary\t:\t" + ((double) this.salary + (double) this.da + (double) this.hra));
        }

        public void display() {
            System.out.println("Employee ID: " + this.emp_id);
            System.out.println("Employee Name: " + this.emp_name);
            System.out.println("Employee Salary: " + this.salary);
            System.out.println("Employee HRA: " + this.hra);
            System.out.println("Employee DA: " + this.da);
        }
    }

    /**
     * BankAccount
     */
    private static int account_no_global = 1_000_000_000;

    public class BankAccount {
        BankAccount() {
            account_no_global++;
        }

        long account_no;
        String customer_name = null;
        long balance = 0;

        public void read(String customer_name, long balance) {
            this.account_no = account_no_global;
            this.customer_name = customer_name;
            this.balance = balance;
        }
        public void display() {
            System.out.println("Account Number: " + this.account_no);
            System.out.println("Name: " + this.customer_name);
            System.out.println("Balance: " + this.balance);
        }
    }
}
