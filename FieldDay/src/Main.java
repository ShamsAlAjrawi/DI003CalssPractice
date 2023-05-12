import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your last name? ");
        String lastName = (scanner.nextLine()).toLowerCase();

        String team;

        if (lastName.compareTo("baggins") <= 0) {
            team = "Red Dragons";
        } else if (lastName.compareTo("dresden") <= 0) {
            team = "Dark Wizards";
        } else if (lastName.compareTo("howl") <= 0) {
            team = "Moving Castles";
        } else if (lastName.compareTo("potter") <= 0) {
            team = "Golden Snitches";
        } else if (lastName.compareTo("vimes") <= 0) {
            team = "Night Guards";
        } else {
            team = "Black Holes";
        }

        System.out.println("Aha! You're on the team \"" + team + "\"!");
        System.out.println("Good luck in the games!");

    }
}