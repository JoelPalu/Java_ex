import java.util.Random;

public class CarDriver {

    public static void main(String[] args) {
        Car myCar;
        Random rand = new Random();
        myCar = new Car("Toyota Corolla", 100, 100);
        myCar.fillTank();


        for(int i = 0; i < 6; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        do {
            if (!myCar.isCruiseControl()){
                myCar.turnCruise(60, myCar.getSpeed());
            }
            else{
                myCar.decelerate(rand.nextInt(50) - rand.nextInt(50));
                myCar.cruiseSpeedControl();
                System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
            }

        }while (myCar.isCruiseControl());

        while(myCar.getSpeed() > 0) {
            myCar.decelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }
    }
}