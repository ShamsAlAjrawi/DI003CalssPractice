import java.util.Random;

public class Opinionator {
    public static void main(String[] args) {

        Random randomizer = new Random();

        System.out.println("I can't decide what animal I like the best.");
        System.out.println("I know! Random can decide FOR ME!");

        int x = randomizer.nextInt(6);

        System.out.println("The number we chose was: " + x);

        switch (x) {
            case 0:
                System.out.println("Llamas are the best!");
                break;
            case 1:
                System.out.println("Dodos are the best!");
                break;
            case 2:
                System.out.println("Woolly mammoths are DEFINITELY the best!");
                break;
            case 3:
                System.out.println("Sharks are the greatest, they have their own week!");
                break;
            case 4:
                System.out.println("Cockatoos are just so awesomme!");
                break;
            case 5:
                System.out.println("Have you ever met a naked mole-rat? They're GREAT!");
                break;
            default:
                System.out.println("Will this show");
        }

        System.out.println("Thanks Random, maybe YOU'RE the best!");
    }
}

//I think the problem was tha Int x = 5; so it never would get to the case 5 so I changed it to 6