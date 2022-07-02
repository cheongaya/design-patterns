package example.behavior;

import example.behavior.impl.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("조용~");
    }
}
