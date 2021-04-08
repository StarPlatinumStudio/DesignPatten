package io.robinwang.factory.simplefactory;

import io.robinwang.factory.simplefactory.creator.ChicagoPizzaStore;
import io.robinwang.factory.simplefactory.creator.NYPizzaStore;
import io.robinwang.factory.simplefactory.creator.PizzaStore;
import io.robinwang.factory.simplefactory.product.Pizza;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore=new NYPizzaStore();
        PizzaStore chicagoStore=new ChicagoPizzaStore();

        Pizza pizza=nyStore.orderPizza(PIZZA_TYPE.CHEESE);
        System.out.printf("Ethan order a "+pizza.getName()+"\n");

        pizza=chicagoStore.orderPizza(PIZZA_TYPE.PEPPER);
        System.out.printf("Joel order a "+pizza.getName()+"\n");
    }
}
