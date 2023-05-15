package scanner;

import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int age;
        //Ask user age
        System.out.println("What's your age?");
        age = Integer.parseInt(userInput.nextLine());

        //Calculate max Heart and Target rates
        int max = 220 - age;
        int range1 =(int) Math.round(max * 0.5);
        int range2 = (int) Math.round(max * 0.85); //_ 144 without Math.round
        //double range1 =max * 0.5;
        //double range2 = max * 0.85; //-144.5 but example is -145 ?!

        //Display results
        System.out.println("Your maximum heart rate should be " + max + " beats per minute.");
        System.out.println("Your target HR Zone is " + range1 + " _ " + range2 + " beats per minute.");
    }
}
