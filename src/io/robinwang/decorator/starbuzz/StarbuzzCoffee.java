package io.robinwang.decorator.starbuzz;

import io.robinwang.decorator.starbuzz.beverage.Beverage;
import io.robinwang.decorator.starbuzz.beverage.DarkRoast;
import io.robinwang.decorator.starbuzz.beverage.Espresso;
import io.robinwang.decorator.starbuzz.beverage.HouseBlend;
import io.robinwang.decorator.starbuzz.condiment.Mocha;
import io.robinwang.decorator.starbuzz.condiment.Soy;
import io.robinwang.decorator.starbuzz.condiment.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+"$"+beverage.cost());

        Beverage beverage1=new DarkRoast();
        beverage1=new Mocha(beverage1);
        beverage1=new Mocha(beverage1);
        beverage1=new Whip(beverage1);
        System.out.println(beverage1.getDescription()+"$"+beverage1.cost());

        Beverage beverage2=new HouseBlend();
        beverage2=new Soy(beverage2);
        beverage2=new Mocha(beverage2);
        beverage2=new Whip(beverage2);
        System.out.println(beverage2.getDescription()+"$"+beverage2.cost());

    }
}
