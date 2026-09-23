import java.io.IOException;
import java.util.Scanner;

public class AssignmentTwo {
    public static void main(String[] args) throws InterruptedException, IOException {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                System.out.println("Enter your choice...(1-10)");
                System.out.println("Ctrl+C or invalid choice to exit");
                int choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    // case 0 -> HelloWorld();
                    case 1 -> {
                        float bill = electricity_bill(sc);
                        System.out.println("Bill\n" + bill);
                    }
                    case 2 -> student_grade(sc);
                    case 3 -> product_discount(sc);
                    case 4 -> largest_of_two(sc);
                    case 5 -> voting_elligibilty(sc);
                    case 6 -> salary_calculation(sc);
                    case 7 -> temprature_conversion(sc);
                    case 8 -> simple_calculator(sc);
                    case 9 -> {
                        System.out.print("Enter passenger name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter passenger age: ");
                        int age = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Passenger Name: " + name);
                        System.out.println("Age: " + age);
                        int fare = (int) bus_ticket(age);
                        System.out.println("Ticket Fare: " + fare);
                    }
                    case 10 -> {
                        System.out.print("Enter mobile number: ");
                        long mobileNumber = sc.nextLong();

                        System.out.print("Enter data usage in GB: ");
                        double dataUsedGB = sc.nextDouble();

                        double charge = calculateCharge(dataUsedGB);

                        System.out.println("Mobile Number: " + mobileNumber);
                        System.out.println("Data Usage: " + dataUsedGB + " GB");
                        System.out.println("Final Charge: " + charge);
                    }
                    default -> throw new AssertionError();
                }
                sc.nextLine();
            }
        } catch (AssertionError e) {
            // e.printStackTrace();
            System.out.println("Invalid choice... Exiting");
        }
    }

    private static double calculateCharge(double dataUsedGB) {
        // TODO Auto-generated method stub
        if (dataUsedGB <= 1) {
            return 50;
        } else if (dataUsedGB <= 5) {
            return 100;
        } else if (dataUsedGB <= 10) {
            return 200;
        } else {
            return 350;
        }
    }

    private static Object bus_ticket(int age) {
        // TODO Auto-generated method stub
        if (age < 5) {
            return 0;
        } else if (age <= 12) {
            return 20;
        } else if (age <= 59) {
            return 40;
        } else {
            return 25;
        }
    }

    private static Object simple_calculator(Scanner sc) {
        // TODO Auto-generated method stub
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);
        if (operator == '+') {
            return num1 + num2;
        } else if (operator == '-') {
            return num1 - num2;
        } else if (operator == '*') {
            return num1 * num2;
        } else if (operator == '/') {
            if (num2 == 0) {
                System.out.println("Division by zero is not allowed.");
                return 0;
            }
            return num1 / num2;
        } else if (operator == '%') {
            if (num2 == 0) {
                System.out.println("Modulo by zero is not allowed.");
                return 0;
            }
            return num1 % num2;
        } else {
            System.out.println("Invalid operator.");
            return 0;
        }
        // throw new UnsupportedOperationException("Unimplemented method
        // 'simple_calculator'");
    }

    private static Object temprature_conversion(Scanner sc) {
        // TODO Auto-generated method stub
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        sc.nextLine();
        return (celsius * 9.0 / 5.0) + 32;
    }

    private static Object salary_calculation(Scanner sc) {
        // TODO Auto-generated method stub
        System.out.print("Enter basic salary: ");
        double basicSalary = sc.nextDouble();
        sc.nextLine();
        double hra;
        if (basicSalary >= 50000) {
            hra = basicSalary * 0.20;
        } else {
            hra = basicSalary * 0.10;
        }

        return basicSalary + hra;
    }

    private static Object voting_elligibilty(Scanner sc) {
        // TODO Auto-generated method stub
        try {
            System.out.println("== Program to CHECK AGE ELLIGIBILITY ==");
            System.out.println("Enter AGE:");
            int first = sc.nextInt();
            sc.nextLine();
            if (first > 17) {
                System.out.println("== AGE ELLIGIBLE ==");
                return true;
            } else {
                System.out.println("== AGE NOT ELLIGIBLE ==");
                return false;
            }
        } catch (Exception e) {
            System.out.println("Exception occured" + e.getMessage());
            throw e;
        }
    }

    private static int largest_of_two(Scanner sc){
        // TODO Auto-generated method stub
        try {
            System.out.println("== Program to CHECK WHICH NUMBER IS GREATER ==");
            System.out.println("Enter A NUMBER:");
            int first = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter ANOTHER NUMBER:");
            int second = sc.nextInt();
            sc.nextLine();
            if (first > second) {
                System.out.println("== FIRST IS GREATER ==");
                return 1;
            } else if (first < second) {
                System.out.println("== SECOND IS GREATER ==");
                return 2;
            } else {
                System.out.println("== FIRST IS EQUAL TO SECOND ==");
                return 0;
            }
        } catch (Exception e) {
            // TODO: handle exception
            return -1;
        }

        // throw new UnsupportedOperationException("Unimplemented method
        // 'largest_of_two'");
    }

    /**
     * @param sc
     * 
     * @return final_price
     */
    private static Object product_discount(Scanner sc) {
        double final_price = -1;
        try {
            System.out.println("Enter your purchase amount");
            double purchase_amount = sc.nextDouble();
            sc.nextLine();
            if (purchase_amount >= 10000) {
                final_price = purchase_amount * 0.8;
            } else if (purchase_amount >= 5000) {
                final_price = purchase_amount * 0.9;
            } else if (purchase_amount >= 2000) {
                final_price = purchase_amount * 0.95;
            } else
                final_price = purchase_amount;
        } catch (Exception e) {
            System.out.println("Exception occurred :" + e);
        }
        // throw new UnsupportedOperationException("Unimplemented method
        // 'product_discount'");
        return final_price;
    }

    /**
     * @param sc : scanner object : to read marks
     * @return grade of the student based on marks
     */
    private static String student_grade(Scanner sc) {
        try {
            System.out.println("Enter MArks of the student :");
            double marks = sc.nextDouble();
            sc.nextLine();
            if (marks > 100)
                throw new Exception("Marks shall be less than 100");
            String grade = "F";
            if (marks >= 90) {
                grade = "A";
            } else if (marks >= 75) {
                grade = "B";
            } else if (marks >= 60) {
                grade = "C";
            } else if (marks >= 50)
                grade = "D";
            return grade;
        } catch (Exception e) {
            System.out.println("Exception occurred :" + e);
        }
        return "";
    }

    private static float electricity_bill(Scanner sc) {
        try {
            float bill = 0;
            float units_spent = sc.nextFloat();
            if (units_spent <= 100) {
                bill = units_spent * 2;
            } else if (units_spent <= 200) {
                bill = 200 + 3 * (units_spent - 100);
            } else if (units_spent <= 300) {
                bill = 500 + 5 * (units_spent - 200);
            } else {
                bill = 1000 + 7 * (units_spent - 300);
            }
            return bill;
        } catch (Exception e) {
            System.out.println("Exception Found" + e.getMessage());
        }
        return -1;
    }
}
