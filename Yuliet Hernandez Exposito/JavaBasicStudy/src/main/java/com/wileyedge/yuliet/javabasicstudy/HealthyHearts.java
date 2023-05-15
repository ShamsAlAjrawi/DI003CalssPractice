
package com.wileyedge.yuliet.javabasicstudy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HealthyHearts {
    /*Make a calculator app that asks the user for their age and then uses this value to calculate and display the healthy heart rate range 
    they should use for exercising.
    - The maximum heart rate should be 220 - their age.
T   - he target heart rate zone is 50 - 85% of the maximum.
    */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("What is your age?: ");
            int age = scanner.nextInt();
            
            int maximumHeart = 220-age;            
            int targetHR_ZoneMin = (maximumHeart * 50)/100;
            int targetHR_ZoneMax = (maximumHeart * 85)/100;
            
            System.out.println("Your maximum heart rate should be " + maximumHeart + " beats per minute.");
            System.out.println("Your target HR Zone is " + targetHR_ZoneMin + " - " + targetHR_ZoneMax + " beats per minute.");
        }
        catch(InputMismatchException ex){
            System.out.println("It is not a number.");
        }
        finally{
            System.out.println("Program is finished");
        }
        
        /*
        String option = "not";
        try{
            do{            
                System.out.print("What is your age?: ");
                int age = scanner.nextInt();

                int maximumHeart = 220-age;            
                int targetHR_ZoneMin = (maximumHeart * 50)/100;
                int targetHR_ZoneMax = (maximumHeart * 85)/100;

                System.out.println("Your maximum heart rate should be " + maximumHeart + " beats per minute.");
                System.out.println("Your target HR Zone is " + targetHR_ZoneMin + " - " + targetHR_ZoneMax + " beats per minute.");
                
                System.out.print("Do you wanna exit the program?, enter yes for exit or not for continous: ");
                option = scanner.next();
                
            }while(option.equalsIgnoreCase("not"));
        }
        catch(InputMismatchException ex){
            System.out.println("It is not a number.");
        }
        finally{
            System.out.println("Program is finished");
            System.exit(0);
        }*/
        
        
    }
    
    
}
