package flowcontrol.whiles;
import java.util.Scanner;
public class RollerCoasterIntro {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("We're going to go on a roller coaster...");
        System.out.println("Let me know when you want to get off...!");

        String keepRiding = "y";
        int loopsLooped = 0;
        while (keepRiding.equals("y")) {
            System.out.println("WHEEEEEEEEEEEEEeEeEEEEeEeeee.....!!!");
            System.out.print("Want to keep going? (y/n) :");
            keepRiding = userInput.nextLine();
            loopsLooped++;
        }

        System.out.println("Wow, that was FUN!");
        System.out.println("We looped that loop " + loopsLooped + " times!!");
        /*
        What happens if the user enters a value that is neither "y" nor "n"?
            The loop stays the same, the code is looking for either "y" or anything else. Any other key will stop the loop.

        What happens if we change the condition to check for a no answer instead?
            If we add another while loop for "n" it'll result in an infinite loop!
            while (keepRiding.equals("n")) {
                    System.out.println("Wow, that was FUN!");
                    System.out.println("We looped that loop " + loopsLooped + " times!!");
               }

             */
    }
}
