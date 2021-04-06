package io.robinwang.strategy;

public abstract class Duck {
    //  声明应用变量
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck(){}

    public abstract void display();

    //  委托(delegate)给行为类
    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior=fb;
    }
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior=qb;
    }
    public void swim(){
        System.out.println("All ducks float!");
    }
}