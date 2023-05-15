import java.util.Random;

// Practice Problem - Fortune Cookie
// by Michaela Kramer
// Week 1

public class FortuneCookie {
    public static void main (String[] args) {

        Random random = new Random();
        String[] fortunes = new String[10];

        fortunes[0] = "Those aren't the droids you're looking for.";
        fortunes[1] = "Never go in against a Sicilian when death is on the line!";
        fortunes[2] = "Goonies never say die.";
        fortunes[3] = "With great power, there must also come — great responsibility.";
        fortunes[4] = "Never argue with the data.";
        fortunes[5] = "Try not. Do, or do not. There is no try.";
        fortunes[6] = "You are a leaf on the wind, watch how you soar.";
        fortunes[7] = "Do absolutely nothing, and it will be everything that you thought it could be.";
        fortunes[8] = "Kneel before Zod.";
        fortunes[9] = "Make it so.";

        Integer index = Math.abs(random.nextInt() % 10);
        System.out.println("Your Geek Fortune: " + fortunes[index]);

    }
}
