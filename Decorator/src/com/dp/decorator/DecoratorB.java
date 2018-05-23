package com.dp.decorator;

public class DecoratorB extends Decorator{

    public DecoratorB(IDecorated decorated){
        super(decorated);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("decoratorB print ...");
    }

}
