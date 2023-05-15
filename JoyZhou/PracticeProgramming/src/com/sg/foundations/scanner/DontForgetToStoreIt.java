package com.sg.foundations.scanner;

import java.util.Scanner;

public class DontForgetToStoreIt {
  public static void main(String[] args) {

    int meaningOfLifeAndEverything = 42;
    double pi = 3.14159;
    String cheese, color;

    Scanner inputReader = new Scanner(System.in);

    System.out.println("Give me pi to at least 5 decimals: ");
    Double.parseDouble(inputReader.nextLine());

    // We've used Double.parseDouble but meaningOfLifeAndEverything is an INT
    // so we'll have to use Integer.parseInt

    System.out.println("What is the meaning of life, the universe & everything? ");
    Integer.parseInt(inputReader.nextLine());

    System.out.println("What is your favorite kind of cheese? ");
    inputReader.nextLine();

    System.out.println("Do you like the color red or blue more? ");
    inputReader.nextLine();

    //        System.out.println("Ooh, " + color + " " + cheese +" sounds delicious!");
    //        System.out.println("The circumference of life is " +( 2 * pi * meaningOfLifeAndEverything));
  }
}
