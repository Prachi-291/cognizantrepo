
public class Main {

    public static void main(String[] args) {

        TaskManagement tm = new TaskManagement();

        tm.addTask(101, "Complete Java Assignment", "Pending");
        tm.addTask(102, "Practice DSA", "In Progress");
        tm.addTask(103, "Upload GitHub", "Pending");

        System.out.println("\nTask List");
        tm.displayTasks();

        System.out.println("\nSearching Task...");
        tm.searchTask(102);

        System.out.println("\nDeleting Task...");
        tm.deleteTask(102);

        System.out.println("\nUpdated Task List");
        tm.displayTasks();
    }
}