
public class EmployeeManagement {

    Employee[] employees;
    int count;

    public EmployeeManagement(int size) {
        employees = new Employee[size];
        count = 0;
    }

    // Add Employee
    public void addEmployee(Employee employee) {

        if (count < employees.length) {

            employees[count] = employee;
            count++;

            System.out.println("Employee Added Successfully.");

        } else {

            System.out.println("Employee Array is Full.");
        }
    }

    // Search Employee
    public void searchEmployee(int employeeId) {

        for (int i = 0; i < count; i++) {

            if (employees[i].employeeId == employeeId) {

                System.out.println("Employee Found");
                System.out.println(employees[i]);
                return;
            }
        }

        System.out.println("Employee Not Found.");
    }

    // Display Employees
    public void displayEmployees() {

        if (count == 0) {

            System.out.println("No Employees Found.");
            return;
        }

        System.out.println("\n===== Employee List =====");

        for (int i = 0; i < count; i++) {

            System.out.println(employees[i]);
            System.out.println("----------------------------");
        }
    }

    // Delete Employee
    public void deleteEmployee(int employeeId) {

        for (int i = 0; i < count; i++) {

            if (employees[i].employeeId == employeeId) {

                for (int j = i; j < count - 1; j++) {

                    employees[j] = employees[j + 1];
                }

                employees[count - 1] = null;
                count--;

                System.out.println("Employee Deleted Successfully.");
                return;
            }
        }

        System.out.println("Employee Not Found.");
    }
}