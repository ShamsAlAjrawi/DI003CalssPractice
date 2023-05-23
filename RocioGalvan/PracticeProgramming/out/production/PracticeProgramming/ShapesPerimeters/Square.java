package ShapesPerimeters;

public class Square extends Shape{
    private final int topSide = 5;
    private final int leftSide = 5;
    private final int bottomSide = 5;
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
