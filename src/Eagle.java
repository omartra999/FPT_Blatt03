//child class of Flying Birds must have a matching constructor
public class Eagle extends FlyingBirds {
    public Eagle(String name, int age, float weight, float maxAirSpeed){
        super(name, age, weight, maxAirSpeed);
    }

    //implementation of the abstract methods


    @Override
    public void fly() {
        System.out.println("Eagle Flight");;
    }

    @Override
    public void eatFood() {
        System.out.println("Eagle food");
    }

    @Override
    public void land() {
        System.out.println("Eagle Land");
    }

    @Override
    public void liftOff() {
        System.out.println("Eagle Lift Off");
    }
}
