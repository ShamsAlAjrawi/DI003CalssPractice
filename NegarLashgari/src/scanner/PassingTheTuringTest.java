package scanner;

import java.util.Scanner;

public class PassingTheTuringTest {
    public static void main(String[] args) {
        String name, color, food;
        double number;


        Scanner inputReader = new Scanner(System.in);

        System.out.println("Hello there!\nWhat is your name?");
        name = inputReader.nextLine();
        System.out.println("Hi " + name + "! I'm Negar.");

        System.out.println("What's your favorite color?");
        color = inputReader.nextLine();
        System.out.println("huh, " + color + "? Mine's pink.");
        System.out.println("I really like pink. it's so beautiful...");

        System.out.println("What's your favorite food, " + name + "?");
        food = inputReader.nextLine();
        System.out.println("Really? " + food + "? That's wild!");

        System.out.println("Speaking of favorites, what's your favorite number?");
        number = Double.parseDouble(inputReader.nextLine());
        double multi = number * -7;
        System.out.println( number + " is a cool number, Mine is -7. Did you know " +  number + " * -7  is " + multi + "? That's a cool number too!");
        System.out.println("Well, thanks for talking to me, " + name + "!");
    }
}
