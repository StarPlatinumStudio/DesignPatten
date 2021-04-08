package io.robinwang.factory.simplefactory.creator;

import io.robinwang.factory.simplefactory.PIZZA_TYPE;
import io.robinwang.factory.simplefactory.product.Pizza;

public abstract class PizzaStore {

    //
    protected abstract Pizza createPizza(PIZZA_TYPE type);

    /**
     * ⬆使用到️子类实现createPizza的返回值Pizza
     * 创建者类
     *  orderPizza处理对象实例化,和createPizza做了隔离
     *  这，就是解耦！（decouple）
     * @param type
     * @return Pizza
     */
    public Pizza orderPizza(PIZZA_TYPE type){
        Pizza pizza=createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
