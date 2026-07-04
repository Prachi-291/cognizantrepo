
public class TaskManagement {

    private Task head;

    public TaskManagement() {
        head = null;
    }

    // Add Task
    public void addTask(int id, String name, String status) {

        Task newTask = new Task(id, name, status);

        if (head == null) {
            head = newTask;
        } else {

            Task temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newTask;
        }

        System.out.println("Task Added Successfully.");
    }

    // Display Tasks
    public void displayTasks() {

        if (head == null) {
            System.out.println("No Tasks Available.");
            return;
        }

        Task temp = head;

        while (temp != null) {

            System.out.println(temp);
            System.out.println("----------------------");

            temp = temp.next;
        }
    }

    // Search Task
    public void searchTask(int id) {

        Task temp = head;

        while (temp != null) {

            if (temp.taskId == id) {

                System.out.println("Task Found");
                System.out.println(temp);
                return;
            }

            temp = temp.next;
        }

        System.out.println("Task Not Found.");
    }

    // Delete Task
    public void deleteTask(int id) {

        if (head == null) {

            System.out.println("Task List is Empty.");
            return;
        }

        if (head.taskId == id) {

            head = head.next;
            System.out.println("Task Deleted Successfully.");
            return;
        }

        Task current = head;
        Task previous = null;

        while (current != null && current.taskId != id) {

            previous = current;
            current = current.next;
        }

        if (current == null) {

            System.out.println("Task Not Found.");
            return;
        }

        previous.next = current.next;

        System.out.println("Task Deleted Successfully.");
    }
}