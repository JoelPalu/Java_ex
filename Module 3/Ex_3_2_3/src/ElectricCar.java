public class ElectricCar extends AbstractVehicle {
    protected ElectricCar(String color, String fuel) {
        super(color, fuel);
    }

    @Override
    void accelerate() {
        speed += 20;
    }
    @Override
    public void charge() {
        System.out.println(type + " is charging...");
    }
}
