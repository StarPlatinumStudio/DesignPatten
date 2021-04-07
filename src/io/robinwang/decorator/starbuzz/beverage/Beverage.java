package io.robinwang.decorator.starbuzz.beverage;

//抽象组件
//饮料基类
public abstract class Beverage {
    //Set description
    String description = "Unknown Beverage";
    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
