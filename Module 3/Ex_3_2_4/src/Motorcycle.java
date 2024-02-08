public class Motorcycle extends AbstractVehicle{

    public Motorcycle(String color, String fuel) {
        super(color, fuel);
        this.fuelEfficeincy = "3l/100km";
    }

    @Override
    void accelerate() {
        speed += 15;

    }
}
