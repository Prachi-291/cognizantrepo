
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mouse", "Electronics"),
                new Product(103, "Keyboard", "Electronics"),
                new Product(104, "Monitor", "Electronics"),
                new Product(105, "Printer", "Electronics")
        };

        System.out.println("----- Linear Search -----");
        SearchOperations.linearSearch(products, "Monitor");

        // Sort array before Binary Search
        Arrays.sort(products, Comparator.comparing(p -> p.productName));

        System.out.println("\n----- Binary Search -----");
        SearchOperations.binarySearch(products, "Monitor");
    }
}
