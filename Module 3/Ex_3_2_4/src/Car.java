public class Car extends AbstractVehicle{

    public Car(String color, String fuel) {
        super(color, fuel);
        this.fuelEfficeincy = "5l/100km";
    }

    @Override
    void accelerate() {
        speed += 10;

    }


}
