/**
 * Created by Tenny on 1/21/16.
 */
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();

        int secretNumber = 88;
        int numberOfGuesses = 0;
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;

        while (win == false) {
            System.out.println("Guess a number!");
            guess = input.nextInt();
            numberOfGuesses++;

            if (guess == secretNumber) {
                win = true;
                System.out.println("You win!");
                System.out.println("The number was " + secretNumber + "!");
                if (numberOfGuesses == 1) {
                    System.out.println("It took you " + numberOfGuesses + " try!");
                } else {
                    System.out.println("It took you " + numberOfGuesses + " tries!");
                }
            } else if (guess < secretNumber) {
                System.out.println("Too low!");
            } else if (guess > secretNumber) {
                System.out.println("Too high!");
            }
        }

    }
}
