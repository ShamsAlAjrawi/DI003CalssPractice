package flowcontrol.whiles;

import java.util.Scanner;

public class StayPositive {
    public static void main(String[] args) {

        int num;
        Scanner userInput = new Scanner(System.in);
        System.out.println("What number should I count down from?");
        String input = userInput.nextLine();
        num = Integer.parseInt(input);

        //BONUS: Add a step that verifies that the input value is a positive integer and responds appropriately if it is not.
        if (num < 0) { //my question: How can we verify the user has not selected a double number ?!
            System.out.println("The input value should be a positive integer, please select another number! :)");
        } else {
            int lineCount = 0; //lineCount represents number of nums in a single line which we want to be 10.
            //Set up the output to display 10 values per line and then start a new line:

            for (int i = num; i >=0; i--) {
                System.out.print(i + " ");
                lineCount++;
                if(lineCount == 10) {
                    System.out.println();
                    lineCount= 0;
                }
            }
            System.out.println("\nBlast off!!");
        }
    }
}
