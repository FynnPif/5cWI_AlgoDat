package DesignPatterns.StrategyPattern.DogExample;


public abstract class AbstractDog implements DogInterface {
    private String name;
    private BarkStrategy barkStrategy;

    public AbstractDog(String name, BarkStrategy barkStrategy) {
        this.name = name;
        this.barkStrategy = barkStrategy;

    }

    public String getName() {
        return name;
    }

    public BarkStrategy doBark(){
        return barkStrategy;
    }



}
