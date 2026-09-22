import java.util.Scanner;

// ASSIGNMENT DONE
public class AssignmentOne {

    public static void student_pass(Scanner sc) {
        try {
            System.out.println("== Program to CHECK WHETHER THE STUDENT PASSED OR NOT ==");
            System.out.println("Enter Marks:");
            int first = sc.nextInt();
            sc.nextLine();
            if (first >= 40) {
                System.out.println("== PASSED ==");
            } else
                System.out.println("== NOT PASSED ==");
        } catch (Exception e) {
            System.out.println("Exception occured" + e.getMessage());
        }
    }

    public static void voting_elligibilty(Scanner sc) {
        try {
            System.out.println("== Program to CHECK AGE ELLIGIBILITY ==");
            System.out.println("Enter AGE:");
            int first = sc.nextInt();
            sc.nextLine();
            if (first > 17) {
                System.out.println("== AGE ELLIGIBLE ==");
            } else
                System.out.println("== AGE NOT ELLIGIBLE ==");
        } catch (Exception e) {
            System.out.println("Exception occured" + e.getMessage());
        }
    }

    public static void largest_of_two(Scanner sc) {
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
            } else if (first < second) {
                System.out.println("== SECOND IS GREATER ==");
            } else
                System.out.println("== FIRST IS EQUAL TO SECOND ==");
        } catch (Exception e) {
            System.out.println("Exception occured" + e.getMessage());
        }
    }

    public static void pos_neg(Scanner sc) {
        try {
            System.out.println("== Program to CHECK POSITIVE, NEGATIVE OR ZERO ==");
            System.out.println("Enter A NUMBER:");
            int first = sc.nextInt();
            sc.nextLine();
            if (first > 0) {
                System.out.println("== POSITIVE ==");
            } else if (first == 0) {
                System.out.println("== ZERO ==");
            } else
                System.out.println("== NEGATIVE ==");
        } catch (Exception e) {
            System.out.println("Exception occured" + e.getMessage());
        }
    }

    public static void even_odd(Scanner sc) {
        try {
            System.out.println("== Program to CHECK EVEN OR ODD ==");
            System.out.println("Enter A NUMBER:");
            int first = sc.nextInt();
            sc.nextLine();
            if (first % 2 == 0) {
                System.out.println("EVEN");
            } else {
                System.out.println("ODD");

            }

        } catch (Exception e) {
            System.out.println("Exception occured" + e.getMessage());
        }
    }

    public static void total_and_average(Scanner sc) {
        try {
            System.out.println("== Program to calculate average ==");
            System.out.println("Enter Marks in first subject :");
            double first = sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter Marks in second subject :");
            double second = sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter Marks in third subject :");
            double third = sc.nextDouble();
            sc.nextLine();
            double total = first + second + third;
            double average = total / 3;

            // double t = sc.nextDouble();
            System.out.println("Total :");
            System.out.println(total);
            System.out.println("Average :");
            System.out.println(average);
        } catch (Exception e) {
            System.out.println("Exception occured" + e.getMessage());
        }
    }

    public static void temp_conversion(Scanner sc) {
        try {
            System.out.println("Enter Temperature in Celsius :");
            double Celsius = sc.nextDouble();
            sc.nextLine();
            double Farenheit = 32 + (Celsius * 1.8);

            // double t = sc.nextDouble();
            System.out.println("Temperature in Farenheit :");
            System.out.println(Farenheit);
        } catch (Exception e) {
            System.out.println("Exception occured" + e.getMessage());
        }
    }

    public static void simple_interest(Scanner sc) {
        try {

            System.out.println("Enter Principal (P) in Rupees(₹) :");
            double p = sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter Rate of interest (R) in % :");
            double r = sc.nextDouble();
            sc.nextLine();
            r /= 100;
            System.out.println("Enter Frequency (T) of Premium:");
            double t = sc.nextDouble();
            sc.nextLine();
            System.out.println("Total accumulated Premium:");
            System.out.println(p + (p * r * t));
        } catch (Exception e) {
            System.out.println("Exception occured" + e.getMessage());
        }

    }

    public static void prop_of_circle(Scanner sc) {
        try {
            System.out.println("Enter r:");
            double r = sc.nextDouble();
            sc.nextLine();
            double area_of_circle = Math.PI * r * r;
            double circumference = 2 * area_of_circle / r;
            System.out.println("Area ==>");
            System.out.printf("%.2f\n", area_of_circle);
            System.out.println("Circumference ==>");
            System.out.printf("%.2f\n", circumference);
            // System.out.println(circumference);
        } catch (Exception e) {
            System.out.println("Exception occured" + e.getMessage());
        }
    }

    public static void add_two_numbers(Scanner sc) throws Exception {
        try {
            System.out.println("Enter a:");
            double a = sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter b:");
            double b = sc.nextDouble();
            sc.nextLine();
            System.out.println("Result: \n{a + b}:" + (a + b));
            System.out.println("{a - b}:" + (a - b));
            System.out.println("{a * b}:" + (a * b));
            System.out.println("{a / b}:" + (a / b));
        } catch (Exception e) {
            System.out.println("Exception occured" + e.getMessage());
        }
    }

    public static void HelloWorld() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) throws Exception {

        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                System.out.println("== Assignment One Menu ==");
                System.out.println("Enter your choice...(1-10)");
                System.out.println("Ctrl+C or invalid choice to exit");
                int choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 0 -> HelloWorld();
                    //REVIEW: CASE_1 => Needs clarity - Calculator approach
                    case 1 -> add_two_numbers(sc);
                    case 2 -> prop_of_circle(sc);
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
        // prop_of_circle();
    }
}