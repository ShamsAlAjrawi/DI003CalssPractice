
package com.mycompany.forandtwentyblackbirds;

/**
 *
 * @author melissaaugustin
 */
// This one was easy. First I checked that the code provided worked with no error. Then I changed the <20 to <24 instead on line 14 to make the output go up to 24 birds.//

public class ForAndTwentyBlackbirds {

    public static void main(String[] args) {
        int birdsInPie = 0;
        for (int i = 0; i < 24; i++) {
            System.out.println("Blackbird #" + i + " goes into the pie!");
            birdsInPie++;
        }

        System.out.println("There are " + birdsInPie + " birds in there!");
        System.out.println("Quite the pie full!");
    }
}
