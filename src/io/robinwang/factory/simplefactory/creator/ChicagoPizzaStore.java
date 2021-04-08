package io.robinwang.factory.simplefactory.creator;

import io.robinwang.factory.simplefactory.product.ChicagoStyleCheesePizza;
import io.robinwang.factory.simplefactory.product.NYStylePepperPizza;
import io.robinwang.factory.simplefactory.PIZZA_TYPE;
import io.robinwang.factory.simplefactory.product.Pizza;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(PIZZA_TYPE type) {
        Pizza pizza;
        switch (type){
            case CHEESE:
                pizza=new ChicagoStyleCheesePizza();
                break;
            case PEPPER:
                pizza = new NYStylePepperPizza();
                break;
            default:
                pizza=null;
        }
        return pizza;
    }
}
