package flowcontrol.ifs;

import java.util.Scanner;

public class GuessMe {
    public static void main(String[] args) {
        int myNumber = 6;
        int userNumber;
        Scanner userInput = new Scanner(System.in);
        System.out.println("I've chosen a number. Bet can't guess it!Please pick a number!");
        userNumber = Integer.parseInt(userInput.nextLine());
        System.out.println("Your guess: " + userNumber + "\n\n");

        if (userNumber == myNumber) {
            System.out.println("Wow, nice guess! That was it!");
        } else if (userNumber < myNumber) {
            System.out.println(userNumber + "? Ha, nice try - too low! I chose " + myNumber + ".");
        } else {
            System.out.println(userNumber + "? Too bad, way too high. I chose " + myNumber + ".");
        }
    }
}
