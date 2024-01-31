
public class Car {

    private float speed;
    private float gasolineLevel;
    private String typeName;
    private float max_speed = 0;
    private float max_gasoline= 0;
    private boolean cruiseControl;
    private float cruiseTarget;



    Car(String typeName, float max_speed_val, float max_gasoline_val){
        max_speed = max_speed_val;
        max_gasoline = max_gasoline_val;
        this.typeName = typeName;
        cruiseControl = false;
    }


    public void accelerate() {
        if (gasolineLevel > 0)
            speed += 10;
        else
            speed = 0;
    }
    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }
    float getSpeed() {
        return speed;
    }
    String getTypeName() {
        return typeName;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    void fillTank() {
        gasolineLevel = 100;
    }
    float getGasolineLevel() {
        return gasolineLevel;
    }

    public float getCruiseTarget() {
        return cruiseTarget;
    }

    public boolean isCruiseControl() {
        return cruiseControl;
    }

    public void turnCruise(int target, float speed){
        if (target/2 < speed){
            this.cruiseControl = true;
            this.cruiseTarget = target;
            System.out.println("Cruise control is on!");
        }
        else{
            System.out.println("Cruise control can't be activated");
        }
    }

    public void cruiseSpeedControl(){
        if (getCruiseTarget()/2 > getSpeed()){
            System.out.println("Speed is too slow. Turning off cruise control.");
            cruiseControl = false;
        }
        else if (getCruiseTarget() > getSpeed()) {
            accelerate();
        } else if (getCruiseTarget()< getSpeed()) {
            decelerate(5);
        }

    }


}