package flowcontrol.ifs;

import java.util.Scanner;

public class FieldDay {

    public static void main(String[] args) {
        String team = "";
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What's your last name?");
        String lastName = myScanner.nextLine();
        lastName = lastName.toLowerCase();
        //Tip: I just added toLowerCase() here and change names to all lower case!


        //Tip: Use compareToIgnoreCase() to compare two strings, ignoring lower case and upper case differences.
        if (lastName.compareTo("baggins") <= 0) {
            team = "Red Dragons";
        } else if (lastName.compareTo("baggins") >= 0 && lastName.compareTo("dresden") < 0) { //after Baggins, but before Dresden
            team = "Dark Wizards";
        } else if (lastName.compareTo("dresden") >= 0 && lastName.compareTo("howl") < 0) {  //after Dresden, but before Howl
            team = "Moving Castles";
        } else if (lastName.compareTo("howl") >= 0 && lastName.compareTo("potter") < 0) {   //after Howl, but before Potter
            team = "Golden Snitches";
        } else if (lastName.compareTo("potter") >= 0 && lastName.compareTo("vimes") < 0) {  //after Potter, but before Vimes
            team = "Night Guards";
        } else if (lastName.compareTo("vimes") >= 0) {   //after Vimes
            team = "Black Holes";
        }

        System.out.println("Aha! " + lastName + "! You're on the team \"" + team + "\"!");
        System.out.println("Good luck in the games!");

    }
}
