
package com.wileyedge.yuliet.javabasicstudy.practiceprogramming;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessMeFinally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        Random rd = new Random();
        int max=100, min=-100, first=0;
        int number = (int) (rd.nextDouble()*(max - min)) + min;
        boolean won = false;
        
        System.out.println("I've chosen a number between -100 and 100. Betcha can't guess it! "+number);
        try{
            do{
                System.out.print("Your guess:");
                int numUser = sc.nextInt();
                if(numUser<number){
                    System.out.println("Ha, nice try - too low! Try again!");
                }else if(numUser>number){
                    System.out.println("Too bad, way too high. Try again!");
                }else if(number==numUser){
                    won=true;
                    if(first==0){
                        first++;
                        System.out.println("Wow, nice guess! That was it!");
                    }
            }
            }while(!won);
            if(first==0){
                System.out.println("Finally! It's about time you got it!");
            }       
        }
        catch(InputMismatchException ex){
            System.out.println("Sorry, you didn't input a number.");
        }
        finally{
            System.out.println("Program finished.");
        }
        
    }
}
