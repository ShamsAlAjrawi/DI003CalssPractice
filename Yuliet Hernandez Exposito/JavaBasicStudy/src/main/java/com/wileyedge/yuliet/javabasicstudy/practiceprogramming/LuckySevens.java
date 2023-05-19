
package com.wileyedge.yuliet.javabasicstudy.practiceprogramming;

import java.util.Random;
import java.util.Scanner;

public class LuckySevens {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("How many dollars do you have? ");
        int dollars = sc.nextInt();
        int trackRolls = 0, maximumAmount=0, rollsMaxHeld = 0;        
        
        while(dollars != 0){
            int dice1 = rd.nextInt(6)+1, dice2 = rd.nextInt(6)+1;
            trackRolls ++;
            if(dice1 + dice2 == 7){
                dollars += 4;
                System.out.println("You win $4, you have until now: " + dollars);                
                if(dollars > maximumAmount){
                    maximumAmount = dollars;
                    rollsMaxHeld = trackRolls;
                }
            }else{
                dollars --;
                System.out.println("You lost $1, you have until now: " + dollars);                
            }            
        }
        System.out.println("You are broke after " + trackRolls + " rolls.");
        System.out.println("You should have quit after " + rollsMaxHeld + " rolls when you had " + maximumAmount + ".");
    }    
}
