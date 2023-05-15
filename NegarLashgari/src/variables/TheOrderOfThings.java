package variables;

public class TheOrderOfThings {
    public static void main(String[] args) {
        double number;
        String opinion, size, age, shape, color, origin, material, purpose;
        String noun;

        number = 5.0;
        opinion = "AWESOME";
        size = "teensy-weensy";
        age = "new";
        shape = "oblong";
        color = "yellow";
        origin = "Martian";
        material = "platinum";
        purpose = "good";
        String space = " ";

        noun = "dragons";

        // Using the + with strings doesn't add -- it concatenates! (sticks them together)
        System.out.println(number + " " + opinion + " " + size + " " + age + " " + shape
                + " " + color + " " + origin + " " + material + " " + purpose + " " + noun);
                //Can you think of another way to achieve this effect?

        System.out.println(number + space + opinion + space + size + space + age + space + shape
                + space + color + space + origin + space + material + space + purpose + space + noun);
    }
}
