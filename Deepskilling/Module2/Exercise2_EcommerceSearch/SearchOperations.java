
public class SearchOperations {

    // Linear Search
    public static void linearSearch(Product[] products, String key) {

        boolean found = false;

        for (Product product : products) {

            if (product.productName.equalsIgnoreCase(key)) {
                System.out.println("Product Found (Linear Search)");
                System.out.println(product);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product Not Found.");
        }
    }

    // Binary Search (Array must be sorted by productName)
    public static void binarySearch(Product[] products, String key) {

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int compare = products[mid].productName.compareToIgnoreCase(key);

            if (compare == 0) {
                System.out.println("Product Found (Binary Search)");
                System.out.println(products[mid]);
                return;
            } else if (compare < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Product Not Found.");
    }
}
