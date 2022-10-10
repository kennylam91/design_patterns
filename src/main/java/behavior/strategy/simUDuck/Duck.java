package behavior.strategy.simUDuck;

public abstract class Duck {

//    With the inheritance, we have to possibly override fly() and quack() for every new Duck subclass

//    How about take the fly() out of the Duck super class, and make a Flyable interface with a fly() method
//    That way, only Ducks that are supposed to fly will implement that interface and have a fly() method
//    That is the dumbest idea, because we have to override the fly() method for all existing Duck subclass
//    And also the code is basically duplicated


//    Design principle
//    Identify the aspects of your application that vary and separate them from what stays the same

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    abstract void display();

    void performQuack() {
        quackBehavior.quack();
    }

    void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
