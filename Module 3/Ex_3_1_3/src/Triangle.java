public class Triangle extends Shape{

    Triangle(double l1, double l2, String color){
        super(l1, l2, color);
    }

    @Override
    public double calculateArea(){
        return ((getL1() * getL2())/2);
    }
}
