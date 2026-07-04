public class Main {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Product p1 = new Product(101, "Laptop", 20, 65000);
        Product p2 = new Product(102, "Mouse", 50, 700);
        Product p3 = new Product(103, "Keyboard", 40, 1200);

        // Add Products
        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);

        // Display Inventory
        inventory.displayInventory();

        // Search Product
        System.out.println("\nSearching Product...");
        inventory.searchProduct(102);

        // Update Product
        System.out.println("\nUpdating Product...");
        inventory.updateProduct(102, 75, 650);

        // Display Inventory
        inventory.displayInventory();

        // Delete Product
        System.out.println("\nDeleting Product...");
        inventory.deleteProduct(101);

        // Final Inventory
        inventory.displayInventory();
    }
}