package io.robinwang.factory.simplefactory.product;

public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza() {
        name = "ChicagoStyleCheesePizza";
        dough = "Extra Thick Crust Dough";
        sauce= "Plum Tomato Sauce";
        toppings.add("Mozzarella Cheese");
    }

    @Override
    public void cut() {
        System.out.printf("Cutting the pizza into square slices");
    }
}
