package strategy;

import com.sun.org.apache.xpath.internal.operations.Mod;
import strategy.factory.Model;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void howToWork(){
        strategy.mode();
    }

}
