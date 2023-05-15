import java.util.Scanner;

class PassingTheTuringTest {
    public static void main(String[] args) {
        Scanner userResponse = new Scanner(System.in);
        System.out.println("Hi, I'm Chatty the chat bot! What's your name, friend :)?");
        String name = userResponse.nextLine();
        System.out.println("Hi " + name + " :3");
        System.out.println("What's your favourite colour???");
        String colour = userResponse.nextLine();
        System.out.println("Ah yes, " + colour + " is pretty cool. I like aubergine ;)");
        System.out.println("Ok, whats your favourite number?");
        String number = userResponse.nextLine();
        System.out.println("Your fav number is " + number + " ??? Same!!! :o");
        System.out.println("Wow we have so much in common! Thanks for chatting with me buddy :D!!!");


    }
}
/*
Class Name: PassingTheTuringTest
Create a new class that uses user input in a conversation, with the following steps:

Ask the user for their name.
Display that name and tell them yours (or your AI's name!).
Ask them for their favorite color.
Display the color they enter in a conversational way.
Do the same thing with favorite food and number, and then say goodbye!
Make sure you use the right variable with the right user input!
*/
