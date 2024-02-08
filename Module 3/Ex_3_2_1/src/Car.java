public class Car implements Vehicle{

    @Override
    public void start() {
        System.out.println("Car is staring...");

    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");

    }

    @Override
    public String getInfo() {
        return ("Type: Car \n" + "Fuel: Gasoline\n"+ "Color: Red");
    }
}
