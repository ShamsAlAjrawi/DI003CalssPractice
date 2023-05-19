/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.wileyedgeka.thecount;

/**
 *
 * @author Korinna
 * @purpose Counting Program
 */


import java.util.Scanner;

public class TheCount {

    public static void main(String[] args) {
        
         //Declare Variables
        int startCount;
        int endCount;
        int incrementBy;
        int counter = 0;
        
        //Declare and Initialize the Scanner
        Scanner myScanner = new Scanner(System.in);
        
        //Initate Prompts
        
        System.out.println("*** I LOVE TO COUNT! LET ME SHARE MY COUNTING WITH YOU! ***");
        
        System.out.println("Start at:");
        startCount = myScanner.nextInt();
        
        System.out.println("Stop at:");
        endCount = myScanner.nextInt();
        
        System.out.println("Count by:");
        incrementBy = myScanner.nextInt();
        
        //FOR Loop created to count by user preferred increment
        
        for (int i = startCount; i <= endCount; i+=incrementBy) {
               
            System.out.print(i + " ");
            counter++;
            
            if (counter % 3 == 0) {
                System.out.print(" --ah ah ah!\n");
            }
            
            
            
            
              
            
        }
        
    }
}
