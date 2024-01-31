public class Circle extends Shape{
    private double radius;

    Circle(double radius, String color){
        super(0,0, color);
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return (Math.PI * Math.pow(this.radius,2));
    }
}
