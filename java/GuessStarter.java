import java.util.Random;
import java.util.Scanner;

/**
 * Starter code for the "Guess My Number" exercise.
 */
public class GuessStarter {

    public static void main(String[] args) {
        // Pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int guess = 0;
        int off;

        System.out.println(number);
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(including both). Can you guess what it is?");
        
        // Prompting the user to enter a number between 1 and 100
        while (guess < 1 || guess > 100) {
            System.out.print("Type a number between 1 and 100: ");
            Scanner in = new Scanner(System.in);
            guess = in.nextInt();

            // Checking if guess is too low
            if (guess < 1) {
                System.out.println("Your guess is too low.");
                System.out.println("Type a number that is larger than 0.");
            }
            // Checking if guess is too high
            if (guess > 100) {
                System.out.println("Your guess is too high.");
                System.out.println("Type a number that is smaller than 100.");
            }
        }

        // Printing out the guess.
        System.out.printf("Your guess is: %d\n", guess);
        System.out.printf("The number I was thinking of is: %d\n", number);

        // Checking result.
        if (number == guess) {
            System.out.printf("You were right! Well done.\n");
        } else if (number < guess) {
            off = guess - number;
            System.out.printf("You were off by: %d\n", off);
        } else {
            off = number - guess;
            System.out.printf("You were off by: %d\n", off);
        }
    }

}
