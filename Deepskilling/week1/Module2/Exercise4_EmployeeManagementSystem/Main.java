
public class Main {

    public static void main(String[] args) {

        EmployeeManagement management = new EmployeeManagement(10);

        management.addEmployee(new Employee(101, "Prachi", "Software Engineer", 50000));
        management.addEmployee(new Employee(102, "Aman", "Tester", 40000));
        management.addEmployee(new Employee(103, "Riya", "Developer", 60000));

        // Display Employees
        management.displayEmployees();

        // Search Employee
        System.out.println("\nSearching Employee...");
        management.searchEmployee(102);

        // Delete Employee
        System.out.println("\nDeleting Employee...");
        management.deleteEmployee(102);

        // Display After Deletion
        management.displayEmployees();
    }
}
