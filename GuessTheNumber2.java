import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber2 {
    public static void main(String[] args) {
        // Specify the range
        int minRange = 1;
        int maxRange = 100;

        // Create an instance of the Random class
        Random random = new Random();

        // Generate a random number within the specified range
        int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;

        // Initialize variables
        Scanner scanner = new Scanner(System.in);
        int userGuess;

        // Repeat until the user guesses the correct number
        while (true) {
            // Prompt the user to enter their guess
            System.out.println("Guess the number between " + minRange + " and " + maxRange + ": ");
            userGuess = scanner.nextInt();

            // Compare the user's guess with the randomly generated number
            if (userGuess == randomNumber) {
                System.out.println("Congratulations! Your guess is correct.");
                break; // Exit the loop when the guess is correct
            } else if (userGuess < randomNumber) {
                System.out.println("Too low. Try again!");
            } else {
                System.out.println("Too high. Try again!");
            }
        }

        // Close the scanner
        scanner.close();
    }
}