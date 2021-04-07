package io.robinwang.decorator.starbuzz.beverage;

public class DarkRoast extends Beverage{
    public DarkRoast() {
        description="深度烘培";
    }

    @Override
    public double cost() {
        return .99;
    }
}
