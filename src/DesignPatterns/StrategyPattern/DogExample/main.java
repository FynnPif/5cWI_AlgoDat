package DesignPatterns.StrategyPattern.DogExample;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<AbstractDog> dogs = new ArrayList<>();
        BarkStrategy bs1 = new Wuff();
        BarkStrategy bs2 = new WuffWuff();

        dogs.add(new Boxer("Heribert", bs1));
        dogs.add(new Puddel("Burger", bs1));
        dogs.add(new Boxer("Snoopy", bs2));

        for (AbstractDog d:dogs) {
            d.run();
        }

    }

}
