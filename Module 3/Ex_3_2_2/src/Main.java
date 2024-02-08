public class Main {
    public static void main(String[] args) {
        Car car = new Car("red", "diesel");
        Motorcycle motorcycle = new Motorcycle("black", "gasoline");
        Bus bus = new Bus("yellow", "diesel", 200);

        System.out.println("Vehicle Demonstration\n");

        car.start();
        car.accelerate();
        System.out.println("Speed: " + car.getSpeed());
        car.stop();

        System.out.println(car.getInfo());
        System.out.println();

        motorcycle.start();
        motorcycle.accelerate();
        System.out.println("Speed: " + motorcycle.getSpeed());
        motorcycle.stop();
        System.out.println(motorcycle.getInfo());
        System.out.println();

        bus.start();
        bus.accelerate();
        System.out.println("Speed: " + bus.getSpeed());
        bus.stop();
        System.out.println(bus.getInfo());

    }
}