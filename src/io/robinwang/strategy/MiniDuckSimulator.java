package io.robinwang.strategy;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard=new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        Duck model=new ModelDuck();
        model.performFly();
        //策略模式
        //组合 composition 不通过继承实现复用
        //运行时拓展，比编译时期的继承威力更大！
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}