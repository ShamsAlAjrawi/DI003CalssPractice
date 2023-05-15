package flowcontrol.whiles;

public class WaitAWhile {

   /* What happens if you change bedTime's value to 11?
        -the while loop will loop until 10 instead of 9.
    What about using bedTime's original value, but changing timeNow to 11?
        -The while loop doesn't execute.
    If you comment out timeNow++ at the end of the loop, what happens?
        -the condition is always true and it's an infinite loop!
    */
    public static void main(String[] args) {
        int timeNow = 5;
        int bedTime = 10;

        while (timeNow < bedTime) {
            System.out.println("It's only " + timeNow + " o'clock!");
            System.out.println("I think I'll stay up just a liiiiittle longer....");
            timeNow++; // Time passes
        }

        System.out.println("Oh. It's " + timeNow + " o'clock.");
        System.out.println("Guess I should go to bed ...");
    }
}
