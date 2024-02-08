public class Bus implements Vehicle{

    @Override
    public void start() {
        System.out.println("Bus is staring...");

    }

    @Override
    public void stop() {
        System.out.println("Bus is stopping...");

    }

    @Override
    public String getInfo() {
        return ("Type: Bus \n" + "Capacity: 200 \n" + "Fuel: Gasoline\n"+ "Color: Yellow");
    }
}
