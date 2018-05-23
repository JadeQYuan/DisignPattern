package com.dp.decorator;

public class DecoratorMain {

    public static void main(String[] args) {
        IDecorated decorated = new Decorated();
        Decorator decorator = new DecoratorA(decorated);
        decorator.print();
        decorator = new DecoratorB(new DecoratorA(decorated));
        decorator.print();
    }

}
