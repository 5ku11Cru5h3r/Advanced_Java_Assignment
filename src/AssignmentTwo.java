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
                    case 3 -> simple_interest(sc);
                    case 4 -> temp_conversion(sc);
                    case 5 -> total_and_average(sc);
                    case 6 -> even_odd(sc);
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

    private static Object student_grade(Scanner sc) {
        // TODO Auto-generated method stub
        
        throw new UnsupportedOperationException("Unimplemented method 'student_grade'");
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
