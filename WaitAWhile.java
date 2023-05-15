package org.example.assigned;

/**
 What happens if you change bedTime's value to 11?
 - the while loop will loop until 10 instead of stopping at 9.
 What about using bedTime's original value, but changing timeNow to 11?
 - the while loop doesn't execute.
 If you comment out timeNow++ at the end of the loop, what happens?
 - stack overflow from recursion
 */
public class WaitAWhile {
    public static void main(String[] args) {
        int time = 5;
        int bedTime = 10;

        while (time < bedTime) {
            System.out.println("It's only "+ time + " o'clock!");
            System.out.println("I think I'll stay up just a liiiiittle longer....");
            time++;
        }

        System.out.println("Oh. It's " + time + " o'clock.");
        System.out.println("Guess I should go to bed ...");
    }
}
