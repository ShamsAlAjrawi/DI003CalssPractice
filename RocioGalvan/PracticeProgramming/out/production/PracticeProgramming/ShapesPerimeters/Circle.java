package ShapesPerimeters;

public class Circle extends Shape{
    private final int diameter = 10;
    private final double pi = 3.141592;

    @Override
    public int getArea() {
        int area = (int) pi *(diameter/2)^2 ;
        return area;
    }

    @Override
    public int getPerimeter() {
        int perimeter;
        perimeter = (int) pi * diameter;
        return perimeter;
    }
}
