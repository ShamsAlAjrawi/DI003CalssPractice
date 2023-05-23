package ShapesPerimeters;

public class Rectangle extends Shape{
    private final int topSide = 10;
    private final int leftSide = 5;
    private final int bottomSide = 10;
    private final int rightSide = 5;
    @Override
    public int getArea() {
        int area = rightSide * topSide;
        return area;
    }

    @Override
    public int getPerimeter() {
        int perimeter = topSide + leftSide + bottomSide + rightSide;
        return perimeter;
    }
}
