import java.io.IOException;
import java.util.Scanner;

public class AssignmentThree {

    public static void sum_and_avg(Scanner sc) {

        System.out.println("=== SUM AND AVG ===");
        System.out.println("Enter size of the array :");
        int size = sc.nextInt();
        sc.nextLine();
        int[] v = new int[size];
        System.out.println("Fill in the array in a line :");
        for (int i = 0; i < size; i++) {
            v[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i : v) {
            // System.out.println("Enter The Number " + i + ": ");
            sum += i;
        }
        System.out.println("Sum : " + sum + "\t Average : " + (sum / size));
        System.out.println("<Enter> to continue....");
        sc.nextLine();
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                System.out.println("== Assignment Three Menu ==");
                System.out.println("Enter your choice...(1-8)");
                System.out.println("Ctrl+C or invalid choice to exit");
                int choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    // case 0 -> HelloWorld();
                    // REVIEW: CASE_1 => Needs clarity - Calculator approach
                    case 1 -> sum_and_avg(sc);
                    case 2 -> largst_and_smallest(sc);
                    case 3 -> count_even_odd(sc);
                    case 4 -> search_ele(sc);
                    case 5 -> reverse_array(sc);
                    case 6 -> find_duplicate(sc);
                    case 7 -> pos_neg(sc);
                    case 8 -> largest_of_two(args);
                    default -> throw new AssertionError();
                }
                sc.nextLine();
            }
        } catch (AssertionError | InterruptedException | IOException e) {
            // e.printStackTrace();
            System.out.println("Invalid choice... Exiting");
        }
    }

    private static Object largest_of_two(String[] args) {
        throw new UnsupportedOperationException("Unimplemented method 'largest_of_two'");
    }

    private static void pos_neg(Scanner sc) {
        System.out.println("=== Postive and Negative ===");
        // System.out.println("Enter size of the array :");
        System.out.println("Enter size of the array :");
        int size = sc.nextInt();
        sc.nextLine();
        int[] v = new int[size];
        int[] k = new int[size];
        int count = 0;
        System.out.println("Fill in the array in a line :");
        for (int i = 0; i < size; i++) {
            v[i] = sc.nextInt();
            if (v[i] > 0)
                k[i] = 1;
            else if (v[i] < 0)
                k[i] = -1;
            else {
                k[i] = 0;
                count += 1;
            }
        }
        System.out.println("Postive elements:");
        for (int i = 0; i < k.length; i++) {
            if (k[i] == 1)
                System.out.print(v[i]+" ");
        }
        System.out.println();
        System.out.println("Negative elements:");
        for (int i = 0; i < k.length; i++) {
            if (k[i] == -1)
                System.out.print(v[i]+" ");
        }
        System.out.println();
        System.out.println("Zero elements : " + count);
        System.out.println("<Enter> to continue....");
        sc.nextLine();
        // throw new UnsupportedOperationException("Unimplemented method 'pos_neg'");
    }

    private static void find_duplicate(Scanner sc) {
        System.out.println("=== First Duplicate Finder ===");
        // System.out.println("Enter size of the array :");
        System.out.println("Enter size of the array :");
        int size = sc.nextInt();
        sc.nextLine();
        int[] v = new int[size];
        System.out.println("Fill in the array in a line :");
        for (int i = 0; i < size; i++) {
            v[i] = sc.nextInt();
        }
        // HashMap<Integer,Integer> h = new HashMap<>();
        for (int i = 0; i < v.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if ((v[i] ^ v[j]) == 0) {
                    System.out.println("Found duplicate\t:\t" + v[i]);
                    System.out.println("<Enter> to continue....");
                    sc.nextLine();
                    return;
                }
            }
        }
        System.out.println("!! NO duplicate FOUND!!");
        System.out.println("<Enter> to continue....");
        sc.nextLine();
        // throw new UnsupportedOperationException("Unimplemented method
        // 'find_duplicate'");
    }

    private static void reverse_array(Scanner sc) {

        System.out.println("=== Reverse Array ===");
        // System.out.println("Enter size of the array :");
        System.out.println("Enter size of the array :");
        int size = sc.nextInt();
        sc.nextLine();
        int[] v = new int[size];
        System.out.println("Fill in the array in a line :");
        for (int i = 0; i < size; i++) {
            v[i] = sc.nextInt();
        }
        System.out.println("REVERSE of the array :");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(v[i] + " ");
        }
        System.out.println(); // Necessary
        System.out.println("<Enter> to continue....");
        sc.nextLine();
        // throw new UnsupportedOperationException("Unimplemented method
        // 'reverse_array'");
    }

    private static void search_ele(Scanner sc) {
        System.out.println("=== SEARCH AN ELEMENT ===");
        System.out.println("Enter size of the array :");
        int size = sc.nextInt();
        sc.nextLine();
        int[] v = new int[size];
        System.out.println("Fill in the array in a line :");
        for (int i = 0; i < size; i++) {
            v[i] = sc.nextInt();
        }
        System.out.println("Enter Element to search :");
        int ele = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < v.length; i++) {
            if (v[i] == ele) {
                System.out.println("-----FOUND----");
                System.out.println("<Enter> to continue....");
                return;
            }
        }
        System.out.println("-----NOT FOUND----");
        System.out.println("<Enter> to continue....");
        // throw new UnsupportedOperationException("Unimplemented method 'search_ele'");
    }

    private static void count_even_odd(Scanner sc) {

        System.out.println("=== COUNT OF EVEN AND ODD ===");
        System.out.println("Enter size of the array :");
        int size = sc.nextInt();
        sc.nextLine();
        int[] v = new int[size];
        System.out.println("Fill in the array in a line :");
        for (int i = 0; i < size; i++) {
            v[i] = sc.nextInt();
        }
        int even = 0;
        int odd = 0;
        for (int i : v) {
            even += (i % 2 == 0 ? 1 : 0);
            odd += (i % 2);
        }
        System.out.println("EVEN : " + even + "\t ODD : " + odd);
        System.out.println("<Enter> to continue....");
        sc.nextLine();
        // throw new UnsupportedOperationException("Unimplemented method
        // 'count_even_odd'");
    }

    private static void largst_and_smallest(Scanner sc) {
        System.out.println("=== Largest AND Smallest ===");
        System.out.println("Enter size of the array :");
        int size = sc.nextInt();
        sc.nextLine();
        int[] v = new int[size];
        System.out.println("Fill in the array in a line :");
        for (int i = 0; i < size; i++) {
            v[i] = sc.nextInt();
        }
        int large = (int) -1e8;
        int smallest = (int) 1e8;
        for (int i : v) {
            // System.out.println("Enter The Number " + i + ": ");
            large = Math.max(i, large);
            smallest = Math.min(i, smallest);
        }
        System.out.println("Largest : " + large + "\t Smallest : " + smallest);
        System.out.println("<Enter> to continue....");
        sc.nextLine();
    }
}
