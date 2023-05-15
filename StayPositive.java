package org.example.assigned;

import java.util.Scanner;

public class StayPositive {
    public static void main(String[] args) {
        int numCount;
        int lineCount = 0;

        Scanner sc = new Scanner(System.in);

        // check validity of input (!null/!empty/positive integer)
        while (true) {
            System.out.println("What number should I count down from?");
            String input = sc.nextLine();

            if (input == null || input.isEmpty() || !input.matches("[0-9]+")){
                System.out.println("Invalid input. Please try again.");
            } else {
                numCount = Integer.parseInt(input);
                break;
            }
        }

        System.out.println("\nHere goes!\n");

        // print out 10 numbers a line
        for (int i = numCount; i >= 0; i--) {
            System.out.print(i+" ");

            lineCount++;

            if (lineCount == 10) {
                System.out.println();
                lineCount = 0;
            }
        }

        System.out.println("\nBlast off!");
    }
}
