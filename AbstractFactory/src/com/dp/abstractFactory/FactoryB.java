package com.dp.abstractFactory;

public class FactoryB extends AbstractFactory {

    @Override
    public Product1 create1() {
        return new ProductB1();
    }

    @Override
    public Product2 create2() {
        return new ProductB2();
    }
}
