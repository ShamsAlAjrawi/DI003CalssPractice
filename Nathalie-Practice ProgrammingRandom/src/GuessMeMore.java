import java.util.Random;
import java.util.Scanner;

public class GuessMeMore {
    public static void main(String[] args){
        Random randomizer = new Random();
        //int secretNumber = randomizer.nextInt(101) - 100; // generate a random number between -100 and 100
       int secretNumber = randomizer.nextInt(10) - 5; // generate a random number between 10 and 5

        Scanner input = new Scanner(System.in);
        int userGuess;

        do {
//            System.out.print("Pick a number between -100 and 100: ");
            System.out.print("Pick a number between -5 and 10: ");
            userGuess = input.nextInt(); // Here we want to read the user input

            if (userGuess == secretNumber) {
                System.out.println("Wow, nice guess! That was it!");
                return; // exit the program
            } else if (userGuess < secretNumber) {
                System.out.println("Ha, nice try - too low! Try again!");
            } else {
                System.out.println("Too bad, way too high. Try again!");
            }
        } while (true); // keep looping until the user guesses correctly
    }
}

// we use the nextInt() method to generate a random integer between -100  and 201
// Then we want to subtract 100 from it to shift the range down to -100 to 100.
// We used the do-while loop, which will repeat until the user guesses correctly.