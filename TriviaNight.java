import java.util.Scanner;

public class TriviaNight {

    public static void main (String[] args){
        Scanner myScanner = new Scanner(System.in);


        System.out.println("It's TRIVIA NIGHT! Are you ready?!");

        // first question
        System.out.println("First question!");
        System.out.println("What is the Lowest Level Programming Language?\n" +
                "1) Source Code\t\t2) Assembly Language\n" +
                "3) C#\t\t\t\t4) Machine Code");

        int correct = 0;
        System.out.println("Your answer: ");
        int answer = myScanner.nextInt();

        if (answer == 4)
        {
            ++correct;
            System.out.println("Correct!");
        }
        else
            System.out.println("Oops, wrong answer :/");

        //second question
        System.out.println("Second question!");
        System.out.println("Website Security CAPTCHA Forms Are Descended From the Work of?\n" +
                "1) Grace Hopper\t\t2) Alan Turing\n" +
                "3) Charles Babbage\t\t4) Larry Page");
        System.out.println("Your answer: ");

        answer = myScanner.nextInt();

        if (answer == 2)
        {
            ++correct;
            System.out.println("Correct!");
        }
        else
            System.out.println("Oops, wrong answer :/");


        //third question
        System.out.println("Last question!");
        System.out.println("Which of These Sci-Fi Ships Was Once Slated for a Full-Size Replica in Las Vegas?\n" +
                "1) Serenity\t\t\t2) The Battlestar Galactica\n" +
                "3) The USS Enterprise\t4) The Millennium Falcon");
        System.out.println("Your answer: ");
        answer = myScanner.nextInt();

        if (answer == 3)
        {
            ++correct;
            System.out.println("Correct!");
        }
        else
            System.out.println("Oops, wrong answer :/");

        if (correct == 3)
            System.out.println("Congratulations! You finished the quiz with a 3/3 score!");
        else
            System.out.println("You finished the Trivia quiz! You scored " + correct + " out of 3!");


    }
}
