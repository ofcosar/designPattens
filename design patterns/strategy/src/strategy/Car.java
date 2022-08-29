package strategy;

public class Car {
    Function2Behaviour function2Behaviour;
    Function1Behaviour function1Behaviour;
    public Car(Function1Behaviour function1Behaviour, Function2Behaviour function2Behaviour){
        this.function1Behaviour = function1Behaviour;
        this.function2Behaviour = function2Behaviour;
    }
    void useFunction1(){
        function1Behaviour.useFunction1();
    }
    void useFunction2(){
        function2Behaviour.useFunction2();
    }

}
