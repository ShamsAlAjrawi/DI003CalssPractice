package flowcontrol.ifs;
import java.util.Scanner;
public class MiniZork {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.print("Go to the house, or open the mailbox? ");   //first main question

        String action = userInput.nextLine();

        if (action.equals("open the mailbox")) {   // first option
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.print("Look inside or stick your hand in? ");
            action = userInput.nextLine();

            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.print("Run away or keep looking? ");
                action = userInput.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you alive. Possibly a wise choice.");
                }
            } else if (action.equals("stick your hand in")) {
                System.out.println("You've been eaten by a grue.");
            }
        } else if (action.equals("go to the house")) {   // second option
            System.out.println("It looks as though someone has broken into the house before ");
            System.out.println("There are warning signs scattered around");
            System.out.println("Would you like to continue or leave? ");
            action = userInput.nextLine();

            if (action.equals("continue")) {
                System.out.println("You notice the house is making a lot of creaking noises");
                System.out.println("There is also a sign saying the structure is unstable");
                System.out.print("Enter the house anyway or turn back? ");
                action = userInput.next();

                if (action.equals("enter the house")) {
                    System.out.println("Oh no! The house collapsed!");
                    System.out.println("You've been crushed");
                } else if (action.equals("turn back")) {
                    System.out.println("You decide to search the mailbox instead");
                    System.out.println("Good choice! you found some interesting vintage photos!");
                }
            } else if (action.equals("leave")) {
                System.out.println("The house looked on the brink of collapse anyway");
                System.out.println("Good choice - you've not been crushed");
                System.out.println("Go to the forest or go next to the river? ");  //Second main question

                action = userInput.nextLine();

                if (action.equals("go to the forest")) {
                    System.out.println("The forest is very dark as you approach ");
                    System.out.println("You hear odd whispering ");
                    System.out.println("Would you like to carry on or turn back? ");
                    action = userInput.next();

                    if (action.equals("carry on")) {
                        System.out.println("The forest is growing increasingly dark");
                        System.out.println("The whispering now sounds more like chanting");
                        System.out.print("Would you like to continue or search the fields instead? ");
                        action = userInput.next();

                        if (action.equals("continue")) {
                            System.out.println("Turns out, the forest is not a nice place");
                            System.out.println("You've been sacrificed");
                        } else if (action.equals("search the fields")) {
                            System.out.println("You decide to search the fields instead");
                            System.out.println("Good choice! you found some gold!");
                        }
                    } else  if(action.equals("turn back")) {
                        System.out.println("That forest is notorious for odd going ons");
                        System.out.println("Probably the correct choice");
                        System.out.println("You go and explore the house instead");
                    }
                } else if (action.equals("go next to the river")) {
                    System.out.println("The river is wide and slow.");
                    System.out.println("Would you like to touch the water or go back?");
                    action = userInput.nextLine();

                    if(action.equals("touch the water")){
                        System.out.println("The river is not a safe plase.");
                        System.out.println("You have been eaten by a big fish!");
                    } else if (action.equals("go back")) {
                        System.out.println("It seems you've lost your way");
                        System.out.println("Someone is getting closer to you...");
                        System.out.println("He has an axe and kills you...");
                    }
                }
            }
        }
    }
}
