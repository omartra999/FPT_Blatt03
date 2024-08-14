public abstract class NonFlyingBirds extends Bird{
    private float maxWaterSpeed;

    public NonFlyingBirds(String name, int age, float weight, float maxWaterSpeed){
        super(name, age, weight);
        this.maxWaterSpeed = maxWaterSpeed;
    }

    public abstract void jumpIntoWater();
    public abstract void leaveWater();
    public abstract void swim();

}
