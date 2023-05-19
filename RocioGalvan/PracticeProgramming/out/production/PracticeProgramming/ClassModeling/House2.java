package ClassModeling;
//Model a house as if the class were to be part of a 3-D design system
public class House2 {
    private int squareFootage;
    private String StyleOfHouse;
    private int numOfBedrooms;
    private int numOfBathrooms;
    private boolean hasAGarage;
    private boolean hasABasement;
    private int numOfLevels;
    private int numOfSpareRooms;

// default constructor
    public House2() {
    }

//   methods
    public static int totalNumOfRooms(int numOfBedrooms, int numOfBathrooms, int numOfSpareRooms ){
        return numOfBedrooms + numOfBathrooms +numOfSpareRooms;
    }

// getter & setters
    public int getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
    }

    public String getStyleOfHouse() {
        return StyleOfHouse;
    }

    public void setStyleOfHouse(String styleOfHouse) {
        StyleOfHouse = styleOfHouse;
    }

    public int getNumOfBedrooms() {
        return numOfBedrooms;
    }

    public void setNumOfBedrooms(int numOfBedrooms) {
        this.numOfBedrooms = numOfBedrooms;
    }

    public int getNumOfBathrooms() {
        return numOfBathrooms;
    }

    public void setNumOfBathrooms(int numOfBathrooms) {
        this.numOfBathrooms = numOfBathrooms;
    }

    public boolean isHasAGarage() {
        return hasAGarage;
    }

    public void setHasAGarage(boolean hasAGarage) {
        this.hasAGarage = hasAGarage;
    }

    public boolean isHasABasement() {
        return hasABasement;
    }

    public void setHasABasement(boolean hasABasement) {
        this.hasABasement = hasABasement;
    }

    public int getNumOfLevels() {
        return numOfLevels;
    }

    public void setNumOfLevels(int numOfLevels) {
        this.numOfLevels = numOfLevels;
    }


    public int getNumOfSpareRooms() {
        return numOfSpareRooms;
    }

    public void setNumOfSpareRooms(int numOfSpareRooms) {
        this.numOfSpareRooms = numOfSpareRooms;
    }
}
