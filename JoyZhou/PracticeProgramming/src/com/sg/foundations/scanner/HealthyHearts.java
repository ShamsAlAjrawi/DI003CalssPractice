package com.sg.foundations.scanner;

import java.util.Scanner;

public class HealthyHearts {
  public static void main(String[] args) {
    int age, max;
    Scanner inputReader = new Scanner(System.in);

    System.out.println("What is your age? ");
    age = Integer.parseInt(inputReader.nextLine());
    max = 220 - age;
    System.out.println("Your maximum heart rate should be " + max + " beats per minute.");
    System.out.println("Your target HR Zone is " + (max*0.5) + " - " + (max*0.85) + " beats per minute.");

  }
}
