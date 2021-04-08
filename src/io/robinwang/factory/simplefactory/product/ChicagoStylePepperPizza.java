package io.robinwang.factory.simplefactory.product;

public class ChicagoStylePepperPizza extends Pizza{
    public ChicagoStylePepperPizza() {
        name = "ChicagoStylePepperPizza";
        dough = "Extra Thick Crust Dough";
        sauce= "Plum Tomato Sauce";
        toppings.add("Mozzarella Pepper");
    }

    @Override
    public void cut() {
        System.out.printf("Cutting the pizza into square slices");
    }
}
