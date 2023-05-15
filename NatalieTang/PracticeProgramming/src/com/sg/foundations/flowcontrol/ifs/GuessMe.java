package com.sg.foundations.flowcontrol.ifs;
import java.util.Scanner;

public class GuessMe {
    public static void main(String[] args) {
        int number = 7;
        int guess = 0;

        Scanner myScanner = new Scanner(System.in);
        System.out.println("I've chosen a number. Betcha can't guess it!");
        System.out.println("Your guess: ");
        guess = myScanner.nextInt();

        if (guess == number) {
            System.out.println("Wow, nice guess! That was it!");
        }
        else if (guess < number) {
            System.out.println("Ha, nice try - too low! I chose " + number);
        }
        else {
            System.out.println("Too bad, way too high. I chose " + number);
        }
    }
}
