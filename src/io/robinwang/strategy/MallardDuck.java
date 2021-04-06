package io.robinwang.strategy;

/**
 *  绿头鸭
 * @author  RobinWang
 * @date 2021年4月3日 上午
 */
public class MallardDuck extends Duck{
    public MallardDuck() {
        quackBehavior=new Quack();
        flyBehavior=new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck!");
    }
}
