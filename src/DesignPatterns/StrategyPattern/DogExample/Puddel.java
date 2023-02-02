package DesignPatterns.StrategyPattern.DogExample;

public class Puddel extends AbstractDog{
    public Puddel(String name, BarkStrategy barkStrategy) {
        super(name, barkStrategy);
    }

    @Override
    public void run() {
        System.out.println("I am a Puddel and my name is " + getName() + "!");
        doBark().bark();
    }
}
