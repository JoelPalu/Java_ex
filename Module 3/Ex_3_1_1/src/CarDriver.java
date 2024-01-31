import java.util.Random;

public class CarDriver {
    public static void main(String[] args) {
        Car myCar;
        SuperCar sCar;
        Random rand = new Random();
        myCar = new Car("Toyota Corolla", 100, 100);
        sCar = new SuperCar("Ferrari", 200, 200);
        myCar.fillTank();
        sCar.fillTank();


        for(int i = 0; i < 6; i++) {
            myCar.accelerate();
            sCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
            System.out.println(sCar.getTypeName() + ": speed is " + sCar.getSpeed() + " km/h");
        }

        while(myCar.getSpeed() > 0) {
            sCar.decelerate(20);
            myCar.decelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
            System.out.println(sCar.getTypeName() + ": speed is " + sCar.getSpeed() + " km/h");
        }
    }
}