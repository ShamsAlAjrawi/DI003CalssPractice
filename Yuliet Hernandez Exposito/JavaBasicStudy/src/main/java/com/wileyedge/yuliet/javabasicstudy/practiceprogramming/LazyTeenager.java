
package com.wileyedge.yuliet.javabasicstudy.practiceprogramming;

import java.util.Random;

public class LazyTeenager {

    public static void main(String[] args) {
        Random rd = new Random();
        int chanceCleaning = (rd.nextInt(100-10)+10)/10 * 10, chanceCounting = 0;
        boolean executeLazyTeenager = true;
        do{
            System.out.println("Random number is: " + chanceCleaning);
            System.out.println("Clean your room!! ");
            chanceCounting += 10;
            
            if(chanceCounting == 70){
                System.out.println("Clean your room!! That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
                break;
            }
            
            if(chanceCounting == chanceCleaning){
                System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
                executeLazyTeenager = false;
            }
            
        }while(executeLazyTeenager);
    }
    
}
