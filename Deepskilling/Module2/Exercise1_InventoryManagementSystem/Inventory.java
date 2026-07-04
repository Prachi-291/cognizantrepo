import java.util.HashMap;

public class Inventory {

    HashMap<Integer, Product> inventory;

    public Inventory() {

        inventory = new HashMap<>();
    }

    // Add Product
    public void addProduct(Product product) {

        inventory.put(product.productId, product);
        System.out.println("Product Added Successfully.");
    }

    // Update Product
    public void updateProduct(int productId, int quantity, double price) {

        if (inventory.containsKey(productId)) {

            Product p = inventory.get(productId);

            p.quantity = quantity;
            p.price = price;

            System.out.println("Product Updated Successfully.");
        } else {

            System.out.println("Product Not Found.");
        }
    }

    // Delete Product
    public void deleteProduct(int productId) {

        if (inventory.containsKey(productId)) {

            inventory.remove(productId);
            System.out.println("Product Deleted Successfully.");
        } else {

            System.out.println("Product Not Found.");
        }
    }

    // Search Product
    public void searchProduct(int productId) {

        if (inventory.containsKey(productId)) {

            System.out.println(inventory.get(productId));
        } else {

            System.out.println("Product Not Found.");
        }
    }

    // Display Inventory
    public void displayInventory() {

        if (inventory.isEmpty()) {

            System.out.println("Inventory is Empty.");
            return;
        }

        System.out.println("\n===== Inventory =====");

        for (Product p : inventory.values()) {

            System.out.println(p);
            System.out.println("-------------------------");
        }
    }
}