package strategy;

import strategy.*;

public class Main {
    public static void main(String[] args) {
        Function1Behaviour function1BehaviourA = new Function1BehaviourA();
        Function1Behaviour function1BehaviourB = new Function1BehaviourB();
        Function2Behaviour function2BehaviourA = new Function2BehaviourA();
        Function2Behaviour function2BehaviourB = new Function2BehaviourB();
        Car car = new Car1(function1BehaviourA, function2BehaviourA);
        car.useFunction1();
        car.function1Behaviour = function1BehaviourB;
        car.useFunction1();

    }
}
