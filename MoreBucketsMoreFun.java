package org.example.assigned;

/**
 Class Name: MoreBucketsMoreFun
 Key the code below into a new class file named MoreBucketsMoreFun.java.
 Build and run it to make sure it works.
 What operator are we using to show that the dog ate a bug? (Answer in a comment.)
 - We're using a postfix operator.
 Why does the number of bugs not change when we change the number of butterflies? (Answer in a comment.)
 - Because the variable bugs is not stateful, it returns the same number of bugs that there were before we decremented  butterflies.
 - To fix this, we could have added another line (bugs = butterflies + x) after we decremented butterflies

 Input - void
 Expected output -
 There are only 5 butterflies,
 but there are 14 bugs in all.
 Uh oh, my dog ate one.
 Now there are only 4 butterflies left.
 But still 14 bugs left, wait a minute!
 Maybe my computer can't do math, after all!
 */

public class MoreBucketsMoreFun {
    public static void main (String[] args) {
        // block 1: declare and initialize variables
        int bugs, butterflies, x;
        butterflies = 5;
        x = 9;

        // block 2: calculate and process data
        // block 3: find results
        bugs = butterflies  + x;

        // block 4: display
        System.out.println("There are only " + butterflies + " butterflies,"); // 5 butterflies
        System.out.println("but there are " + bugs + " bugs in all."); // 14 bugs
        System.out.println("Uh oh, my dog ate one.");
        butterflies--; // postfix
//        bugs = butterflies  + x; //<- would need this line here again to update bugs
        System.out.println("Now there are only " + butterflies + " butterflies left."); // 4 butterflies
        System.out.println("But still " + bugs + " bugs left, wait a minute!"); // will still return 14
        System.out.println("Maybe my computer can't do math, after all!");

    }
}



