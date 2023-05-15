package com.sg.foundations.flowcontrol.fors;
import java.util.Scanner;

public class ForTimes {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Which times table shall I recite? ");
        int number = userInput.nextInt();

        for (int i = 1; i <= 15; i++) {
            int result = i * number;
            System.out.println(i + " * " + number + " is: " + result);
        }
    }
}
