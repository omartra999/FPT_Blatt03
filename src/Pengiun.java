public class Pengiun extends NonFlyingBirds {
    public Pengiun(String name, int age, float weight, float maxAirSpeed){
        super(name, age, weight, maxAirSpeed);
    }

    @Override
    public void jumpIntoWater() {
        System.out.println("Penguin Jump");
    }

    @Override
    public void leaveWater() {
        System.out.println("Penguin leaving water");
    }

    @Override
    public void swim() {
        System.out.println("penguin swim");
    }

    @Override
    public void eatFood() {
        System.out.println("penguin eatfood");
    }
}
