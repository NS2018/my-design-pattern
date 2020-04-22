package strategy;

import strategy.factory.Model;

public class B extends Model implements Strategy {
    @Override
    public void mode() {
        System.out.println("take bus");
    }
}
