package com.sg.foundations.flowcontrol.fors;
import java.util.Scanner;

public class ForTimesFor {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Which times table shall I recite? ");
        int number = userInput.nextInt();

        int correctCount = 0;

        for (int i = 1; i <= 15; i++) {
            int result = i * number;

            System.out.print(i + " * " + number + " is: ");
            int userAnswer = userInput.nextInt();

            if (userAnswer == result) {
                System.out.println("Correct!");
                correctCount++;
            } else {
                System.out.println("Sorry no, the answer is: " + result);
            }
        }

        System.out.println("You got " + correctCount + " correct.");
    }
}
