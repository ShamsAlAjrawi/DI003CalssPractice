package flowcontrol.whiles;
import java.util.Scanner;
public class DoOrDoNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Should I do it? (y/n) ");
        boolean doIt;

        if (input.next().equals("y")) {
            doIt = true; // DO IT!
        } else {
            doIt = false; // DONT YOU DARE!
        }

        boolean iDidIt = false;

//        do {
//            iDidIt = true;
//            break;
//        } while (doIt);

        while(doIt) {
            iDidIt = true;
            break;
        }

        if (doIt && iDidIt) {
            System.out.println("I did it!");
        } else if (!doIt && iDidIt) {
            System.out.println("I know you said not to ... but I totally did anyways.");
        } else {
            System.out.println("Don't look at me, I didn't do anything!");
        }
        /*
        What does it print out if you tell it to do it?
            -I did it!
        What if you tell it not to?
            -I know you said not to ... but I totally did anyways.
            Because in a do-while, the code runs first and then checks the condition.

         When you just have a while loop, what prints out when you tell it to do it?
            -I did it! (same as before)
         When you tell it not to?
            - Don't look at me, I didn't do anything!

        */

    }
}
