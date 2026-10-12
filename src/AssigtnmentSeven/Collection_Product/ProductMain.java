package AssigtnmentSeven.Collection_Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductMain {
    private static double sum = 0;

    public static void main(String[] args) {
        ArrayList<Product> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            Product p = new Product();
            p.read(sc);
            sum += p.price;
            al.add(p);
        }
        al.stream().forEach((p) -> {
            p.display();
            System.out.println("-".repeat(60));
        });
        System.out.println("Total Price\t:\t" + sum);
        Product max_p = al.get(0);
        for (Product product : al) {
            if (product.price > max_p.price) {
                max_p = product;
            }
        }
        System.out.println("-".repeat(60));
        System.out.println("Maximum pricesd Product[]");
        max_p.display();
    }
}
