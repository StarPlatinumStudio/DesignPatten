package io.robinwang.factory.simplefactory.product;

public class NYStyleCheesePizza extends Pizza{
    public NYStyleCheesePizza(){
        name = "NYStyleCheesePizza";
        dough="Thin Cruse Dough";
        sauce="Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
