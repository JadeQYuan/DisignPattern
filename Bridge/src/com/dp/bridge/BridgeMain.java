package com.dp.bridge;

public class BridgeMain {

    public static void main(String[] args) {
        Abstraction abstraction = new ConcreteAbstraction(new ImplementorA());
        abstraction.print();
        abstraction = new ConcreteAbstraction(new ImplementorB());
        abstraction.print();
    }

}
