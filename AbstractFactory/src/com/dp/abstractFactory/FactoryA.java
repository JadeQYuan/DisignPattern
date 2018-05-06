package com.dp.abstractFactory;

public class FactoryA extends AbstractFactory{

    @Override
    public Product1 create1() {
        return new ProductA1();
    }

    @Override
    public Product2 create2() {
        return new ProductA2();
    }
}
