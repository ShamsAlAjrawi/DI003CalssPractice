import java.util.Scanner;
public class BirthStones {
    public static void main (String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What month's birthstone do you want to know? ");
        int month = myScanner.nextInt();
        String smonth="January", birthStone="Emerald";


        switch(month) {
        case 1:
            smonth = "January";
            birthStone = "Emerald";
            System.out.println(smonth + "'s birthstone is " + birthStone + ".");
            break;
        case 2:
            smonth = "February";
            birthStone = "Gold";
            System.out.println(smonth + "'s birthstone is " + birthStone + ".");
            break;
        case 3:
            smonth = "March";
            birthStone = "Diamond";
            System.out.println(smonth + "'s birthstone is " + birthStone + ".");
            break;
        case 4:
            smonth = "April";
            birthStone = "Amethyst";
            System.out.println(smonth + "'s birthstone is " + birthStone + ".");
            break;
        case 5:
            smonth = "May";
            birthStone = "Quartz";
            System.out.println(smonth + "'s birthstone is " + birthStone + ".");
            break;
        case 6:
            smonth = "June";
            birthStone = "Sapphire";
            System.out.println(smonth + "'s birthstone is " + birthStone + ".");
            break;
        case 7:
            smonth = "July";
            birthStone = "Aquamarine";
            System.out.println(smonth + "'s birthstone is " + birthStone + ".");
            break;
        case 8:
            smonth = "August";
            birthStone = "Opal";
            System.out.println(smonth + "'s birthstone is " + birthStone + ".");
            break;
        case 9:
            smonth = "September";
            birthStone = "Marble";
            System.out.println(smonth + "'s birthstone is " + birthStone + ".");
            break;
        case 10:
            smonth = "October";
            birthStone = "Amethyst";
            System.out.println(smonth + "'s birthstone is " + birthStone + ".");
            break;
        case 11:
            smonth = "November";
            birthStone = "Onyx";
            System.out.println(smonth + "'s birthstone is " + birthStone + ".");
            break;
        case 12:
            smonth = "December";
            birthStone = "Turquoise";
            System.out.println(smonth + "'s birthstone is " + birthStone + ".");
            break;
        default:
            System.out.println("I think you must be confused, " + month + " doesn't match a month.");
        }


    }
}
