
package com.wileyedge.yuliet.javabasicstudy.methods;

import java.util.Scanner;

public class MethodToTheMadness {

    public static void main(String[] args) {
        eatMe();
        //drinkMe();
        /*
        System.out.println("\nThe number is: " + drinkMeNumberInt());
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to compare: ");
        int num = sc.nextInt();
        System.out.println("The number is bigger than cero? " + drinkMeBoolean(num));*/

        System.out.println("\n - Lewis Carroll, Alice in Wonderland");
    }

    static void eatMe(){
        System.out.println(" 'But I don’t want to go among mad people,' Alice remarked.");
        System.out.println(" 'Oh, you can’t help that,' said the Cat.");
        System.out.print(" 'We’re all mad here. I’m mad. You’re mad.'");
    }

    static void drinkMe(){
        System.out.println(" 'How do you know I’m mad?' said Alice.");
        System.out.println(" 'You must be,' said the Cat, 'or you wouldn’t have come here.' ");
    }
    static int drinkMeNumberInt(){
        return 1;
    }
    static boolean drinkMeBoolean(int n){
        if(n>0){
            return true;
        }
        return false;
        
    }
    
}
