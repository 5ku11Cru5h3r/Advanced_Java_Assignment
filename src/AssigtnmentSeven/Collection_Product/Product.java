package AssigtnmentSeven.Collection_Product;

import java.util.Scanner;

public class Product {
    long productId;
    String productName;
    double price;

    public void read(Scanner sc) {
        productId = sc.nextLong();
        productName = sc.next();
        price = sc.nextDouble();
    }

    public void display() {
        System.out.println("Product Id\t:\t" + productId);
        System.out.println("Product Name\t:\t" + productName);
        System.out.println("Price\t:\t" + price);
    }
}
