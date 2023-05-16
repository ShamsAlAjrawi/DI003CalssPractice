import java.util.Random;
import java.util.Scanner;

public class HighRoller {
    public static void main(String[] args) {

        Random diceRoller = new Random();
        int rollResult = diceRoller.nextInt(6) + 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("How many sides does a single die has?");

        //Here I want it to read what the user input
        int guessedSide = sc.nextInt();

        System.out.println("You picked: " + guessedSide);

        System.out.println("TIME TO ROOOOOOLL THE DICE!");
        System.out.println("I rolled a " + rollResult);


        // if it rolled a 1
        if (rollResult == 1) {
            System.out.println("You rolled a critical failure! Ouch.");
        }
        //if it rolled the max.
        if(rollResult == 6){
            System.out.println("You rolled a critical! Nice job!");
        }
    }
}
