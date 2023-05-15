package com.sg.foundations.flowcontrol.whiles;
import java.util.Random;


public class LazyTeenager {
    public static void main(String[] args) {
        int cleanRoomChance = 10;
        int maxCleanRoomChance = 70;
        int cleanRoomAttempts = 1;

        Random random = new Random();

        do {
            System.out.println("Clean your room!! (x" + cleanRoomAttempts + ")");
            cleanRoomAttempts++;
            cleanRoomChance += 10;

            if (random.nextInt(100) <= cleanRoomChance) {
                System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
                break;
            }

            if (cleanRoomAttempts == 8) {
                System.out.println("Clean your room!! That's IT, I'm doing it!!! " +
                        "YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
                break;
            }
        } while (cleanRoomChance <= maxCleanRoomChance);
    }
}
