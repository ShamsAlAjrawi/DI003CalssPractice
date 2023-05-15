package scanner;

import java.util.Scanner;

public class MiniMadLibs {
    public static void main(String[] args) {
        String noun1, adj1, noun2, adj2, pluralNoun1, pluralNoun2, pluralNoun3, verb1, verb2;
        int number;

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Let's play MAD LIBS!\n\n");
        System.out.println("I need a noun:");
        noun1 = inputReader.nextLine();

        System.out.println("Now an adjective:");
        adj1 = inputReader.nextLine();

        System.out.println("Another noun:");
        noun2 = inputReader.nextLine();

        System.out.println("And a number:");
        number = Integer.parseInt(inputReader.nextLine());

        System.out.println("Another adjective:");
        adj2 = inputReader.nextLine();

        System.out.println("A plural noun:");
        pluralNoun1 = inputReader.nextLine();

        System.out.println("Another one:");
        pluralNoun2 = inputReader.nextLine();

        System.out.println("One more:");
        pluralNoun3 = inputReader.nextLine();

        System.out.println("A verb (infinitive form):");
        verb1 = inputReader.nextLine();

        System.out.println("Same verb (past participle):");
        verb2 = inputReader.nextLine();

        System.out.println("*** NOW LETS GET MAD (libs) ***");
        System.out.println(noun1 + ": the " + adj1 + " frontier. These are the voyages of the starship " + noun2 + ". Its " + number
        + "-year mission: to explore strange " + adj2 +" " + pluralNoun1 + ", to seek out " + adj2 + " " + pluralNoun2 +
                " and " + adj2 + " " + pluralNoun3 + ", to boldly " + verb1 + " where no one has " + verb2 + " before.");
    }
}
