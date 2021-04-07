package io.robinwang.decorator.starbuzz.condiment;

import io.robinwang.decorator.starbuzz.beverage.Beverage;

//Decorator 抽象装饰者类
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
