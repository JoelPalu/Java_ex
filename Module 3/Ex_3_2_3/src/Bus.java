public class Bus extends AbstractVehicle{
    private int capacity;


    public Bus(String color, String fuel, int capacity) {
        super(color, fuel);
        this.capacity = capacity;
    }

    @Override
    void accelerate() {
        speed += 5;
    }

    public int getCapacity() {
        return capacity;
    }
    @Override
    public String getInfo() {
        return ("Type: " + this.type +"\nFuel: " + this.fuel + "\nColor: " + this.color + "\nCapacity: " + this.capacity);
    }
}
