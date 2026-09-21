import java.util.Scanner;

public class App {

    public static void area_of_circle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter r:");
        double r = sc.nextDouble();
        double area_of_circle = Math.PI * r * r;
        System.out.println(area_of_circle);
    }

    public static void add_two_numbers() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = sc.nextDouble();
        System.out.println("Enter b:");
        double b = sc.nextDouble();
        System.out.println("Result: \n {a+b}:" + (a + b));
    }

    public static void HelloWorld() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) throws Exception {
        // add_two_numbers();
        area_of_circle();
    }
}
