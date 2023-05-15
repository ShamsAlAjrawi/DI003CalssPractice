package com.sg.foundations.random;

import java.util.Random;
import java.util.Scanner;

/**
 * The initial version of the HighRoller class rolls a six-sided die.
 * TODO: 1. Ask the user to tell you the number of sides a single die has.
 * TODO: 2. Roll the die to generate a number between 1 - # sides
 * TODO: 3. Add in a conditional that prints out:
 *          "You rolled a critical failure! Ouch." if it rolled a 1
 *          "You rolled a critical! Nice job!" if it rolled the max.
 */
public class HighRoller {

    public static void main(String[] args) {

        Random diceRoller = new Random();
        Scanner mySc = new Scanner(System.in);

        // 1. Ask the user to tell you the number of sides a single die has.
        System.out.println("How many number of sides do you want for your die?");
        int numSides = mySc.nextInt();

        // 2. Roll the die to generate a number between 1 - # sides
        int rollResult = diceRoller.nextInt(numSides) + 1;

        System.out.println("TIME TO ROOOOOOLL THE DICE!");
        System.out.println("I rolled a " + rollResult);

        // 3. Add in a conditional statement
        if (rollResult == 1) {
            System.out.println("You rolled a critical failure!");
        }
        else if (rollResult == numSides) {
            System.out.println("You rolled a critical! Nice job!");
        }
    }
}