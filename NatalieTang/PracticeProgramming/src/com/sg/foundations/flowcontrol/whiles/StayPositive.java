package com.sg.foundations.flowcontrol.whiles;

public class StayPositive {
    public static void main (String[] args) {
        int i = 10;

        System.out.println("Counting down...");
        System.out.println();
        while (i >= 0){
            System.out.println(i);
            i--;
        }
    }
}
