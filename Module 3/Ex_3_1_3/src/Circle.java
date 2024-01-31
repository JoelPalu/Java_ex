public class Circle extends Shape{
    private double radius;

    Circle(double radius){
        super(0,0);
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return (Math.PI * Math.pow(this.radius,2));
    }
}
