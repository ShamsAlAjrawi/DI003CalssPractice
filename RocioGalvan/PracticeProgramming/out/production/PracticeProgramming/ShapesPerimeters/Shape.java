package ShapesPerimeters;

public abstract class Shape {
    private String color;

//getter & Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract int getArea();

    public abstract int getPerimeter();
}
