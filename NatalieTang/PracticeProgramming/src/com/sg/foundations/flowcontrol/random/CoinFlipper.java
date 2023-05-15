package com.sg.foundations.flowcontrol.random;
import java.util.Random;

public class CoinFlipper {
    public static void main(String[] args){
        Random randomizer = new Random();

        System.out.println("Ready, Set, Flip....!!");

        boolean isHeads = randomizer.nextBoolean();

        if (isHeads) {
            System.out.println("You got HEADS!");
        }
        else {
            System.out.println("You got TAILS!");
        }
    }
}
