package com.dp.decorator;

public class DecoratorA extends Decorator{

    public DecoratorA(IDecorated decorated){
        super(decorated);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("decoratorA print ...");
    }

}
