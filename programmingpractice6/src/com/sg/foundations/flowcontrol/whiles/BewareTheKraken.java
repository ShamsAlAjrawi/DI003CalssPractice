package com.sg.foundations.flowcontrol.whiles;
import java.util.Scanner;
import java.util.Random;

public class BewareTheKraken {
    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);
        Random myrandom = new Random();

        System.out.println("Already, get those flippers and wetsuit on - we're going diving!");
        System.out.println("Here we goooOOooOooo.....! *SPLASH*");

        int depthDivedInFt = 0;
        String[] fishTypes = {"Shark", "Blue Whale", "Clownfish", "Starfish", "Sting Ray"};

        // Turns out the ocean is only so deep, 36200 at the deepest survey,
        // so if we reach the bottom ... we should probably stop.
        // if the while loop is set to true the code would run the same way
        while(depthDivedInFt < 36200){
            System.out.println("So far, we've swum " + depthDivedInFt + " feet");

            if(depthDivedInFt >= 20000){
                System.out.println("Uhhh, I think I see a Kraken, guys ....");
                System.out.println("TIME TO GO!");
                break;
            }
            // // Print a random fish type
            int randomIndex = myrandom.nextInt(fishTypes.length);
            System.out.println("Look, it's a " + fishTypes[randomIndex] + "!");

            // I can swim, really fast! 500ft at a time!
            depthDivedInFt += 1000;

            // Ask the user if they want to stop
            System.out.println("Do you want to stop and surface? (yes/no): ");
            String userInput = myscanner.nextLine();
            if (userInput.equals("yes")) {
                System.out.println("Time to surface!");
                break;
            }
        }
        myscanner.close();

        System.out.println("");
        System.out.println("We ended up swimming " + depthDivedInFt + " feet down.");
        System.out.println("I bet we can do better next time!");
    }
}



