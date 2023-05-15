package com.sg.foundations.scanner;

import java.util.Scanner;

public class AllTheTrivia {
  public static void main(String[] args) {
    String one, two, three, four;
    Scanner inputReader = new Scanner(System.in);

    System.out.println("What unit is equivalent to 1,024 Gigabytes? ");
    one = inputReader.nextLine();

    System.out.println("Which planet is the only one that rotates clockwise in our Solar System? ");
    two = inputReader.nextLine();

    System.out.println("The largest volcano ever discovered in our Solar System is located on which planet? ");
    three = inputReader.nextLine();

    System.out.println("What is the most abundant element in the earth's atmosphere? ");
    four = inputReader.nextLine();

    System.out.println("Wow, 1,024 Gigabytes is a " + three + "!");
    System.out.println("I didn't know that the largest ever volcano was discovered on " + two +"!");
    System.out.println("That's amazing that " + one + " is the most abundant element in the earth's atmosphere.");
    System.out.println(four + " is the only planet that rotates clockwise, neat!");
  }
}
