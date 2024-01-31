import java.util.Random;

public class CarDriver {
    public static void main(String[] args) {
        Bus bus = new Bus("Volvo", 80, 200, 10);

        System.out.println("Passengers: " + bus.getPassengers());

        for(int i = 0; i < 20 ; i++){
            bus.passengerEnter();
        }

        System.out.println("Passengers: " + bus.getPassengers());

        for(int i = 0; i < 5 ; i++){
            bus.passengerExit();
        }

        System.out.println("Passengers: " + bus.getPassengers());

    }
}