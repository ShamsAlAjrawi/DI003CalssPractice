
package com.wileyedge.yuliet.javabasicstudy.practiceprogramming;

import java.util.Scanner;

public class StayPositive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("What number should I count down from? ");
        int startingNumber = sc.nextInt();
        
        System.out.println("\nHere goes! \n");
                
        for(int i = startingNumber; i > 0; i-=11){
            for(int j = 0; j<10;j++){
                if(i-j<0)
                    break;
                System.out.print((i-j) + " ");
            }
            System.out.println("\n");
        }          
        System.out.println("\nBlast off!");
    }
}
