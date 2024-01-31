public class Bus extends Car{
    private int passengers = 0;
    private final int maxPassengers;
    Bus(String typeName, float max_speed_val, float max_gasoline_val, int passengers ) {
        super(typeName, max_speed_val, max_gasoline_val);
        this.maxPassengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public void passengerEnter(){
        if(getPassengers() < maxPassengers){
            passengers++;
        }
        else{
            System.out.println("Bus is full");
        }
    }
    public void passengerExit(){
        if(getPassengers() > 0){
            passengers--;
        }
        else{
            System.out.println("Bus is empty");
        }
    }
}
