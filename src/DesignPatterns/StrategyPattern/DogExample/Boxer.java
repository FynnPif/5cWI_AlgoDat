package DesignPatterns.StrategyPattern.DogExample;

public class Boxer extends AbstractDog{

    public Boxer(String name, BarkStrategy barkStrategy) {
        super(name, barkStrategy);
    }

    @Override
    public void run() {
        System.out.println("I am a Boxer and my name is " + getName() + "!");
        doBark().bark();
    }
}
