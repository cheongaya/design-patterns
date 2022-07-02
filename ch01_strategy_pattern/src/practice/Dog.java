package practice;

import practice.behabior.RunBehavior;
import practice.behabior.SwimBehavior;

public abstract class Dog {

    // 인터페이스 형식의 인스턴스 변수를 추가한다
    RunBehavior runBehavior;
    SwimBehavior swimBehavior;

    public void 짖다(){
        System.out.println("강아지는 짓는다");
    }

    public void 먹다(){
        System.out.println("강아지는 먹는다");
    }

    public abstract void 나타내댜();

    // 뛰는 행동을 직접 처리하는 대신, Behavior 로 참조되는 객체에 행동을 위임한다
    public void performRun() {
        runBehavior.뛰다();
    }
    public void performSwim() {
        swimBehavior.수영하다();
    }

    // 세터 메소드를 만든다
    public void setRunBehavior(RunBehavior rb) {
        this.runBehavior = rb;
    }
    public void setSwimBehavior(SwimBehavior sb) {
        this.swimBehavior = sb;
    }
}
