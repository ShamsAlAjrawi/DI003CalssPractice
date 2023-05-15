/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.wileyedgeka.fortimesfor;

/**
 *
 * @author Korinna
 * @purpose Interactive times table quiz
 */

import java.util.Scanner;

public class ForTimesFor {

    public static void main(String[] args) {
        
         //Declare Variables
        int userInput;
        int answerInput;
        int correctAnswer;
        int points = 0;
        float percentage;
        
        //Declare and Initialize the Scanner
        Scanner myScanner = new Scanner(System.in);
        
        
        //Initiate User Prompt for times table
        System.out.println("Which times tables shall I recite?");
        
        userInput = myScanner.nextInt();
        
        
        //FOR Loop that initiates time tables quiz
        for (int i = 1; i <= 15; i++) {
            
            System.out.println(i + " * " + userInput + " is:" );
            
            answerInput = myScanner.nextInt();
            
            correctAnswer = i * userInput;
            
            if (answerInput == correctAnswer) {
                 System.out.println("Correct!" );
                 
                 points++;
            } else {
                 System.out.println("Sorry no, the answer is: " + correctAnswer);
            }    
            
            
        }
        
         //Print results based on user's score
         if (((points / 15) * 100) < 50) {
             System.out.println("You got " + points + " correct! Study More and Try Again!");
         } else if (((points / 15) * 100) > 90) {
             System.out.println("You got " + points + " correct! Congratulations!");
             
         } else {
             System.out.println("You got " + points + " correct!");
         }
        
        
        
    }
}
