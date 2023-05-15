package flowcontrol.whiles;
import java.util.Random;

public class MaybeItLovesMe {
    public static void main(String[] args) {

        Random rng = new Random();
        int desiredOutput = rng.nextInt((89-13)+1) + 13;
        int lineNumber = 1;
        System.out.println("Well here goes nothing...");
        System.out.println("The random number is " + desiredOutput); //to see random number!
        while (lineNumber <= desiredOutput) {
            if (lineNumber % 2 == 0) {
                System.out.println("It loves me NOT!");
                lineNumber++;
            } else {
                System.out.println("It LOVES me!");
                lineNumber++;
            }
        }

        if (lineNumber % 2 == 0) {
//            System.out.println("lineNumber:"  + lineNumber);  //to know what is lineNumber
            System.out.println("Oh, wow! It really LOVES me!");
        } else {
            System.out.println("Awwww, bummer.");
        }

    }
}
