import java.util.Scanner;

public class AssignmentTwo {
    public static void main(String[] args) {
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
                    case 7 -> pos_neg(sc);
                    case 8 -> largest_of_two(sc);
                    case 9 -> voting_elligibilty(sc);
                    case 10 -> student_pass(sc);
                    default -> throw new AssertionError();
                }
                sc.nextLine();
            }
        } catch (AssertionError e) {
            // e.printStackTrace();
            System.out.println("Invalid choice... Exiting");
        }
    }

    private static Object salary_calculation(Scanner sc) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'salary_calculation'");
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

    private static int largest_of_two(Scanner sc) throws Exception {
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
