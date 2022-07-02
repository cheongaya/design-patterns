package example;

import example.behavior.impl.FlyNoWay;
import example.behavior.impl.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("저는 모형오리 입니다");
    }
}
