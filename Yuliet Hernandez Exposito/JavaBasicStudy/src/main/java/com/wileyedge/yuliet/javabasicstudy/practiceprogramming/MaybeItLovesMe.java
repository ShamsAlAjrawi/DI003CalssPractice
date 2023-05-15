
package com.wileyedge.yuliet.javabasicstudy.practiceprogramming;

import java.util.Random;

public class MaybeItLovesMe {

    public static void main(String[] args) {
        System.out.println("Well here goes nothing...\n");
        
        Random rd = new Random();
        int numberPetal=0;
        do{
            numberPetal = rd.nextInt(34+1);
        }while(numberPetal<13);
        
        boolean lovesMe = false;
        
        for(int i = 1; i<numberPetal; i++){
            if(i%2!=0){
                System.out.println("It loves me NOT!");
                lovesMe = false;
            }else{
                System.out.println("It loves me!");
                lovesMe = true;
            }
        }
        
        if(lovesMe){
            System.out.println("\nOh, wow! It really LOVES me!");
        }else{
            System.out.println("\nAwwww, bummer");
        }
    }
    
}
