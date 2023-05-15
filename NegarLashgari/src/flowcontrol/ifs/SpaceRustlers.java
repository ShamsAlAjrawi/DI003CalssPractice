package flowcontrol.ifs;

public class SpaceRustlers {
    public static void main(String[] args) {
        int spaceships = 10;
        int aliens = 25;
        int cows = 100;

        if(aliens > spaceships){
            System.out.println("Vrroom, vroom! Let's get going!");
        } else{
            System.out.println("There aren't enough green guys to drive these ships!");
        }


        if(cows == spaceships){
            System.out.println("Wow, way to plan ahead! JUST enough room for all these walking hamburgers!");
        } else if (cows > spaceships){
            System.out.println("Dangit! I don't how we're going to fit all these cows in here!");
        }  else {
            System.out.println("Too many ships! Not enough cows.");
        }


        // else if(aliens > cows) {
        if (aliens > cows) {
            System.out.println("Hurrah, we've got the grub! Hamburger party on Alpha Centauri!");
        } else if (aliens <= cows) {
            System.out.println("Oh no! The herds got restless and took over! Looks like we're hamburger now!!");
        }
        //What does the else if and if do? we want to consider multiple conditions
        //we want to consider multiple conditions
        // if statement: each statement is evaluated independently of each other,
        //If you remove the else from the else if, what does THAT do? (Answer in a comment)
        //each statement is evaluated independently of each other
    }
}
