public class Car extends AbstractVehicle{

    public Car(String color, String fuel) {
        super(color, fuel);
    }

    @Override
    void accelerate() {
        speed += 10;

    }
}
