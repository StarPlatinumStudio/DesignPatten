package io.robinwang.decorator.starbuzz.beverage;

//具体组件
public class HouseBlend extends Beverage{
    public HouseBlend(){
        description="星巴滋®首选咖啡";
    }
    public double cost() {
        return .89;
    }
}
