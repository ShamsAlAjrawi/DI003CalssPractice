/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.gabrielag.random;

import java.util.Random;

/**
 *
 * @author Gabriela Gutierrez
 */
public class CoinFlipper {

    public static void main(String[] args) {
        String output;
        Random coinFlip = new Random();
        
        // Simulate the coin flip
        boolean result = coinFlip.nextBoolean();
        
        if(result != false){
            output = "TAILS";
        } else {
            output = "HEADS";
        }
        
        // Print Statements
        System.out.println("Ready, Set, Flip....!!");
        System.out.println("You got " + output + "!");
    }
}
