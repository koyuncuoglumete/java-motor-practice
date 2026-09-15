public class SmartMotor extends Motor{
    private double maxSpeed;
    
    public SmartMotor(String name, double maxSpeed){
        super(name);
        this.maxSpeed = maxSpeed;
    }
    
    public void setSpeedLimited(double speed) {
        if (speed >= maxSpeed){
            currentSpeed = maxSpeed;
        }
        else {
            setSpeed(speed);
        }

    }
}