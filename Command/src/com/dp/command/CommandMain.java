package com.dp.command;

public class CommandMain {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Invoker invoker = new Invoker(new ConcreteCommandA(receiver), new ConcreteCommandB(receiver));
        invoker.orderA();
        invoker.orderB();
    }

}
