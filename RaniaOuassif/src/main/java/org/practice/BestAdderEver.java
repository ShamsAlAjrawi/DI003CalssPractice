/**
 * a program that does some basic math.
 * Stores three different numbers in different variables.
 * Add those variables together and store that in a new variable.
 * Display the result as a single math statement, like 1 + 2 + 3 = 6.
 *
 * @author Rania Ouassif
 */

package org.practice;
import java.util.Scanner;

public class BestAdderEver {
    public static void main(String[] args) {
        //Block 1: Declare & Initialize variables

        int op1 = 1, op2 = 2, op3 = 3;  //Hardcoded variables
        int userOp1, userOp2, userOp3, userSum = 0;
        Scanner scan = new Scanner(System.in);

        // Improvement using scanner
        System.out.println("Please input the first operand");
        userOp1 = scan.nextInt();
        System.out.println("Please input the second operand");
        userOp2 = scan.nextInt();
        System.out.println("Please input the third operand");
        userOp3 = scan.nextInt();

        int sum;

        //Block 2: Calculate and process the data
        sum = op1 + op2 + op3; //Add those variables together and store that in a new variable.

        userSum = userOp1 + userOp2 + userOp3;
        //Block 3: Results

        //Block 4: Display output
        System.out.println("The hardcoded single math statement is: ");
        System.out.println(op1 + " + " + op2 + " + " + op3 + " = " + sum); //Display the result as a single math statement

        System.out.println("The user input single math statement is: ");
        System.out.println(userOp1 + " + " + userOp2 + " + " + userOp3 + " = " + userSum); //Display the result as a single math statement
    }
}
