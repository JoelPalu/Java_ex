public class Rectangle extends Shape{

    Rectangle(double l1, double l2){
        super(l1,l2);

    }

    @Override
    public double calculateArea(){
        return (getL1() * getL2());
    }
}
