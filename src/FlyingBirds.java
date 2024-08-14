//this is a child class from Bird
//it must have a matching constructor to the parent class

public abstract class FlyingBirds extends Bird {
    private float maxAirSpeed;

    //the matching constructor + the special behavior of this specific class
    public FlyingBirds(String name, int age, float weight, float maxAirSpeed){
        //super calls the constructor of the parent class
        super(name, age, weight);
        this.maxAirSpeed = maxAirSpeed;
    }

    public float getMaxAirSpeed() {
        return maxAirSpeed;
    }
    public void setMaxAirSpeed(float maxAirSpeed) {
        this.maxAirSpeed = maxAirSpeed;
    }

    //abstract methods to use in the child classes of this class
    public abstract void liftOff();
    public abstract void land();
    public abstract void fly();


}
