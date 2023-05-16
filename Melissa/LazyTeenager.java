package com.mycompany.lazyteenager;

/**
 *
 * @author melissaaugustin
 */
import java.util.Scanner;

public class LazyTeenager {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        boolean roomClean = false;
        
        do {
            System.out.println("Clean your room!! (x" + i + ")");
            String response = input.nextLine();
            
            if (response.equals("I'll clean my room.")) {
                roomClean = true;
            } else if (i == 7) {
                System.out.println("Clean your room!! That's IT, I'm doing it!!! "
                                   + "YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
                break;
            }
            
            i ++;
        } while (!roomClean);
        
        System.out.println("Fine, I'll clean my room. But I refuse to eat my peas.");
    }
}
