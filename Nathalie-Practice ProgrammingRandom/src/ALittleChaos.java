import java.util.Random;

public class ALittleChaos {
    public static void main(String[] args){
        Random randomizer = new Random();

        System.out.println("Random can make integers: " + randomizer.nextInt());
        System.out.println("Or a double: " + randomizer.nextDouble());
        System.out.println("Or even a boolean: " + randomizer.nextBoolean());

        int num = randomizer.nextInt(100);

        System.out.println("You can store a randomized result: " + num);
        System.out.println("And use it over and over again: " + num + ", " + num);

        System.out.println("Or just keep generating new values");
        System.out.println("Here's a bunch of numbers from 0 - 100: ");

        System.out.print(randomizer.nextInt(51) + 50 + ", "); //changed here from .nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(51) + 50 + ", ");
        System.out.print(randomizer.nextInt(51) + 50 + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.println(randomizer.nextInt(101));

        //This part I added
        System.out.print(randomizer.nextInt(10) + ", ");
        System.out.print(randomizer.nextInt(5) + ", ");
        System.out.print(randomizer.nextInt(1000) + ", ");
    }
}
//The method nextInt(51) generates a random integer between 0  and 51
// This means that the possible values that can be generated are 0, 1, 2, ..., 49, and 50.
// The result of nextInt(51) is then added to 50 using the + operator.
// This shifts the range of possible values up by 50, so the possible values are now 50, 51, 52, ..., 99, and 100.

    /*  Can you include random numbers in a math statement?
        The short answer is “no.”

        The “random” numbers produced by programs produce a sequence which has random distribution but are not actually random.
        That is, given the same seed value a re-run will generate the exact same numbers as first time.

        A random-generating hardware could be, built. For example, a clock which runs much faster than the computer delay between instruction execution.
        Use the least significant digits of this clock as a random number. But this is engineering, not math.
        */

// It behaves the same way as the .nextInt(101) + ", ") but with less or more depending what I put in