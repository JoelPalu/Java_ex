public class Motorcycle extends AbstractVehicle{

    public Motorcycle(String color, String fuel) {
        super(color, fuel);
    }

    @Override
    void accelerate() {
        speed += 15;

    }
}
