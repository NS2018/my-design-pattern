package strategy;

import strategy.factory.ModelFactory;

public class Test {

    public static void main(String[] args) {
        Strategy bike = new ModelFactory().getModel("bus");
        new Context(bike).howToWork();
    }
}
