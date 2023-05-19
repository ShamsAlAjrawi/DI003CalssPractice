package ClassModeling;
//Model a book as if the class were to be part of a library cataloging system
public class Book1 {
    private String name;
    private String author;
    private boolean isFiction;
    private String category;
    private String locationOfBook;
    private String title;
    private boolean isCheckedOut;
    private int numOfCopiesInInventory;
    private int numOfCopiesCheckedOut;
    private String [] returnDatesOfCheckedOutBooks;

    public Book1() {
    }

    public int numOfCopiesAvailableToBeCheckedOut (int numOfCopiesInInventory, int numOfCopiesCheckedOut) {
        return numOfCopiesInInventory - numOfCopiesCheckedOut;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isFiction() {
        return isFiction;
    }

    public void setFiction(boolean fiction) {
        isFiction = fiction;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocationOfBook() {
        return locationOfBook;
    }

    public void setLocationOfBook(String locationOfBook) {
        this.locationOfBook = locationOfBook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public int getNumOfCopiesInInventory() {
        return numOfCopiesInInventory;
    }

    public void setNumOfCopiesAvailable(int numOfCopiesInInventory) {
        this.numOfCopiesInInventory = numOfCopiesInInventory;
    }

    public int getNumOfCopiesCheckedOut() {
        return numOfCopiesCheckedOut;
    }

    public void setNumOfCopiesCheckedOut(int numOfCopiesCheckedOut) {
        this.numOfCopiesCheckedOut = numOfCopiesCheckedOut;
    }

    public String[] getReturnDatesOfCheckedOutBooks() {
        return returnDatesOfCheckedOutBooks;
    }

    public void setReturnDatesOfCheckedOutBooks(String[] returnDatesOfCheckedOutBooks) {
        this.returnDatesOfCheckedOutBooks = returnDatesOfCheckedOutBooks;
    }
}
