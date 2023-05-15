package com.sg.foundations.flowcontrol.methods;

//TODO: Practice using parameters with the following program.

public class MatchWork {
    public static void main(String[] args) {
//     Fix the method calls by changing the ??? to the correct number of literal values.
//        ******How it was BEFORE the changes:**********
        /* System.out.println(" The word Cart should come before Horse alphabetically : " + comesBefore(???));
        System.out.println(" Half of 42 = " + halfOf(???));
        System.out.println(" (short) Pi = " + pi(???));
        System.out.println(" The first letter of the word Llama is: " + firstLetter(???));
        System.out.println(" 1337 x 1337 = " + times1337(???)); */

//        My changes:
//        I passed in the respective argument type(s) for each method
        System.out.println(" The word Cart should come before Horse alphabetically : " + comesBefore("Cart", "Horse"));
        System.out.println(" Half of 42 = " + halfOf(42));
        System.out.println(" (short) Pi = " + pi()); //This method didn't have a parameter, so no argument needs to be passed
        System.out.println(" The first letter of the word Llama is: " + firstLetter("Llama"));
        System.out.println(" 1337 x 1337 = " + times1337(1337));
    }

//    Methods:
    public static double pi(){
        return 3.14;
    }

    public static int times1337(int x){
        return x * 1337;
    }

    public static double halfOf(double y){
        return y / 2;
    }

    public static String firstLetter(String word){
        return word.substring(0, 1);
    }

//    Uses a built-in method to compare the strings, ignoring Uppercase letters
    public static boolean comesBefore(String a, String b){
        return a.compareToIgnoreCase(b) < 0;
    }
}
