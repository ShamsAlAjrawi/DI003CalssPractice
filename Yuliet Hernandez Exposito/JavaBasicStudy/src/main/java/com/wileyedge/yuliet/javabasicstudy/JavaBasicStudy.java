/**
 *@author Yuliet Hernandez Exposito
 *email: yuliethdez2020@gmail.com
 *date: 09/05/2023
 *purpose: My first Hello World program in an IDE
 */

package com.wileyedge.yuliet.javabasicstudy;

import java.util.Random;

public class JavaBasicStudy {

    public static void main(String[] args) {
        /*16.	Write code to generate a random number between 1 and 6.*/
        System.out.println(new Random().nextInt(5)+1);
        
        Random rng = new Random();
        // generate 10 numbers, each between 0 and 9
        for (int i=0; i<= 10; i++) {
            int randomNumber = rng.nextInt(10);
            System.out.println(randomNumber);
        }
        
        /*18.	Write code that generates the following output:*/
        System.out.println("Counting down...");
        for(int i = 10; i >= 0; i--){
            System.out.println(i);
        }        
        System.out.println("Blast off!");    
        
        //20. Write code that generates the following output: 1 \n 1 2\n ...6
        int cont;
        for(int i=1; i<=6;i++){
            cont = 1;
            while(cont<=i){
                System.out.print(cont + " ");
                cont++;
            }
            System.out.println();
        }
    }
    
    /*22. Create a method to calculate the area of a rectangle --> area = width * height*/        
    public static void areaRectangle(double width, double height){
        double area = width * height;
    }
    /*23.	Create a method to calculate the area of a triangle and return a value.--> area = (1/2) · b · h*/
    public static double areaTriangle(double base, double height){
        return 0.5 * base * height;
    }   
    
}
