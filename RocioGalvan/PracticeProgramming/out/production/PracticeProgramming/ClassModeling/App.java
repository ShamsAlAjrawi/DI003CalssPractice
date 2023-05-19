package ClassModeling;

public class App {
    public static void main(String[] args) {
        House myHouse1 = new House();
        House myHouse2 = new House(false);
        House myHouse3 = new House(258, "Deep creek", "New York", "NY", "12345");

        myHouse1.fullAddress(25, "Sunshine Lane", "Raleigh", "NC", "27521");
        System.out.println(myHouse2);
        System.out.println(myHouse3);
    }
}
