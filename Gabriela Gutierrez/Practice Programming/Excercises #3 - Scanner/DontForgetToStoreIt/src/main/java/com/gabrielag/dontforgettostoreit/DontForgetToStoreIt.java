/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.gabrielag.dontforgettostoreit;

import java.util.Scanner;

/**
 *@author Gabriela Gutierrez
 * email: gabystephane@hotmail.com
 * date: May 10th, 2023
 * Purpose: Practice exercises using Scanner
 */

public class DontForgetToStoreIt {
    public static void main(String[] args) {
        // Declare your variables
        /*
        int meaningOfLifeAndEverything = 42;
        double pi = 3.14159;
        String cheese, color;
        */
        int meaningOfLifeAndEverything;
        double pi;
        String cheese;
        String color;
        
        // Declare Scanner for user input
        Scanner inputReader = new Scanner(System.in);
        
        // Ask the user for input
        System.out.println("Give me pi to at least 5 decimals");
        pi = inputReader.nextDouble();
        
        // We've used Double.parseDouble but meaningOfLifeAndEverything 
        // is an INT so we'll have to use Integer.parseInt
        
        System.out.println("What is the meaning of life, the universe & everything? ");
        meaningOfLifeAndEverything = inputReader.nextInt();
        // Integer.parseInt(inputReader.nextLine());
        
        System.out.println("What is your favorite kind of cheese? ");
        cheese = inputReader.next();
        //cheese = inputReader.nextLine();: Makes the compiler go to the next input question
        // and then enter both Strings being asked
        
        System.out.println("Do you like the color red or blue more? ");
        color = inputReader.next();
        //color = inputReader.nextLine();: Makes the compiler go to the next input question
        // and then enter both Strings being asked
        
        // Testing Purposes
        // Calculation for circumference of life
        //double circumferenceOfLife = (2 * pi * meaningOfLifeAndEverything);
        
        // Print out the user input in statements
        System.out.println("Ooh, " + color + " " + cheese + " sounds delicious!");
        // Hard coded calculation inside print statement
        System.out.println("The circumference of life is " + (2 * pi * meaningOfLifeAndEverything));
        
        // Testing Purposes
        // Calculation stored inside variable
        // System.out.println("The circumference of life is " + circumferenceOfLife);
        // Testing purposes: Print out final answer to 5 decimals
        // System.out.println("The circumference of life is " + String.format("%.5f", circumferenceOfLife));
    }
}
