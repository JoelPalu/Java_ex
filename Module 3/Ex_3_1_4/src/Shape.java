public class Shape {

    private double l1;
    private double l2;
    private String color;

    Shape(double l1, double l2, String color){
        this.l1 = l1;
        this.l2 = l2;
        this.color = color;
    }

    public double getL1() {
        return l1;
    }

    public double getL2() {
        return l2;
    }

    public String getColor() {
        return color;
    }

    public double calculateArea(){
        return 0;
    }
}
