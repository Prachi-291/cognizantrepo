import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.print("How many names? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter name: ");
            list.add(sc.nextLine());
        }

        System.out.println("Student Names:");

        for (String name : list) {
            System.out.println(name);
        }

        sc.close();
    }
}
