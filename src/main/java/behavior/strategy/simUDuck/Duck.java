package behavior.strategy.simUDuck;

public abstract class Duck {

    void quack(){
        System.out.println("Quack");
    }

    void swim(){
        System.out.println("Swim");
    }

    abstract void display();
}
