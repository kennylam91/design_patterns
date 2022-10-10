package behavior.strategy.simUDuck;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performQuack();
        modelDuck.performFly();
    }
}
