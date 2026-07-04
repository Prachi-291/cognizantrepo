
public class Main {

    public static void main(String[] args) {

        Order[] orders = {

                new Order(101, "Prachi", 4500),
                new Order(102, "Aman", 1500),
                new Order(103, "Riya", 7200),
                new Order(104, "Rahul", 3000),
                new Order(105, "Anjali", 5200)

        };

        System.out.println("Original Orders");
        SortingOperations.display(orders);

        // Bubble Sort
        SortingOperations.bubbleSort(orders);

        System.out.println("\nOrders After Bubble Sort");
        SortingOperations.display(orders);

        // New array for Quick Sort
        Order[] orders2 = {

                new Order(101, "Prachi", 4500),
                new Order(102, "Aman", 1500),
                new Order(103, "Riya", 7200),
                new Order(104, "Rahul", 3000),
                new Order(105, "Anjali", 5200)

        };

        SortingOperations.quickSort(orders2, 0, orders2.length - 1);

        System.out.println("\nOrders After Quick Sort");
        SortingOperations.display(orders2);
    }
}
