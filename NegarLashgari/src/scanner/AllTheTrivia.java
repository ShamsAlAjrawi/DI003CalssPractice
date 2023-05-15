package scanner;

public class AllTheTrivia {
    public static void main(String[] args) {

        final int MAX_AGE = 3;
        int day = 8;
        String dayType = "";

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "Weekday";
                break;
            case 6:
            case 7:
                dayType = "Weekend";
                break;
            default:
                dayType = "Invalid Day";
        }

        System.out.println(dayType);
    }
}
