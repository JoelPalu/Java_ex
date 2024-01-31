public class SuperCar extends Car{

    SuperCar(String typeName, float max_speed_val, float max_gasoline_val) {
        super(typeName, max_speed_val, max_gasoline_val);
    }

    @Override
    public void accelerate() {
        if (getGasolineLevel() > 0)
            setSpeed(getSpeed()+ 20);
        else
             setSpeed(0);
    }
    @Override
    void decelerate(int amount) {
        if (getGasolineLevel() > 0) {
            if (amount > 0)
                setSpeed(Math.max(0, getSpeed() - amount));
        } else
            setSpeed(0);
    }
}
