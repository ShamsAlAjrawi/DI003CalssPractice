package DI003CalssPractice.SalmaKhairat;

import java.util.Scanner;

public class RollerCoaster {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("We're going to go on a roller coaster...");
        System.out.println("Let me know when you want to get off...!");

        String keepRiding = "y";
        boolean enteredCorrect = true;
        int loopsLooped = 0;
        //anything but a n will continue the loop
        while (keepRiding.equals("y")) {
            System.out.print(enteredCorrect ? "WHEEEEEEEEEEEEEeEeEEEEeEeeee.....!!!\n" : "");
            System.out.print(enteredCorrect ? "Want to keep going? (y/n) :\n" : "");
            keepRiding = userInput.nextLine();
            if (!keepRiding.equals("n") && !keepRiding.equals("y")) {
                System.out.println("Please input either 'y' or 'n'");
                enteredCorrect = false;
                keepRiding = "y";
            } else {
                loopsLooped++;
                enteredCorrect = true;
            }

        }

        System.out.println("Wow, that was FUN!");
        System.out.println("We looped that loop " + loopsLooped + " times!!");
    }
}
