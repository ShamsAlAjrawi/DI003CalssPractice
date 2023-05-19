package ClassModeling;
//Model a book as if the class were to be part of a publishing system that the author uses to write the book
public class Book {
    private String name;
    private String author;
    private boolean isFiction;
    private String category;
    private String title;
    private String targetAudience;
    private int numOfPages;
    private int numOfChapters;
    private boolean hasImages;
    private String targetFinishDate;

    public Book (){

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public int getNumOfChapters() {
        return numOfChapters;
    }

    public void setNumOfChapters(int numOfChapters) {
        this.numOfChapters = numOfChapters;
    }

    public boolean isHasImages() {
        return hasImages;
    }

    public void setHasImages(boolean hasImages) {
        this.hasImages = hasImages;
    }

    public String getTargetFinishDate() {
        return targetFinishDate;
    }

    public void setTargetFinishDate(String targetFinishDate) {
        this.targetFinishDate = targetFinishDate;
    }
}
