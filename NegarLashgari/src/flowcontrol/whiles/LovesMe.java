package flowcontrol.whiles;

public class LovesMe {
    public static void main(String[] args) {
        System.out.println("Well here goes nothing...");
        int lineNumber = 1;
        int petals = 34;
        while (lineNumber <=petals) {
            if (lineNumber % 2 == 1) {
                System.out.println("It loves me NOT!");
                lineNumber++;
            } else {
                System.out.println("It LOVES me!");
                lineNumber++;
            }
        }
        System.out.println("I knew it! It LOVES ME!");
        //Did you use a while loop or do-while loop? Why?
        //  --When using a while loop, if there are no petals in the flower, there is no message
        // When using a do while loop, even if there are no petas in the flower, a message is displayed
        // as the loop runs once even if the condition is false
    }
}
