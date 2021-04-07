package io.robinwang.decorator.starbuzz.condiment;

import io.robinwang.decorator.starbuzz.beverage.Beverage;

public class Mocha extends CondimentDecorator{
    Beverage beverage;
    public Mocha(Beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",摩卡";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
