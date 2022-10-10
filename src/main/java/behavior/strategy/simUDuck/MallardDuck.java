package behavior.strategy.simUDuck;

public class MallardDuck extends Duck{

    public MallardDuck() {

        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("look like mallard duck");
    }
}
