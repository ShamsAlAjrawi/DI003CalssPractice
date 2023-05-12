import java.util.Scanner;

public class GuessMeFinally {
    public static void main(String[] args) {
        int userInput = 21;
        boolean guessedCorrectly = false;
        Scanner myscanner = new Scanner(System.in);

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");

        //the loop will continue executing as long as guessedCorrectly is false (user hasn't guessed correctly yet)
        // once the user guesses correctly and guessedCorrectly is set to true, the loop will stop executing
        // the program will move on to the next statement after the loop
        while (!guessedCorrectly) {
            System.out.print("Take a guess: ");
            int guess = myscanner.nextInt();

            if (guess == userInput) {
                guessedCorrectly = true;
                System.out.println("Wow, nice guess! That was it!");
            } else {
                System.out.println("Wrong guess. Try again!");
            }
        }

        myscanner.close();
        System.out.println("Thanks for playing!");
    }
}

