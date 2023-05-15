package variables;

public class MoreBucketsMoreFun {
    public static void main(String[] args) {
        // Declare ALL THE THINGS
        // (Usually it's a good idea to declare them at the beginning of the program)
        int butterflies, beetles, bugs;

        // Now give a couple of them some values
        butterflies = 5;
        beetles = 9;

        bugs = butterflies + beetles;         //we assign butterflies + beetles to bugs, Any further changes to butterflies or beetles does not affect bugs.
        System.out.println("There are only " + butterflies + " butterflies,");
        System.out.println("but there are " + bugs + " bugs in all.");

        System.out.println("Uh oh, my dog ate one.");
        butterflies--;            //-- to decrement (subtract) the value by 1
        System.out.println("Now there are only " + butterflies + " butterflies left.");
        bugs = butterflies + beetles; //update bugs here!
        System.out.println("But there are still " + bugs + " bugs left...");
        System.out.println("Wait a minute!");
        System.out.println("... maybe my computer can't do math, after all!");
    }
}
