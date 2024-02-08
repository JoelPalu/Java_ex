public class Motorcycle implements Vehicle{

    @Override
    public void start() {
        System.out.println("Motorcycle is staring...");

    }

    @Override
    public void stop() {
        System.out.println("Motorcycle is stopping...");

    }

    @Override
    public String getInfo() {
        return ("Type: Motorcycle \n" + "Fuel: Gasoline\n"+ "Color: Blue");
    }
}
