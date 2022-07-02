package practice;

import practice.behabior.Impl.RunWithTongueImpl;
import practice.behabior.Impl.SwimFastImpl;
import practice.behabior.RunBehavior;

public class DogSalt extends Dog {

    // 소금Dog의 인스턴스가 만들어질때,
    // Dog 로 부터 상속받은 runBehavior 인스턴스 변수에 RunWithTongueImpl 형식의 새로운 인스턴스를 대입한다
    // swimBehavior 인스턴스 변수 또한 SwimFastImpl 형식의 새로운 인스턴스를 대입한다
    public DogSalt() {
        runBehavior = new RunWithTongueImpl();
        swimBehavior = new SwimFastImpl();
    }

    @Override
    public void 나타내댜() {
        System.out.println("소금이는 흰색이다");
    }
}
