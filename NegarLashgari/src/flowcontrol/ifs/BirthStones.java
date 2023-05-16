package flowcontrol.ifs;

import java.util.Scanner;

public class BirthStones {
    public static void main(String[] args) {
        int monthNumber;

        Scanner myScanner = new Scanner(System.in);
        System.out.println("What month's birthstone do you want to know?");
        monthNumber = Integer.parseInt(myScanner.nextLine());

        switch (monthNumber){
            case 1:
                System.out.println("January's birthstone is Garnet.");
                break;
            case 2:
                System.out.println("February's birthstone is Amethyst.");
                break;
            case 3:
                System.out.println("March's birthstone is Aquamarine.");
                break;
            case 4:
                System.out.println("April's birthstone is Diamond.");
                break;
            case 5:
                System.out.println("May's birthstone is Emerald.");
                break;
            case 6:
                System.out.println("June's birthstone is Pearl.");
                break;
            case 7:
                System.out.println("July's birthstone is Ruby.");
                break;
            case 8:
                System.out.println("August's birthstone is Peridot.");
                break;
            case 9:
                System.out.println("September's birthstone is Sapphire.");
                break;
            case 10:
                System.out.println("October's birthstone is Opal.");
                break;
            case 11:
                System.out.println("November's birthstone is Topaz.");
                break;
            case 12:
                System.out.println("December's birthstone is Turquoise.");
                break;
            default:
                System.out.println("I think you must be confused, " + monthNumber + " doesn't match a month.");
        }
        
    }
}
