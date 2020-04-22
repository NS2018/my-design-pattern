package strategy.factory;

import strategy.A;
import strategy.B;
import strategy.Strategy;

public class ModelFactory {

    private String name;

    public Strategy getModel(String name){
        if("bike".equals(name)){
            return new A();
        }else if("bus".equals(name)){
            return new B();
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
