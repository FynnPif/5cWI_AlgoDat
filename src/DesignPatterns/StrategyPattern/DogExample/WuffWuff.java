package DesignPatterns.StrategyPattern.DogExample;

public class WuffWuff implements BarkStrategy{
    @Override
    public void bark() {
        System.out.println("WuffWuff");
    }
}
