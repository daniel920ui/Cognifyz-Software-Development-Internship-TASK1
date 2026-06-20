import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);

        int attempts = 0;

        System.out.println("Guess a number between 1 and 100:");

        while (true) {

            System.out.print("Enter Guess: ");
            int guess = sc.nextInt();

            attempts++;

            if (guess == secretNumber) {
                System.out.println("Correct! You Won!");
                System.out.println("You guessed in " + attempts + " attempts.");
                break;
            }
            else if (guess < secretNumber) {
                System.out.println("Too Low!");
            }
            else {
                System.out.println("Too High!");
            }
        }

        sc.close();
    }
}