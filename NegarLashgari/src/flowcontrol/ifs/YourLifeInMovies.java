package flowcontrol.ifs;

import java.util.Scanner;

public class YourLifeInMovies {
    public static void main(String[] args) {
        String name;
        int year;

        Scanner userInput = new Scanner(System.in);
        System.out.println("Hey, let's play a game! What's your name?");
        name = userInput.nextLine();
        System.out.println("\nOk," + name + ", when were you born?");
        year = Integer.parseInt(userInput.nextLine());

        System.out.println("\nWell " + name + "...");

        if (year < 2005) {
            System.out.println("Did you know that Pixar's 'Up' came out over a decade ago?");
        } if (year < 1995) {
            System.out.println("and that the first Harry Potter came out over 15 years ago?");
        } if (year < 1985) {
            System.out.println("Also, Space Jam came out not last decade, but the one before THAT?");
        } if (year < 1975) {
            System.out.println("Did you know that the original Jurassic Park release is closer to the first lunar landing than it is to today?");
        } if (year < 1965) {
            System.out.println("Did you know that the MASH TV series has been around for almost half a century!?");
        }
    }
}
