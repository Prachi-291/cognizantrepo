import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the secret number: ");
        int secretNumber = sc.nextInt();

        int guess;

        while (true) {
            System.out.print("Guess the number: ");
            guess = sc.nextInt();

            if (guess == secretNumber) {
                System.out.println("Correct Guess!");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Too Low! Try Again.");
            } else {
                System.out.println("Too High! Try Again.");
            }
        }

        sc.close();
    }
}