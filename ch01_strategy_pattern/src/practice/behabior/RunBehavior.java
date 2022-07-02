package practice.behabior;

public interface RunBehavior {
    // 인터페이스는 내부의 모든 필드가
    // 1. public static final 로 정의되고
    // 2. static 과 default 메서드 이외 모든 메서드는 public abstract 로 정의된다.

     public static final int maxTime = 10;
    public abstract void 뛰다();
}
