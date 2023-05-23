package ShapesPerimeters;

public class Triangle extends Shape{
    private final int leftSide = 6;
    private final int bottomSide = 10;
    private final int rightSide = 6;
    private final int height = 3;

    @Override
    public int getArea() {
        int area = (bottomSide * height) / 2;
        return area;
    }

    @Override
    public int getPerimeter() {
        int perimeter = leftSide + bottomSide + rightSide;
        return perimeter;
    }
}
