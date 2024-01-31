
public class Main {
    public static void main(String[] args) {

        //Shape list.
        Shape[] shapes = new Shape[]{
                new Shape(1,2),
                new Circle(5.0),
                new Rectangle(4.0, 6.0),
                new Triangle(3.0, 8.0)
        };

        System.out.println("Shape Calculator");


        for (Shape shape : shapes) {
            System.out.println("Area of " + shape.getClass().getSimpleName() + ": " + shape.calculateArea());
        }

    }
}