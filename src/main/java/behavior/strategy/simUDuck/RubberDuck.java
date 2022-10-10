package behavior.strategy.simUDuck;

public class RubberDuck extends Duck {

    @Override
    void display() {
        System.out.println("look like Rubber duck");
    }

    @Override
    void quack() {
        System.out.println("Squeak");
    }
}
