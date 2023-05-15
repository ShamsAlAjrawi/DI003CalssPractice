package flowcontrol.whiles;
import java.util.Scanner;
public class StayPositiveIntro {
    public static void main(String[] args) {
        int num;
        Scanner userInput = new Scanner(System.in);
        System.out.println("What number should I count down from?");
        num = Integer.parseInt(userInput.nextLine());
        System.out.println("Counting down...");
        while (num >=0) {
            System.out.println(num);
            num--;
        }
        System.out.println("\nBlast off!!");

    }
}
