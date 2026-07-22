import java.util.HashMap;

public class Inventory {

    HashMap<Integer, Product> products = new HashMap<>();

    public void addProduct(Product product) {
        products.put(product.productId, product);
        System.out.println("Product Added Successfully.");
    }

    public void updateProduct(int productId, int quantity, double price) {

        if (products.containsKey(productId)) {

            Product p = products.get(productId);
            p.quantity = quantity;
            p.price = price;

            System.out.println("Product Updated Successfully.");

        } else {

            System.out.println("Product Not Found.");
        }
    }

    public void deleteProduct(int productId) {

        if (products.remove(productId) != null) {

            System.out.println("Product Deleted Successfully.");

        } else {

            System.out.println("Product Not Found.");
        }
    }

    public void displayProducts() {

        if (products.isEmpty()) {
            System.out.println("Inventory is Empty.");
            return;
        }

        for (Product p : products.values()) {
            System.out.println(p);
            System.out.println("----------------------");
        }
    }
}