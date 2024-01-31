public class Rectangle extends Shape{

    Rectangle(double l1, double l2, String color){
        super(l1, l2, color);

    }

    @Override
    public double calculateArea(){
        return (getL1() * getL2());
    }
}
