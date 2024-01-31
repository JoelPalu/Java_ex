
public class Main {
    public static void main(String[] args) {

        //Shape list.
        Shape[] shapes = new Shape[]{
                new Shape(1,2, "red"),
                new Circle(5.0, "blue"),
                new Rectangle(4.0, 6.0,"pink"),
                new Triangle(3.0, 8.0,"yellow")
        };

        System.out.println("Shape Calculator");


        for (Shape shape : shapes) {
            System.out.println("Area of " + shape.getColor() + " "+ shape.getClass().getSimpleName() + ": " + shape.calculateArea());
        }

    }
}