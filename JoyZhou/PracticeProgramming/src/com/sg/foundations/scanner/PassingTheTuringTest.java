package com.sg.foundations.scanner;

import java.util.Scanner;

public class PassingTheTuringTest {
  public static void main(String[] args) {
    String yourName, faveColour, faveFruit;
    int faveNum;
    Scanner inputReader = new Scanner(System.in);

    System.out.println("Hello there!");
    System.out.println("What's your name? ");
    yourName = inputReader.nextLine();

    System.out.println("Hi, " + yourName + "! I'm Joy.");
    System.out.println("What's your favourite colour? ");
    faveColour = inputReader.nextLine();

    System.out.println("No way! Mine is also " + faveColour);

    System.out.println("I love a good watermelon, especially in the summer.");
    System.out.println("What's your favourite fruit, " + yourName + "?");
    faveFruit = inputReader.nextLine();

    System.out.println("Really, " + faveFruit + "?");
    System.out.println("What about your favourite number? ");
    faveNum = Integer.parseInt(inputReader.nextLine());

    System.out.println(faveNum + " is a good number. Mine is 15.");
    System.out.println("Thanks for talking to me, " + yourName + "! Have a great day.");


  }
}
