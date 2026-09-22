import java.util.Scanner;

public class AssignmentOne {
    public static void student_pass() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("== Program to CHECK WHETHER THE STUDENT PASSED OR NOT ==");
            System.out.println("Enter Marks:");
            int first = sc.nextInt();
            if (first >= 40) {
                System.out.println("== PASSED ==");
            } else
                System.out.println("== NOT PASSED ==");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception occured" + e.getMessage());
        }
    }

    public static void voting_elligibilty() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("== Program to CHECK AGE ELLIGIBILITY ==");
            System.out.println("Enter AGE:");
            int first = sc.nextInt();
            if (first > 17) {
                System.out.println("== AGE ELLIGIBLE ==");
            } else
                System.out.println("== AGE NOT ELLIGIBLE ==");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception occured" + e.getMessage());
        }
    }

    public static void largest_of_two() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("== Program to CHECK WHICH NUMBER IS GREATER ==");
            System.out.println("Enter A NUMBER:");
            int first = sc.nextInt();
            System.out.println("Enter ANOTHER NUMBER:");
            int second = sc.nextInt();
            if (first > second) {
                System.out.println("== FIRST IS GREATER ==");
            } else if (first < second) {
                System.out.println("== SECOND IS GREATER ==");
            } else
                System.out.println("== FIRST IS EQUAL TO SECOND ==");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception occured" + e.getMessage());
        }
    }

    public static void pos_neg() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("== Program to CHECK POSITIVE, NEGATIVE OR ZERO ==");
            System.out.println("Enter A NUMBER:");
            int first = sc.nextInt();
            if (first > 0) {
                System.out.println("== POSITIVE ==");
            } else if (first == 0) {
                System.out.println("== ZERO ==");
            } else
                System.out.println("== NEGATIVE ==");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception occured" + e.getMessage());
        }
    }

    public static void even_odd() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("== Program to CHECK EVEN OR ODD ==");
            System.out.println("Enter A NUMBER:");
            int first = sc.nextInt();
            if (first % 2 == 0) {
                System.out.println("EVEN");
            } else {
                System.out.println("ODD");

            }

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception occured" + e.getMessage());
        }
    }

    public static void total_and_average() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("== Program to calculate average ==");
            System.out.println("Enter Marks in first subject :");
            double first = sc.nextDouble();
            System.out.println("Enter Marks in second subject :");
            double second = sc.nextDouble();
            System.out.println("Enter Marks in third subject :");
            double third = sc.nextDouble();
            double total = first + second + third;
            double average = total / 3;

            // double t = sc.nextDouble();
            System.out.println("Total :");
            System.out.println(total);
            System.out.println("Average :");
            System.out.println(average);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception occured" + e.getMessage());
        }
    }

    public static void temp_conversion() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Temperature in Celsius :");
            double Celsius = sc.nextDouble();
            double Farenheit = 32 + (Celsius * 1.8);

            // double t = sc.nextDouble();
            System.out.println("Temperature in Farenheit :");
            System.out.println(Farenheit);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception occured" + e.getMessage());
        }
    }

    public static void simple_interest() {
        try (Scanner sc = new Scanner(System.in)) {
            double p = sc.nextDouble();
            double r = sc.nextDouble();
            r /= 100;
            double t = sc.nextDouble();
            System.out.println(p + (p * r * t));
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception occured" + e.getMessage());
        }

    }

    public static void prop_of_circle() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter r:");
            double r = sc.nextDouble();
            double area_of_circle = Math.PI * r * r;
            double circumference = 2 * area_of_circle / r;
            System.out.println("Area ==>");
            System.out.printf("%.2f\n", area_of_circle);
            System.out.println("Circumference ==>");
            System.out.printf("%.2f\n", circumference);
            // System.out.println(circumference);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception occured" + e.getMessage());
        }
    }

    public static void add_two_numbers() throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a:");
            double a = sc.nextDouble();
            System.out.println("Enter b:");
            double b = sc.nextDouble();
            System.out.println("Result: \n {a+b}:" + (a + b));
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception occured" + e.getMessage());
        }
    }

    public static void HelloWorld() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) throws Exception {
        // add_two_numbers();
        prop_of_circle();
    }
}
