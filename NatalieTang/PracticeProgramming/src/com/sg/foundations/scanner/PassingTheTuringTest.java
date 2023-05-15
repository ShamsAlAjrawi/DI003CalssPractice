package com.sg.foundations.scanner;
import java.util.Scanner;


public class PassingTheTuringTest {
    public static void main(String[] args){
        Scanner inputReader = new Scanner(System.in);

        System.out.println("Hello there!");
        System.out.println("What's your name? ");
        String name = inputReader.nextLine();

        System.out.println("Hi, " + name + "! I'm Alice.");
        System.out.println("What's your favorite color? ");
        String favoriteColor = inputReader.nextLine();

        System.out.println("Huh, " + favoriteColor + "? Mine's Electric Lime.");
        System.out.println("I really like limes. They're my favorite fruit, too.");
        System.out.println("What's YOUR favorite fruit, " + name + "? ");
        String favoriteFood = inputReader.nextLine();

        System.out.println("Really? " + favoriteFood + "? That's wild!");
        System.out.println("Speaking of favorites, what's your favorite number? ");
        int favoriteNumber = Integer.parseInt(inputReader.nextLine());

        System.out.println(favoriteNumber + " is a cool number. Mine's -7.");
        System.out.println("Did you know " + favoriteNumber + " * -7 is " + (favoriteNumber * -7) + "? That's a cool number too!");

        System.out.println("\nWell, thanks for talking to me, " + name + "!");
    }
}
