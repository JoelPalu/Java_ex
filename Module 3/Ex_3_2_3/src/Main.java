public class Main {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar("blue", "electric");
        Car car = new Car("red", "diesel");

        System.out.println("Vehicle Demonstration\n");

        electricCar.start();
        electricCar.accelerate();
        System.out.println("Speed: " + electricCar.getSpeed());
        electricCar.stop();
        System.out.println(electricCar.getInfo());

        car.charge();

    }
}