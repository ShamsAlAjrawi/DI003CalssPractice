package com.sg.foundations.scanner;

import java.util.Scanner;

public class DoItBetter {
  public static void main(String[] args) {
    int numMiles, hotDogs, numLangs;
    Scanner inputReader = new Scanner(System.in);

    System.out.println("How many miles can you run? ");
    numMiles = Integer.parseInt(inputReader.nextLine());
    System.out.println("Lame, I can run " + (numMiles * 2 + 1));

    System.out.println("How many hot dogs can you eat? ");
    hotDogs = Integer.parseInt(inputReader.nextLine());
    System.out.println("That's weak! I can eat " + (hotDogs * 2 + 1));

    System.out.println("How many languages do you know? ");
    numLangs = Integer.parseInt(inputReader.nextLine());
    System.out.println("You should get Duolingo, I know " + (numLangs * 2 + 1));
  }
}
