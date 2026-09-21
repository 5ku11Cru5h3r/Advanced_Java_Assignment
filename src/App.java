import java.util.Scanner;

public class App {
    public static void simple_interest() {
        try (Scanner sc = new Scanner(System.in)) {
            
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
        }
    }

    public static void add_two_numbers() throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a:");
            double a = sc.nextDouble();
            System.out.println("Enter b:");
            double b = sc.nextDouble();
            System.out.println("Result: \n {a+b}:" + (a + b));
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
