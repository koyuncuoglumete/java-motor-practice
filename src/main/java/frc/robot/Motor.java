public class Motor{
    private String name;
    protected double currentSpeed;
    
    //Constructor
    public Motor(String name){
        this.name = name;
    }
    
    public void setSpeed(double speed){
        this.currentSpeed = speed;
    }
    
    public void stop(){
        this.currentSpeed = 0;
    }
    
    public double getSpeed(){
        return this.currentSpeed;
    }
    
    public String getName(){
        return this.name;
    }
}