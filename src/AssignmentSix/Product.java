package AssignmentSix;

public class Product {
    long product_id;
    String product_name;
    double product_price;

    public Product(long product_id, String product_name, double product_price) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
    }

    public double calculatePrice() {
        return product_price;
    }

    public double calculatePrice(int quantity) {
        return product_price * quantity;
    }

    public double calculatePrice(int quantity, double discount) {
        return product_price * quantity - discount;
    }
}
