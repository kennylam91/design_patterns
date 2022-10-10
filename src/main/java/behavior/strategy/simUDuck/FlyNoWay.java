package behavior.strategy.simUDuck;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("FlyNoWay");
    }
}
