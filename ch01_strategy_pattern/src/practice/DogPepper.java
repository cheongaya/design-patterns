package practice;

import practice.behabior.Impl.RunNoWayImpl;
import practice.behabior.Impl.RunWithTongueImpl;
import practice.behabior.Impl.SwimFastImpl;
import practice.behabior.Impl.SwimSlowImpl;

public class DogPepper extends Dog {

    public DogPepper() {
        runBehavior = new RunNoWayImpl();
        swimBehavior = new SwimSlowImpl();
    }

    @Override
    public void 나타내댜() {
        System.out.println("후추는 검정색이다");
    }
}
