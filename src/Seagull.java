public class Seagull extends FlyingBirds {
    public Seagull(String name, int age, float weight, float maxAirSpeed){
        super(name, age, weight, maxAirSpeed);
    }

    //every child class of a parent class must implement all of its abstract methods
    @Override
    public void fly() {
        System.out.println("Seagull fly");
    }

    @Override
    public void liftOff() {
        System.out.println("Seagull lift off");
    }

    @Override
    public void land() {
        System.out.println("Seagull land");
    }

    @Override
    public void eatFood() {
        System.out.println("Seagull food");
    }
}
