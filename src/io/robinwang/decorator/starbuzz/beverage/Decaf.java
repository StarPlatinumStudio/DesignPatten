package io.robinwang.decorator.starbuzz.beverage;

public class Decaf extends Beverage{
    public Decaf() {
        description="低咖啡因";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
