/**
 * A program to handle tricky times tables.
 * Asks the user for a number, then prints out the 1 - 15 times tables of that number.
 * Using a for loop.
 *
 * @author Rania Ouassif
 */

package org.practice;
import java.util.Scanner;

public class ForTimes {
    public static void main (String[] args) {
        //Declare & initialize variables
        Scanner scan = new Scanner(System.in);
        final int TABLE_SIZE = 15;
        int number, product;
        boolean validNumber = false;

        // Loop until a valid number is entered
        do {
            System.out.println("Which times table shall I recite?");
            if(scan.hasNextInt()) {
                number = scan.nextInt();
                validNumber = true;
                // For loop with TABLE_SIZE iterations
                for (int i = 1; i <= TABLE_SIZE; i++) {
                    product = i * number;
                    System.out.println(i + " * " + number + " is: " + product);
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scan.next(); //Clear the invalid input from the scanner
            }
        } while(!validNumber);
    }
}