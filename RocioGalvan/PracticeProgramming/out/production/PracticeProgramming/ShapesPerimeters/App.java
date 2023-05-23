package ShapesPerimeters;

public class App {
    public static void main(String[] args) {
//        Square
        Shape shape1 = new Square();
        System.out.println(shape1.getArea());
        System.out.println(shape1.getPerimeter());
        shape1.setColor("blue");
        System.out.println(shape1.getColor());

        //        Rectangle
        Shape shape2 = new Rectangle();
        System.out.println(shape2.getArea());
        System.out.println(shape2.getPerimeter());
        shape1.setColor("White");
        System.out.println(shape1.getColor());

        //        Triangle
        Shape shape3 = new Triangle();
        System.out.println(shape3.getArea());
        System.out.println(shape3.getPerimeter());
        shape1.setColor("Red");
        System.out.println(shape1.getColor());

        //        Circle
        Shape shape4 = new Circle();
        System.out.println(shape4.getArea());
        System.out.println(shape4.getPerimeter());
        shape1.setColor("Pink");
        System.out.println(shape1.getColor());
    }
}
