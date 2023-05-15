package flowcontrol.whiles;

import java.util.Random;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class BewareTheKraken {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        Random myRandom = new Random();
        int depthDivedInFt = 0;

        System.out.println("Already, get those flippers and wetsuit on - we're going diving!");
        System.out.println("Here we goooOOooOooo.....! *SPLASH*");

        String[] fishes = {"dolphin", "pufferfish", "shark", "cod", "catfish", "white bass", "clown fish"};

        while(depthDivedInFt < 36200){
            System.out.println("So far, we've swum " + depthDivedInFt + " feet");

            //Add in another break command: ask the user if they want to stop. If they do, surface.
            System.out.println("Do you want to stop and surface? y/n");
            String answer = myScanner.nextLine();
            if (answer.equals("y")) {
                break;
            }

            if(depthDivedInFt >= 20000){
                System.out.println("Uhhh, I think I see a Kraken, guys ....");
                System.out.println("TIME TO GO!");
                break;
            }
            //every time we go deeper, add in a printout for a random fish type.
            int randomIndex = myRandom.nextInt(fishes.length); //you should put randomIndex inside the loop! so each loop it will be a different number!
            String randomFish = fishes[randomIndex];
            System.out.println("Look! it's a "+ randomFish + "!");

            depthDivedInFt += 1000;
        }
        System.out.println("");
        System.out.println("We ended up swimming " + depthDivedInFt + " feet down.");
        System.out.println("I bet we can do better next time!");

        //What changes if you turn the while loop's condition to just read "true".
        // - the while loop would run the same way!
    }
}
