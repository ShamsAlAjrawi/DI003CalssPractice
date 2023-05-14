
package com.wileyedge.yuliet.javabasicstudy.practiceprogramming;

import java.util.Random;

public class LovesMe {
    public static void main(String[] args){
        System.out.println("Well here goes nothing...\n");
        
        Random rd = new Random();
        int numberPetal = rd.nextInt(34+1);
        boolean lovesMe=false;
        
        for(int i = 1; i<numberPetal; i++){
            if(i%2!=0){
                System.out.println("It loves me NOT!");
                lovesMe=false;
            }else{
                System.out.println("It loves me!");
                lovesMe=true;
            }
        }
        
        if(lovesMe){
            System.out.println("\nI knew it! It LOVES ME!");
        }else{
            System.out.println("\nI am sad...He doesn't love me!");
        }
        
    }
}
