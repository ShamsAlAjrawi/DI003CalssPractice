
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class KnockKnock {

    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        System.out.print("Knock Knock! Guess who!! ");
        String nameGuess = (inputReader.nextLine()).toLowerCase();

        if(nameGuess.equals(("Marty McFly").toLowerCase())){
            System.out.println("Hey! That's right! I'm back!");
            System.out.println(".... from the Future."); // Sorry, had to!
        }else{
            System.out.println("Dude, do I -look- like " + nameGuess);
        }
    }

}

/* It outputs the else statement if something other than marty mcfly is chosen, including numbers.
   When I use == it always goes to the else statement. .equals compares the content of the string and ==
    compares the memory addresses of the string. So to compare the contents of a string it is best to use .equals.
*/

/* If the input doesn't have the proper capitalization, it will output the else statement. To fix this, we can convert
the input to lowercase and marty mcfly to lowercase, so that it doesn't matter.
 */

