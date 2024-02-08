abstract class AbstractVehicle implements Vehicle, ElectricVehicle  {
    protected String color;
    protected String fuel;
    protected String type = this.getClass().getTypeName();
    protected String fuelEfficeincy;
    protected int speed;
    protected AbstractVehicle(String color, String fuel) {
        this.color = color;
        this.fuel = fuel;
    }


    public void start() {
        System.out.println(this.type + " is starting...");
    }
    public void stop() {
        System.out.println(this.type + " is stopping...");
    }
    public String getInfo() {
        return ("Type: " + this.type +"\nFuel: " + this.fuel + "\nColor: " + this.color);
    }

    public int getSpeed() {
        return speed;
    }

    abstract void accelerate();

    @Override
    public void charge() {
        System.out.println("Can't charge");
    }

    @Override
    public void calculateFuelEfficiency() {
        System.out.println("Fuel efficiency: " + this.fuelEfficeincy);
    }

}