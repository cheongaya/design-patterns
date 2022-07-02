package practice;

import practice.behabior.Impl.RunWithTongueImpl;

public class Main {
    public static void main(String[] args) {
        Dog dogSalt = new DogSalt();
        dogSalt.performRun();
        dogSalt.performSwim();

        Dog dogPepper = new DogPepper();
        dogPepper.performRun();
        dogPepper.setRunBehavior(new RunWithTongueImpl());
        dogPepper.performRun();
        dogPepper.performSwim();
    }
}
