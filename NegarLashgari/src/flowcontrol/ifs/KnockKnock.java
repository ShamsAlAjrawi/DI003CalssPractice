package flowcontrol.ifs;

import java.util.Scanner;

public class KnockKnock {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        System.out.print("Knock Knock! Guess who!! ");
        String nameGuess = inputReader.nextLine();

        //The equals() method compares the "value" inside String instances
        // (what we need here) while the == operator compares if the objects points to the same memory location

        if (nameGuess.toLowerCase().equals("marty mcfly")) {
            System.out.println("Hey! That's right! I'm back!"); //with == operator, the condition is always false even if the Strings match
            System.out.println(".... from the Future.");
        } else {
            System.out.println("Dude, do I -look- like " + nameGuess);
        }
        /*
        If improper capitalization is used, the strings won't match.
          A potential fix is to use the toUpperCase() (with submission all caps ) or toLowerCase() (with submission all lower)
          String methods.
         Then they will match i.e. nameGuess = nameGuess.toLowerCase() and change Marty McFly to marty mcfly,
         so it'll work with all different cases of capital letters!

          another way:
          String nameGuess = (inputReader.nextLine()).toLowerCase();
            if (nameGuess.equals(("Marty McFly").toLowerCase())) {...
         */
    }

}
