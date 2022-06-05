import java.util.Random;
import java.util.Scanner;

/**
 * Starter code for the "Guess My Number" exercise.
 */
public class GuessStarter {

    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int guess;
        int off;

        System.out.println(number);
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(including both). Can you guess what it is?");
        
        System.out.print("Type a number: ");
        Scanner in = new Scanner(System.in);
        guess = in.nextInt();

        System.out.printf("Your guess is: %d\n", guess);
        System.out.printf("The number I was thinking of is: %d\n", number);

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
