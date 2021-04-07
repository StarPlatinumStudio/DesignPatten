package io.robinwang.decorator.starbuzz.condiment;

import io.robinwang.decorator.starbuzz.beverage.Beverage;

public class Soy extends CondimentDecorator{
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .15+ beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",豆浆";
    }
}
