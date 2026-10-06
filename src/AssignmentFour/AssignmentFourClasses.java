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
     * BankAccount Class
     */
    private static int account_no_global = 1_000_000_000;

    public class BankAccount {
        BankAccount() {
            account_no_global++;
        }

        long account_no;
        String customer_name = null;
        long balance = 0;

        public void read(String customer_name) {
            this.account_no = account_no_global;
            this.customer_name = customer_name;
            this.balance = 0;
        }

        public void deposit(double cash) {
            this.balance += cash;
        }

        public void withdraw(double cash) {
            this.balance += cash;
        }

        public void display() {
            System.out.println("Account Number: " + this.account_no);
            System.out.println("Name: " + this.customer_name);
            System.out.println("Balance: " + this.balance);
        }
    }

    /**
     * Product
     */
    long product_id_global;

    public class Product {
        Product() {
            product_id_global++;
        }

        long product_id;
        String product_name;
        double product_price;
        int quantity;

        public void read(String productName, double product_price, int quantity) {
            this.product_id = product_id_global;
            this.product_name = productName;
            this.product_price = product_price;
            this.quantity = quantity;
        }

        public void calculateBill() {
            System.out.println((double) this.product_price * this.quantity);
        }

        public void display() {
            System.out.println("Product ID: " + this.product_id);
            System.out.println("Name: " + this.product_name);
            System.out.println("Price: " + this.product_price);
            System.out.println("Quantity: " + this.quantity);
        }
    }

    /**
     * ElectricityBill
     */
    private static int consumer_number_global = 100;

    public class ElectricityBill {
        int consumer_number;
        String consumerName;
        int quantity;

        ElectricityBill(String consumerName, int quantity) {
            consumer_number_global++;
            this.consumer_number = consumer_number_global;
            this.consumerName = consumerName;
            this.quantity = quantity;
        }

        public void calculateBill() {
            float bill = 0;
            if (quantity <= 100) {
                bill = quantity * 2;
            } else if (quantity <= 200) {
                bill = 200 + 3 * (quantity - 100);
            } else {
                bill = 500 + 5 * (quantity - 300);
            }
            System.out.println(consumerName + "'s Bill :" + bill);
        }

        public void display() {
            System.out.println("Consumer ID : " + this.consumer_number);
            System.out.println("Name: " + this.consumerName);
            System.out.println("Quantity: " + this.quantity);
        }
    }

    /**
     * MovieTicket
     */
    public class MovieTicket {
        String customer_name;
        String movie_name;
        int number_of_tickets;
        float ticket_price;

        MovieTicket(String customer_name, String movie_name, int number_of_tickets, float ticket_price) {
            this.customer_name = customer_name;
            this.ticket_price = ticket_price;
            this.number_of_tickets = number_of_tickets;
            this.movie_name = movie_name;
        }

        public void calculateAmount() {
            float x = this.ticket_price * this.number_of_tickets;
            System.out.println("Price :" + x);
        }

        public void display() {
            System.out.println("Customer Name :" + this.customer_name);
            System.out.println("Price of a ticket :" + this.ticket_price);
            System.out.println("Number of Tickets" + this.number_of_tickets);
            System.out.println("Movie Name :" + this.movie_name);
        }
    }
}
