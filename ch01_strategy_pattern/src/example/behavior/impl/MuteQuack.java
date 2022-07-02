package example.behavior.impl;

import example.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("조용~");
    }
}
