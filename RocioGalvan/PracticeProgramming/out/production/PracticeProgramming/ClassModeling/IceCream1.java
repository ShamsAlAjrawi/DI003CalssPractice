package ClassModeling;

//Model ice cream as if the class were to be part of the stocking system at a grocery store
public class IceCream1 {
    private String flavor;
    private int numOfBoxes;
    private int numOfUnitsPerBox;
    private int numOfUnitsOnFloor;
    private int numOfUnitsInWarehouse;
    private String dateOfNextOrder;
    private float price;
    private boolean isOnSale;

    public IceCream1() {
    }

    public int totalNumOfUnitsInStore (int numOfUnitsOnFloor, int numOfUnitsInWarehouse){
        return numOfUnitsOnFloor + numOfUnitsInWarehouse;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getNumOfBoxes() {
        return numOfBoxes;
    }

    public void setNumOfBoxes(int numOfBoxes) {
        this.numOfBoxes = numOfBoxes;
    }

    public int getNumOfUnitsPerBox() {
        return numOfUnitsPerBox;
    }

    public void setNumOfUnitsPerBox(int numOfUnitsPerBox) {
        this.numOfUnitsPerBox = numOfUnitsPerBox;
    }

    public int getNumOfUnitsOnFloor() {
        return numOfUnitsOnFloor;
    }

    public void setNumOfUnitsOnFloor(int numOfUnitsOnFloor) {
        this.numOfUnitsOnFloor = numOfUnitsOnFloor;
    }

    public int getNumOfUnitsInWarehouse() {
        return numOfUnitsInWarehouse;
    }

    public void setNumOfUnitsInWarehouse(int numOfUnitsInWarehouse) {
        this.numOfUnitsInWarehouse = numOfUnitsInWarehouse;
    }

    public String getDateOfNextOrder() {
        return dateOfNextOrder;
    }

    public void setDateOfNextOrder(String dateOfNextOrder) {
        this.dateOfNextOrder = dateOfNextOrder;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isOnSale() {
        return isOnSale;
    }

    public void setOnSale(boolean onSale) {
        isOnSale = onSale;
    }
}
