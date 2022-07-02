package example;

import example.behavior.FlyBehavior;
import example.behavior.QuackBehavior;

public abstract class Duck {

    // 행동 인터페이스 형식의 레퍼런스 변수 2개를 선언한다. 서브클래스는 이 변수를 상속받는다.
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void Duck() {}

    public abstract void display();

    public void performFly() {
        flyBehavior.fly(); // 행동 클래스에 위임한다
    }

    public void performQuack() {
        quackBehavior.quack(); // 행동 클래스에 위임한다
    }

    public void swim() {
        System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
