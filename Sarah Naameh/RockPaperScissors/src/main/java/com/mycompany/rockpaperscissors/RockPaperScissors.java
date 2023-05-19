/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rockpaperscissors;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author divikumar
 */
public class RockPaperScissors {

    public static void main(String[] args) {
        /* instantiate a scanner to accept user input and respond appropriately */
        Scanner myScanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Hi there. Ready for Rock Paper Scissors?");
        System.out.println("Awesome! How many rounds do you want to play? Pick a number between 1 and 10.");
        int roundsToPlay = myScanner.nextInt();
        int userWins = 0;
        int myWins = 0;
        int ties = 0;
        /* if roundsToPlay > 10 or < 0, we print an error message and quit */
        if (roundsToPlay < 1 || roundsToPlay > 10) {
            System.out.println("I'm sorry, that doesn't work with my schedule. I can only play up to 10 rounds. Work with me here!");
        return;
    }
        /* while round <= roundsToPlay: we continue playing */

        for (int round = 1; round <= roundsToPlay; round++) {
            System.out.println("Round " + round + "!");
            System.out.println("What is your choice? (1 = Rock, 2 = Paper, 3 = Scissors)");
            int userChoice = myScanner.nextInt();

            if (userChoice < 1 || userChoice > 3) {
                System.out.println("What game are you playing? Seriously, enter a number between 1 and 3.");
                round--;
                continue;
            }
            /* random.nextInt(3) will generate nums from 0 to 2, so adding 1 makes the range 1 to 3 */
            int computerChoice = random.nextInt(3) + 1;
            System.out.println("My choice: " + printChoiceString(computerChoice));
            /* game logic */
            if (userChoice == computerChoice) {
                System.out.println("It's a tie!");
                ties++;
            } else if ((userChoice == 1 && computerChoice == 3) ||
                (userChoice == 2 && computerChoice == 1) ||
                (userChoice == 3 && computerChoice == 2)) {
                    System.out.println("You win this round!");
                    userWins++;
            } 
            else {
                System.out.println("I win this round!");
                myWins++;
            }
        /* empty line to provide some visual space */
        System.out.println();
    }
    System.out.println("Game over!");
    System.out.println("Number of ties: " + ties);
    System.out.println("Number of user wins: " + userWins);
    System.out.println("Number of computer wins: " + myWins);
    
    if (userWins > myWins) {
        System.out.println("Congratulations! You have bested me!");
    } else if (userWins < myWins) {
        System.out.println("I'm trying very hard not to be a sore winner here. WOOHOO");
    } else {
        System.out.println("It's a tie!");
    }
    System.out.println("Do you want to go again?");
    String playAgain = myScanner.next().toLowerCase();
    if (playAgain.equals("no")){
        System.out.println("Thanks for playing! Ciao!");
    }
    else {
        System.out.println("Let's go again!");
        main(args);
    }

    }
    /* return a representation of the computer's choice to the user */
    private static String printChoiceString(int choice) {
    switch (choice) {
        case 1:
            return "Rock";
        case 2:
            return "Paper";
        case 3:
            return "Scissors";
        default:
            return "";
    }}
}
