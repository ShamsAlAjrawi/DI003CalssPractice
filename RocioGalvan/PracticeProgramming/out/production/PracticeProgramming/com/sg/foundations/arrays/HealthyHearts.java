package com.sg.foundations.arrays;

import java.util.Scanner;

//TODO Create a simple calculator that asks the user for their age,
// calculates the healthy heart rate range for that age, and displays the result.
public class HealthyHearts {
    public static void main(String[] args) {
//TODO 1: Use scanner class to gather age from user
//TODO 2: Import Scanner class
        Scanner myScanner = new Scanner(System.in);
//TODO 3: print the question to the user
        System.out.println("What is your age?");
//TODO 4: declare int variable to hold the user's response
        int userResponse = myScanner.nextInt();
/* this helps avoid being stuck in loop to enter another # because nextLine captures the empty space when you hit enter
        it eats up the space and since it isn't stored in a variable it disappears
        could have parsed the string to an int though  */
        myScanner.nextLine();
//TODO 5: declare int variables for maximum heart rate & calculate it based on instructions given
        int maxHeartRate = 220 - userResponse;
//TODO 6: declare two int variables for min & max target HR Zone based on instructions given
        int minTargetHRZone = (maxHeartRate * 50) / 100;
        float maxTargetHRZone = (maxHeartRate * 85) / 100f;
//TODO 7: print the maximum heart rate variable to the console that contains the calculation using string literal + concatenate result
        System.out.println("Your maximum heart rate should be " + maxHeartRate + " beats per minute");
//TODO 8: print the min & max target HR Zone variable to the console that contains the calculation using string literal + concatenate result
        System.out.println("Your target HR Zone is " + minTargetHRZone + " - " + Math.round(maxTargetHRZone) + " beats per minute");

/*      even though I started with pseudocode, while writing the program I came across things
        I had not taken into consideration like rounding up and changing variable type to a float
        & fixing issue with myScanner.nextLine

 */

    }
}
