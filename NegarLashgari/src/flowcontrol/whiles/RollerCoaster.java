package flowcontrol.whiles;

import java.util.Scanner;
public class RollerCoaster {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("We're going to go on a roller coaster...");
        System.out.println("Let me know when you want to get off...!");

        String keepRiding = "y";
        boolean enterCorrect = true;
        int loopsLooped = 0;
        while (keepRiding.equals("y")) {
            System.out.print(enterCorrect ? "WHEEEEEEEEEEEEEeEeEEEEeEeeee.....!!!\n" : "");
            System.out.print(enterCorrect ? "Want to keep going? (y/n) :\n" : "");
            keepRiding = userInput.nextLine();
            if (!keepRiding.equals("y") && !keepRiding.equals("n")){  // it should be &&(AND) and not ||(OR)
                System.out.println("Please enter y or n");
                enterCorrect = false;
                keepRiding = "y";
            } else {
                loopsLooped++;
                enterCorrect = true;
            }
        }
        System.out.println("Wow, that was FUN!");
        System.out.println("We looped that loop " + loopsLooped + " times!!");
    }
}
