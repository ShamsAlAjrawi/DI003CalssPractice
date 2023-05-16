/**
 * Practice different ways to set up the parts of a for loop.
 *
 * @author Rania Ouassif
 */

package org.practice;

public class SpringForwardFallBack {
    public static void main(String[] args) {

        System.out.println("It's Spring...!");
        // 1st loop : start -> i = 0 ; end -> i = 9 (10 iterations)
        for (int i = 0; i < 10; i++) {
            System.out.print(i + ", ");
        }

        System.out.println("\nOh no, it's fall...");
        // 2nd loop : start -> i = 10 ; end -> i = 1 (10 iterations)
        for (int i = 10; i > 0; i--) {
            System.out.print(i + ", ");
        }

        //Question 2
        System.out.println("\nOh no, it's fall...");
        // Changing the starting point
//        for (int i = 9; i >= 0; i--) {
//            System.out.print(i + ", ");
//        }
    }
}