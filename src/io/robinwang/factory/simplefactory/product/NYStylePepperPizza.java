package io.robinwang.factory.simplefactory.product;

public class NYStylePepperPizza extends Pizza{
    public NYStylePepperPizza(){
        name = "NYStylePepperPizza";
        dough="Thin Pepper Dough";
        sauce="Pepper Sauce";
        toppings.add("Grated Pepper Cheese");
    }
}
