package strategy;

import strategy.factory.Model;

public class A extends Model implements Strategy {
    @Override
    public void mode() {
        System.out.println("take bike");
    }
}
