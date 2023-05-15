package flowcontrol.whiles;

import java.util.Scanner;

public class GuessMeFinally {
    public static void main(String[] args) {
        int myNumber = -40;
        Scanner userInput = new Scanner(System.in);
        System.out.println("I've chosen a number between -100 and 100. Betcha can't guess it!");
        int guess = Integer.parseInt(userInput.nextLine());
        System.out.println("Your guess: " + guess);

        if (guess == myNumber) {
            System.out.println("Wow, nice guess! That was it!");
        } else {
            while (true) {  //or instead of while(true) you can declare boolean guessedCorrectly = false; while (!guessedCorrectly)
                if (guess < myNumber) {
                    System.out.println("Ha, nice try - too low! Try again!");
                    guess = Integer.parseInt(userInput.nextLine());
                    System.out.println("Your guess: " + guess);

                } else if (guess > myNumber) {
                    System.out.println("Too bad, way too high. Try again!");
                    guess = Integer.parseInt(userInput.nextLine());
                    System.out.println("Your guess: " + guess);
                } else {
                    System.out.println("Finally! It's about time you got it!");
                    break;
                }
            }
        }


    }
}
