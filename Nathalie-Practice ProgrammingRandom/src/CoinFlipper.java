import java.util.Random;
// simulates a random coin toss, but without using nextInt().

public class CoinFlipper {
    public static void main(String[] args){
        Random randomFlip = new Random();
        boolean isHeads = randomFlip.nextBoolean(); // generate a random boolean value

        System.out.println("Ready, Set, Flip....!!");
        if (isHeads) {
            System.out.println("You got HEADS!");
        } else {
            System.out.println("You got TAILS!");
        }
    }
}
