package flowcontrol.ifs;

import java.util.Arrays;
import java.util.Scanner;

public class TriviaNight {
    public static void main(String[] args) {

        int answer;
        int correctAnswer = 0;

        System.out.println("It's TRIVIA NIGHT! Are you ready?!\n\nFIRST QUESTION!");
        System.out.println("What is the Lowest Level Programming Language?");
        System.out.println("1) Source Code        2) Assembly Language\n3) C#       4) Machine Code");
        Scanner userInput = new Scanner(System.in);
        answer = Integer.parseInt(userInput.nextLine());

        //check if user only chooses numbers 1-4
        while (answer <= 0 || answer >= 5) {
            System.out.println("Nice try! That wasn't a number...Try it again");
            answer = Integer.parseInt(userInput.nextLine());
        }

        System.out.println("\nYOUR ANSWER:  "+ answer);

            if (answer == 4) {
                ++correctAnswer;
                System.out.println("You are correct!");
            } else {
                System.out.println("Nope that's wrong!");
                System.out.println("You've got " + correctAnswer + " right");
            }


        System.out.println("\nSECOND QUESTION!\nWebsite Security CAPTCHA Forms Are Descended From the Work of?");
        System.out.println("1) Grace Hopper        2) Alan Turing\n3) Charles Babbage       4) Larry Page");
        answer = Integer.parseInt(userInput.nextLine());

        System.out.println("\nYOUR ANSWER:  "+ answer);

        if (answer ==2) {
            ++correctAnswer;
            System.out.println("You are correct!");
            System.out.println("You've got " + correctAnswer + " right so far!");
        } else {
            System.out.println("Nope that's wrong!");
            System.out.println("You've got " + correctAnswer + " right so far!");
        }

        System.out.println("\nLAST QUESTION!\nWhich of These Sci-Fi Ships Was Once Slated for a Full-Size Replica in Las Vegas?");
        System.out.println("1) Serenity        2) The Battlestar Galactica\n3) The USS Enterprise       4) The Millennium Falcon");
        answer = Integer.parseInt(userInput.nextLine());

        System.out.println("\nYOUR ANSWER:  "+ answer);

        if (answer ==3) {
            ++correctAnswer;
            System.out.println("You are correct!");
            System.out.println("You've got " + correctAnswer + " right!");
        } else {
            System.out.println("Nope that's wrong!");
            System.out.println("You've got " + correctAnswer + " right");
        }

        if (correctAnswer == 3) {
            System.out.println("\nFINAL RESULT:\nNice job - you got 3 correct!");
        } else if (correctAnswer == 2) {
            System.out.println("\nFINAL RESULT:\nWell done - you got 2 correct!");
        } else if (correctAnswer == 1) {
            System.out.println("\nFINAL RESULT:\nYou only got 1 correct!");
        } else {
            System.out.println("\nFINAL RESULT:\nSorry, you could not answer questions correctly!");
        }
    }
}
