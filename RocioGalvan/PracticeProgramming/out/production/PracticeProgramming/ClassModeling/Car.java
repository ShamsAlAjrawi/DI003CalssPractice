package ClassModeling;
//Model a car as if the class were to be part of an inventory system for a car dealership
public class Car {
    private String color;
    private String model;
    private String make;
    private int year;
    private String bodyStyle;
    private int price;
    private boolean discountApplied;
    private String firstDateOnLot;
    private String soldDate;

    public Car() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isDiscountApplied() {
        return discountApplied;
    }

    public void setDiscountApplied(boolean discountApplied) {
        this.discountApplied = discountApplied;
    }

    public String getFirstDateOnLot() {
        return firstDateOnLot;
    }

    public void setFirstDateOnLot(String firstDateOnLot) {
        this.firstDateOnLot = firstDateOnLot;
    }

    public String getSoldDate() {
        return soldDate;
    }

    public void setSoldDate(String soldDate) {
        this.soldDate = soldDate;
    }
}
