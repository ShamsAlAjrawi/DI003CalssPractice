import java.util.*;

//////////////////////////////////////////////////
//
// All the Trivia
// 5/10/2023
//
// Write a small trivia game.
// Ask the user for several pieces of trivia, but when you display them, mix up the answers.
//
//////////////////////////////////////////////////
public class AllTheTrivia {
    
    public static void main(String[] args) {

        // the number of trivia questions can be increased by changing this
        int max = 4;

        // pre-written questions
        String[] questions = new String[max];
        questions[0] = "What singer was known for her hit 'Baby One More Time' ?";
        questions[1] = "Which American president was the only one to be impeached twice?";
        questions[2] = "Who invented the test that measures whether computer conversation is distinguishable from a person?";
        questions[3] = "Which celebrity was known on Netflix for his show about big cats?";

        // will hold the user's input
        String[] answers = new String[max];

        // for retrieving user input
        Scanner myScanner = new Scanner(System.in);

        // print all questions and collect all answers
        for (int i = 0; i < max; i++) {
            System.out.println(questions[i]);
            answers[i] = myScanner.nextLine();
        }

        // shuffle all answers
        String[] responses = answerMixer(max, answers);

        // get indexes to shuffle all responses
        Integer[] randomIndexes = randomizer(max);

        // print responses in a random order
        for (int i = 0; i < max; i++) {
            System.out.println(responses[randomIndexes[i]]);
        }
    }

    // reorders all the answers to be in a different order than their question counterparts
    public static String[] answerMixer(Integer max, String[] answers) {

        // shuffle the indexes of all answers
        Integer[] randomIndexes = randomizer(max);

        // pre-written responses
        String[] responses = new String[max];
        responses[0] = "Other hits by " + answers[randomIndexes[0]] + " include 'Toxic' and 'Oops! ... I Did It Again'.";
        responses[1] = answers[randomIndexes[1]] + " made headlines for obstruction of Congress and inciting an insurrection.";
        responses[2] = "During WWII, " + answers[randomIndexes[2]] + " cracked ciphers that allowed German messages to be intercepted.";
        responses[3] = answers[randomIndexes[3]] + " is never going to financially recover from this.";

        return responses;
    }

    // takes values 0-max and returns a shuffled array
    public static Integer[] randomizer(Integer max) {

        // declare an array of ints and populate it with values
        Integer[] result = new Integer[max];

        for (int i = 0; i < max; i++) {
            result[i] = i;
        }

        // shuffle the array contents
        Collections.shuffle(Arrays.asList(result));

        return result;
    }
}